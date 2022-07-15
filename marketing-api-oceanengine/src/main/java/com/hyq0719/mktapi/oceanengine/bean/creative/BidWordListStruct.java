package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class BidWordListStruct implements IBean {
  @SerializedName("default_word")
  private String defaultWord = null;

  public BidWordListStruct defaultWord(String defaultWord) {
    this.defaultWord = defaultWord;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
