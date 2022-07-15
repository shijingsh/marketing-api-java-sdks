package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class WordListStruct implements IBean {
  @SerializedName("word_id")
  private Long wordId = null;

  public WordListStruct wordId(Long wordId) {
    this.wordId = wordId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
