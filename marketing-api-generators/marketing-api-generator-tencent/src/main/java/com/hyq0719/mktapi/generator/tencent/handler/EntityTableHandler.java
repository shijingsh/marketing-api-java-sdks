package com.hyq0719.mktapi.generator.tencent.handler;

import com.hyq0719.mktapi.generator.tencent.entity.BaseEntity;
import com.hyq0719.mktapi.generator.tencent.entity.CrawlerResult;
import com.hyq0719.mktapi.generator.tencent.util.GeneratorUtils;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntityTableHandler {
  public static int requestTableLoc = 2;
  public static int responseTableLoc = 3;

  public static void setRequestTableLoc(int requestTableLoc) {
    EntityTableHandler.requestTableLoc = requestTableLoc;
  }

  public static void setResponseTableLoc(int responseTableLoc) {
    EntityTableHandler.responseTableLoc = responseTableLoc;
  }

  public static Map<String, List<BaseEntity>> handleByLocation(WebDriver driver, String className,
                                                               int tableLocation) {
    List<WebElement> tableElements = driver.findElements(By.tagName("table"));
    if (tableElements.size() < tableLocation) {
      throw new RuntimeException("Crawler <table> size error");
    }
    WebElement tbody = tableElements.get(tableLocation - 1).findElement(By.tagName("tbody"));
    List<TableElement> defaultTableElements = parseTableElements(tbody);
    return parseDefaultElements(defaultTableElements, className);

  }

  public static CrawlerResult handleRequestAndResponse(WebDriver driver) {
    CrawlerResult crawlerResult = new CrawlerResult();


    List<WebElement> tableElements = driver.findElements(By.tagName("table"));
    if (tableElements.size() < Math.max(requestTableLoc, responseTableLoc)) {
      throw new RuntimeException("Crawler <table> size error");
    }

    String requestUrl = "";
    try {
      requestUrl = tableElements.get(0).findElement(By.tagName("tbody")).findElements(By.tagName("tr"))
        .get(1).findElements(By.tagName("td")).get(1).getText().trim();
    } catch (NullPointerException e) {
      e.printStackTrace();
    }
    String entityPrefix = GeneratorUtils.urlToEntityPrefix(requestUrl);
    crawlerResult.setClassPrefix(entityPrefix);

    if (requestTableLoc != -1) {
      WebElement requestTbody = tableElements.get(requestTableLoc).findElement(By.tagName("tbody"));
      List<TableElement> requestTableElements = parseTableElements(requestTbody);
      crawlerResult.setRequestEntityMap(parseRequestElements(requestTableElements, entityPrefix));
    } else {
      String entityRequestName = entityPrefix + "Request";
      Map<String, List<BaseEntity>> requestMap = new HashMap<>(16);
      requestMap.computeIfAbsent(entityRequestName, k -> new ArrayList<>());
      crawlerResult.setRequestEntityMap(requestMap);
    }

    WebElement responseTbody = tableElements.get(responseTableLoc).findElement(By.tagName("tbody"));
    List<TableElement> responseTableElements = parseTableElements(responseTbody);
    crawlerResult.setResponseEntityMap(parseResponseElements(responseTableElements, entityPrefix));

    return crawlerResult;
  }

  public static Map<String, List<BaseEntity>> parseDefaultElements(List<TableElement> tableElements,
                                                                   String className) {
    Stack<TableElement> stack = new Stack<>();
    stack.push(new TableElement(className, "object", className, -1));
    Map<String, List<BaseEntity>> map = new HashMap<>(16);
    map.computeIfAbsent(className, k -> new ArrayList<>());
    parseLevelList(tableElements, stack, map);
    return map;
  }

  public static Map<String, List<BaseEntity>> parseRequestElements(List<TableElement> requestTableElements,
                                                                   String entityPrefix) {
    String entityRequestName = entityPrefix + "Request";
    Stack<TableElement> stack = new Stack<>();
    stack.push(new TableElement(entityRequestName, "object", entityRequestName, -1));

    Map<String, List<BaseEntity>> requestMap = new HashMap<>(16);
    requestMap.computeIfAbsent(entityRequestName, k -> new ArrayList<>());
    parseLevelList(requestTableElements, stack, requestMap);
    return requestMap;
  }

  public static Map<String, List<BaseEntity>> parseResponseElements(List<TableElement> responseTableElements,
                                                                    String entityPrefix) {
    String entityResponseName = entityPrefix + "ResponseData";
    Stack<TableElement> stack = new Stack<>();
    stack.push(new TableElement(entityResponseName, "object", entityResponseName, -1));

    Map<String, List<BaseEntity>> responseMap = new HashMap<>(16);
    responseMap.computeIfAbsent(entityResponseName, k -> new ArrayList<>());

    parseLevelList(responseTableElements, stack, responseMap);
    return responseMap;
  }

  public static List<TableElement> parseTableElements(WebElement tbody) {
    List<TableElement> tableElements = new ArrayList<>();
    List<WebElement> trElements = tbody.findElements(By.tagName("tr"));

    trElements.forEach(webElement -> {
      List<WebElement> tdElements = webElement.findElements(By.tagName("td"));
      String dataClassName = tdElements.get(0).getAttribute("class");
      int dataLevel = 0;
      if (!StringUtils.isEmpty(dataClassName)) {
        dataLevel = getDataLevel(dataClassName);
      }
      TableElement tableElement = getTableElement(tdElements, dataLevel);
      if (tableElement == null) {
        return;
      }
      tableElements.add(tableElement);
    });
    return tableElements;
  }

  public static void parseLevelList(List<TableElement> requestTableElements, Stack<TableElement> stack,
                                    Map<String, List<BaseEntity>> map) {
    TableElement lastElement = requestTableElements.get(0);
    for (TableElement tableElement : requestTableElements) {
      TableElement peek = stack.peek();
      if (peek == null) {
        break;
      }
      int stackLevel = peek.getLevel();
      if (tableElement.getLevel() - 1 > stackLevel) {
        map.computeIfAbsent(lastElement.getPropertyName(), k -> new ArrayList<>());
        stack.push(new TableElement(lastElement.getPropertyName(), "object", lastElement.getDescription(),
          lastElement.getLevel()));
      } else if (stackLevel >= tableElement.getLevel()) {
        while (stackLevel != tableElement.getLevel() - 1) {
          if (stack.pop() == null) {
            break;
          }
          stackLevel--;
        }
      }
      peek = stack.peek();
      if (peek == null) {
        break;
      }
      String className = peek.getPropertyName();
      map.get(className).add(getBaseEntity(tableElement));
      lastElement = tableElement;
    }
  }

  public static BaseEntity getBaseEntity(TableElement tableElement) {
    String snakeProperty = tableElement.getPropertyName();
    String camelProperty = GeneratorUtils.snakeToCamel(snakeProperty);
    String description = tableElement.getDescription();
    String type = tableElement.getType();
    return new BaseEntity(snakeProperty, camelProperty, description, type);
  }

  public static TableElement getTableElement(List<WebElement> tdElements, int level) {
    if (tdElements.size() < 2) {
      return null;
    }
    String property = tdElements.get(0).getText().replace("*", "").trim();
    String type = tdElements.get(1).getText().trim();
    String description = "";
    if(includeChinese(type)){
      //类型中存在汉字，说明是描述
      if(tdElements.size()>1){
        description = tdElements.get(1).getText()
          .replace("\n", " ").trim();
      }
      if (description.length() > 100) {//注释限制长度
        description = description.substring(0, 100) + "...";
      }
      type = getParamType(type);
    }else{
      if(tdElements.size()>2){
        description = tdElements.get(2).getText()
          .replace("\n", " ").trim();
      }
      if (description.length() > 100) {//注释限制长度
        description = description.substring(0, 100) + "...";
      }
    }


    return new TableElement(property, type, description, level);
  }

  public static boolean includeChinese (String type){

    String pattern = "[\\u4e00-\\u9fa5]";

    Pattern r = Pattern.compile(pattern);
    Matcher m = r.matcher(type);
    System.out.println(m.matches());

    return m.find();
  }

  public static String getParamType(String property) {
    switch (property) {
      case "fields":
        return "List<String>";
      case "level-three":
        return "2";
      case "level-four":
        return "3";
      default:
        return "String";
    }
  }

  public static int getDataLevel(String dataClassName) {
    switch (dataClassName) {
      case "level-two":
        return 1;
      case "level-three":
        return 2;
      case "level-four":
        return 3;
      default:
        return 0;
    }
  }

  @Data
  public static class TableElement {
    private String propertyName;
    private String type;
    private String description;
    private int level;

    public TableElement(String propertyName, String type, String description, int level) {
      this.propertyName = propertyName;
      this.type = type;
      this.description = description;
      this.level = level;
    }
  }
}
