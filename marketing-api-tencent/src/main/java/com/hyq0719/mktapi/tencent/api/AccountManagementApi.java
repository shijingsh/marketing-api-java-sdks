package com.hyq0719.mktapi.tencent.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.tencent.TencentApiRequest;
import com.hyq0719.mktapi.tencent.TencentDefaultFields;
import com.hyq0719.mktapi.tencent.bean.account.adAccount.AdvertiserGetListStruct;
import com.hyq0719.mktapi.tencent.bean.account.adAccount.BusinessManagerRelationsGetListStruct;
import com.hyq0719.mktapi.tencent.bean.account.adAccount.BusinessManagerRelationsGetRequest;
import com.hyq0719.mktapi.tencent.bean.account.funds.FundsGetListStruct;
import com.hyq0719.mktapi.tencent.bean.account.funds.WechatFundsGetResponseData;
import com.hyq0719.mktapi.tencent.bean.common.ListResponse;
import com.hyq0719.mktapi.tencent.bean.common.PageResponseData;
import com.hyq0719.mktapi.tencent.bean.common.TencentRequest;
import com.hyq0719.mktapi.tencent.bean.common.TencentResponse;

import java.util.List;

/**
 * 腾讯广告——账号管理api
 */
public class AccountManagementApi extends AbstractTencentApi {
  /**
   * 广告账号
   */
  private volatile BusinessManagerRelationsGet businessManagerRelationsGet;
  /**
   * 资金账户
   */
  private volatile FundsGet fundsGet;
  private volatile WechatFundsGet wechatFundsGet;
  private volatile AdvertiserGet advertiserGet;

  public AccountManagementApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public BusinessManagerRelationsGet businessManagerRelationsGet() {
    if (businessManagerRelationsGet == null) {
      synchronized (BusinessManagerRelationsGet.class) {
        if (businessManagerRelationsGet == null) {
          businessManagerRelationsGet = (BusinessManagerRelationsGet) init(BusinessManagerRelationsGet.class);
        }
      }
    }
    return businessManagerRelationsGet;
  }

  public FundsGet fundsGet() {
    if (fundsGet == null) {
      synchronized (FundsGet.class) {
        if (fundsGet == null) {
          fundsGet = (FundsGet) init(FundsGet.class);
        }
      }
    }
    return fundsGet;
  }

  public WechatFundsGet wechatFundsGet() {
    if (wechatFundsGet == null) {
      synchronized (WechatFundsGet.class) {
        if (wechatFundsGet == null) {
          wechatFundsGet = (WechatFundsGet) init(WechatFundsGet.class);
        }
      }
    }
    return wechatFundsGet;
  }


  public AdvertiserGet advertiserGet() {
    if (advertiserGet == null) {
      synchronized (AdvertiserGet.class) {
        if (advertiserGet == null) {
          advertiserGet = (AdvertiserGet) init(AdvertiserGet.class);
        }
      }
    }
    return advertiserGet;
  }

  @ApiRequestMapping(value = "/business_manager_relations/get", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {
      RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class BusinessManagerRelationsGet extends TencentApiRequest<BusinessManagerRelationsGetRequest,
    TencentResponse<PageResponseData<BusinessManagerRelationsGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                BusinessManagerRelationsGetRequest request) {
      Integer page = request.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair("page", page));
      }
      Integer pageSize = request.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair("page_size", pageSize));
      }
      Integer advertiserType = request.getAdvertiserType();
      if (advertiserType != null) {
        localVarQueryParams.addAll(parameterToPair("advertiser_type", advertiserType));
      }
    }
  }

  @ApiRequestMapping(value = "/funds/get", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {
      RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class FundsGet extends TencentApiRequest<TencentRequest, TencentResponse<ListResponse<FundsGetListStruct>>> {

    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                TencentRequest request) {
      Long accountId = request.getAccountId();
      List<String> fields = request.getFields();
      if (accountId != null) {
        localVarQueryParams.addAll(parameterToPair(ACCOUNT_ID, accountId));
      }
      if (fields == null || fields.isEmpty()) {
        fields = TencentDefaultFields.BASE_FUND_GET_FIEDS;
      }
      localVarCollectionQueryParams.addAll(parameterToPairs(MULTI, "fields", fields));
    }
  }

  @ApiRequestMapping(value = "/wechat_funds/get", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class WechatFundsGet extends TencentApiRequest<TencentRequest, TencentResponse<WechatFundsGetResponseData>> {

    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                TencentRequest request) {
      Long accountId = request.getAccountId();
      List<String> fields = request.getFields();
      if (accountId != null) {
        localVarQueryParams.addAll(parameterToPair(ACCOUNT_ID, accountId));
      }
      if (fields == null || fields.isEmpty()) {
        fields = TencentDefaultFields.BASE_WECHAT_FUND_GET_FIEDS;
      }
      localVarCollectionQueryParams.addAll(parameterToPairs(MULTI, "fields", fields));
    }
  }


  @ApiRequestMapping(value = "/advertiser/get", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {
      RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AdvertiserGet extends TencentApiRequest<TencentRequest, TencentResponse<ListResponse<AdvertiserGetListStruct>>> {

    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                TencentRequest request) {
      Long accountId = request.getAccountId();
      List<String> fields = request.getFields();
      if (accountId != null) {
        localVarQueryParams.addAll(parameterToPair(ACCOUNT_ID, accountId));
      }
      if (fields == null || fields.isEmpty()) {
        fields = TencentDefaultFields.BASE_ADVERTISER_GET_FIEDS;
      }
      localVarCollectionQueryParams.addAll(parameterToPairs(MULTI, "fields", fields));
    }
  }

}
