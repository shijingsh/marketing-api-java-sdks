package com.hyq0719.mktapi.common.bean;

public interface IPage extends TokenKey {
  void exchangeCurrentPage(Integer page);

  Integer currentPageSize();
}
