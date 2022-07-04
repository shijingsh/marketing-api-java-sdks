package com.hyq0719.spring.starter.mktapi.production.config;

import com.hyq0719.mktapi.common.executor.http.OkhttpHttpHandler;
import com.hyq0719.mktapi.common.token.cache.ITokenLocalCache;
import com.hyq0719.mktapi.kuaishou.KshApiClient;
import com.hyq0719.mktapi.kuaishou.KshRetryStrategy;
import com.hyq0719.mktapi.kuaishou.service.KshSdkService;
import com.hyq0719.mktapi.kuaishou.token.KshExternalTokenService;
import com.hyq0719.spring.starter.mktapi.production.properties.SdkProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
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
public class KshAutoConfiguration  {


  @Bean
  @ConditionalOnMissingBean
  public KshSdkService kshSdkService(KshApiClient kshApiClient, KshRetryStrategy kshRetryStrategy) {
    log.info("SDK bulid KshSdkService, kshApiClient:{},kshRetryStrategy:{}", kshApiClient, kshRetryStrategy);
    return new KshSdkService(kshApiClient, kshRetryStrategy);
  }

  @Bean
  public KshRetryStrategy kshRetryStrategy(SdkProperties sdkProperties) {
    KshRetryStrategy kshRetryStrategy = new KshRetryStrategy();
    SdkProperties.ChannelConfig kuaishou = sdkProperties.getKuaishou();
    if (kuaishou == null) {
      throw new RuntimeException("kuaishou properties is null");
    }
    kshRetryStrategy.setRetryCount(kuaishou.getRetryCount());
    kshRetryStrategy.setEnable(kuaishou.getEnableRetry());
    return kshRetryStrategy;
  }

  @Bean
  public ITokenLocalCache kuaishouCache() {
    return new ITokenLocalCache();
  }

  @Bean
  @ConditionalOnMissingBean
  public KshApiClient kshApiClient(OkhttpHttpHandler okhttpRequestHandler,
                                  KshExternalTokenService kshExternalTokenService) {
    if (okhttpRequestHandler == null) {
      throw new RuntimeException("kuaishou RequestHandler is null");
    }
    if (kshExternalTokenService == null) {
      throw new RuntimeException("KshExternalTokenService is null");
    }
    return new KshApiClient(kuaishouCache(), okhttpRequestHandler, kshExternalTokenService);
  }

}
