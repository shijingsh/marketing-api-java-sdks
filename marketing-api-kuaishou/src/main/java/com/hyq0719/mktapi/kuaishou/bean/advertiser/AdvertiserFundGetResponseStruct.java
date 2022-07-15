package com.hyq0719.mktapi.kuaishou.bean.advertiser;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class AdvertiserFundGetResponseStruct implements IBean {
  @SerializedName("balance")
  private Double balance = null;


  public AdvertiserFundGetResponseStruct balance(Double balance) {
    this.balance = balance;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
