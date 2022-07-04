package com.hyq0719.spring.starter.mktapi.production.config;

import com.hyq0719.mktapi.common.executor.http.OkhttpHttpHandler;
import com.hyq0719.mktapi.common.token.cache.ITokenLocalCache;
import com.hyq0719.mktapi.oceanengine.OceanApiClient;
import com.hyq0719.mktapi.oceanengine.OceanRetryStrategy;
import com.hyq0719.mktapi.oceanengine.service.OceanSdkService;
import com.hyq0719.mktapi.oceanengine.token.OceanExternalTokenService;
import com.hyq0719.spring.starter.mktapi.production.properties.SdkProperties;
import com.hyq0719.spring.starter.mktapi.production.properties.SdkProperties.ChannelConfig;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties(SdkProperties.class)
@Import(HttpAutoConfiguration.class)
@Data
@Slf4j
public class OceanAutoConfiguration  {


  @Bean
  @ConditionalOnMissingBean
  public OceanSdkService oceanSdkService(OceanApiClient oceanApiClient, OceanRetryStrategy oceanRetryStrategy) {
    log.info("SDK bulid oceanSdkService, oceanApiClient:{},oceanRetryStrategy:{}", oceanApiClient, oceanRetryStrategy);
    return new OceanSdkService(oceanApiClient, oceanRetryStrategy);
  }

  @Bean
  public OceanRetryStrategy oceanRetryStrategy(SdkProperties sdkProperties) {
    OceanRetryStrategy oceanRetryStrategy = new OceanRetryStrategy();
    ChannelConfig oceanengine = sdkProperties.getOceanengine();
    if (oceanengine == null) {
      throw new RuntimeException("oceanengine properties is null");
    }
    oceanRetryStrategy.setRetryCount(oceanengine.getRetryCount());
    oceanRetryStrategy.setEnable(oceanengine.getEnableRetry());
    return oceanRetryStrategy;
  }

  @Bean
  public ITokenLocalCache oceanCache() {
    return new ITokenLocalCache();
  }

  @Bean
  @ConditionalOnMissingBean
  public OceanApiClient oceanApiClient(OkhttpHttpHandler httpsClient, OceanExternalTokenService oceanExternalTokenService) {
    if (httpsClient == null) {
      throw new RuntimeException("oceanengine RequestHandler is null");
    }
    if (oceanExternalTokenService == null) {
      throw new RuntimeException("OceanExternalTokenService is null");
    }
    return new OceanApiClient(oceanCache(), httpsClient, oceanExternalTokenService);
  }

}
