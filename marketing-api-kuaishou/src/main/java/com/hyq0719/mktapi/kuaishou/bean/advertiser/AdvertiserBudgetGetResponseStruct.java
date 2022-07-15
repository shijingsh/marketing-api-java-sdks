package com.hyq0719.mktapi.kuaishou.bean.advertiser;

import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class AdvertiserBudgetGetResponseStruct implements IBean {
  @SerializedName("day_budget")
  private Long dayBudget;

  @SerializedName("day_budget_schedule")
  private Long dayBudgetSchedule;

  public AdvertiserBudgetGetResponseStruct dayBudget(Long dayBudget) {
    this.dayBudget = dayBudget;
    return this;
  }

  public AdvertiserBudgetGetResponseStruct dayBudgetSchedule(Long dayBudgetSchedule) {
    this.dayBudgetSchedule = dayBudgetSchedule;
    return this;
  }
}
