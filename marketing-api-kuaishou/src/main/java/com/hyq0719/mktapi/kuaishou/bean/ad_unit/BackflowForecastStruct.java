package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class BackflowForecastStruct implements IBean {
  @SerializedName("backflow_cv_lower")
  private Long backflowCvLower;

  @SerializedName("backflow_cv_upper")
  private Long backflowCvUpper;

  @SerializedName("backflow_timestamp")
  private Long backflowTimestamp;
}
