package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.IPage;
import lombok.Data;

@Data
public class ReportAgentGetRequest implements IPage {
  @SerializedName("agent_id")
  private Long agentId = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("filtering")
  private ReportAgentGetFilteringStruct filtering = null;

  @SerializedName("page")
  private Long page = null;

  @SerializedName("page_size")
  private Long pageSize = null;

  public ReportAgentGetRequest agentId(Long agentId) {
    this.agentId = agentId;
    return this;
  }

  public ReportAgentGetRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public ReportAgentGetRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public ReportAgentGetRequest filtering(ReportAgentGetFilteringStruct filtering) {
    this.filtering = filtering;
    return this;
  }

  public ReportAgentGetRequest page(Long page) {
    this.page = page;
    return this;
  }

  public ReportAgentGetRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(agentId);
  }

  @Override
  public void exchangeCurrentPage(Integer page) {
    this.page = Long.valueOf(page);
  }

  @Override
  public Integer currentPageSize() {
    return Math.toIntExact(pageSize);
  }
}
