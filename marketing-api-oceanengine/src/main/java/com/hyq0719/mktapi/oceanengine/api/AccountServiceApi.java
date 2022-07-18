package com.hyq0719.mktapi.oceanengine.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.oceanengine.OceanApiRequest;
import com.hyq0719.mktapi.oceanengine.bean.advertiser.*;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanRequest;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanResponse;
import com.hyq0719.mktapi.oceanengine.bean.common.PageResponseData;

import java.util.List;

public class AccountServiceApi extends AbstractOceanApi {
  /**
   * 纵横组织和账号管理
   */
  private volatile MajordomoAdvertiserSelect majordomoAdvertiserSelect;
  /**
   * 资金和流水管理
   */
  private volatile AdvertiserFundGet advertiserFundGet;
  private volatile AdvertiserFundDailyStat advertiserFundDailyStat;
  /**
   * 广告主信息
   */
  private volatile AdvertiserGet advertiserGet;

  public AccountServiceApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public MajordomoAdvertiserSelect majordomoAdvertiserSelect() {
    if (majordomoAdvertiserSelect == null) {
      synchronized (MajordomoAdvertiserSelect.class) {
        if (majordomoAdvertiserSelect == null) {
          majordomoAdvertiserSelect = (MajordomoAdvertiserSelect) init(MajordomoAdvertiserSelect.class);
        }
      }
    }
    return majordomoAdvertiserSelect;
  }

  public AdvertiserFundGet advertiserFundGet() {
    if (advertiserFundGet == null) {
      synchronized (AdvertiserFundGet.class) {
        if (advertiserFundGet == null) {
          advertiserFundGet = (AdvertiserFundGet) init(AdvertiserFundGet.class);
        }
      }
    }
    return advertiserFundGet;
  }

  public AdvertiserFundDailyStat advertiserFundDailyStat() {
    if (advertiserFundDailyStat == null) {
      synchronized (AdvertiserFundDailyStat.class) {
        if (advertiserFundDailyStat == null) {
          advertiserFundDailyStat = (AdvertiserFundDailyStat) init(AdvertiserFundDailyStat.class);
        }
      }
    }
    return advertiserFundDailyStat;
  }


  public AdvertiserGet advertiserGet() {
    if (advertiserGet == null) {
      synchronized (AdvertiserFundGet.class) {
        if (advertiserGet == null) {
          advertiserGet = (AdvertiserGet) init(AdvertiserGet.class);
        }
      }
    }
    return advertiserGet;
  }

  @ApiRequestMapping(value = "/majordomo/advertiser/select/", method = RequestConstants.GET, usePostBody =
    false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class MajordomoAdvertiserSelect
    extends OceanApiRequest<OceanRequest, OceanResponse<PageResponseData<MajordomoAdvertiserSelectStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                OceanRequest oceanRequest) {
      Long advertiserId = oceanRequest.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/advertiser/fund/get/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AdvertiserFundGet extends OceanApiRequest<OceanRequest, OceanResponse<AdvertiserFundGetStruct>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                OceanRequest oceanRequest) {
      Long advertiserId = oceanRequest.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/advertiser/fund/daily_stat/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AdvertiserFundDailyStat extends OceanApiRequest<AdvertiserFundDailyStatRequest,
    OceanResponse<PageResponseData<AdvertiserFundDailyStatReponseStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdvertiserFundDailyStatRequest advertiserFundDailyStatRequest) {
      Long advertiserId = advertiserFundDailyStatRequest.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      String startDate = advertiserFundDailyStatRequest.getStartDate();
      if (startDate != null) {
        localVarQueryParams.addAll(parameterToPair(START_DATE, startDate));
      }
      String endDate = advertiserFundDailyStatRequest.getEndDate();
      if (endDate != null) {
        localVarQueryParams.addAll(parameterToPair(END_DATE, endDate));
      }
      Long page = advertiserFundDailyStatRequest.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = advertiserFundDailyStatRequest.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
    }
  }

  @ApiRequestMapping(value = "/advertiser/info/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AdvertiserGet extends OceanApiRequest<AdvertiserInfoRequest, OceanResponse<AdvertiserInfoResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdvertiserInfoRequest oceanRequest) {
      List<Long> advertiserId = oceanRequest.getAdvertiserIds();
      if (advertiserId != null && advertiserId.size()>0) {
        localVarQueryParams.addAll(parameterToPairs("multi","advertiser_ids", advertiserId));
      }
    }
  }

}
