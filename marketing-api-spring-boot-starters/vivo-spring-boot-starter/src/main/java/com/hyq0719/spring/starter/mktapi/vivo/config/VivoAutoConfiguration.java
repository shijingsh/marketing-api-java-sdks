package com.hyq0719.spring.starter.mktapi.vivo.config;

import com.hyq0719.mktapi.common.executor.http.OkhttpHttpHandler;
import com.hyq0719.mktapi.common.token.cache.ITokenLocalCache;
import com.hyq0719.mktapi.vivo.VivoApiClient;
import com.hyq0719.mktapi.vivo.VivoRetryStrategy;
import com.hyq0719.mktapi.vivo.service.VivoSdkService;
import com.hyq0719.mktapi.vivo.token.VivoExternalTokenService;
import com.hyq0719.spring.starter.mktapi.vivo.properties.SdkProperties;
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
public class VivoAutoConfiguration{


  @Bean
  @ConditionalOnMissingBean
  public VivoSdkService vivoSdkService(VivoApiClient vivoApiClient, VivoRetryStrategy vivoRetryStrategy) {
    log.info("SDK bulid vivoSdkService, vivoApiClient:{}, vivoRetryStrategy:{}", vivoApiClient, vivoRetryStrategy);
    return new VivoSdkService(vivoApiClient, vivoRetryStrategy);
  }

  @Bean
  public VivoRetryStrategy vivoRetryStrategy(SdkProperties sdkProperties) {
    VivoRetryStrategy vivoRetryStrategy = new VivoRetryStrategy();
    SdkProperties.ChannelConfig vivo = sdkProperties.getVivo();
    if (vivo == null) {
      throw new RuntimeException("vivo properties is null");
    }
    vivoRetryStrategy.setRetryCount(vivo.getRetryCount());
    vivoRetryStrategy.setEnable(vivo.getEnableRetry());
    return vivoRetryStrategy;
  }


  @Bean
  public ITokenLocalCache vivoCache() {
    return new ITokenLocalCache();
  }

  @Bean
  @ConditionalOnMissingBean
  public VivoApiClient vivoApiClient(OkhttpHttpHandler httpsClient,
                                     VivoExternalTokenService vivoExternalTokenService) {
    if (httpsClient == null) {
      throw new RuntimeException("vivo RequestHandler is null");
    }
    if (vivoExternalTokenService == null) {
      throw new RuntimeException("VivoExternalTokenService is null");
    }
    VivoApiClient vivoApiClient = new VivoApiClient(vivoCache(), httpsClient, vivoExternalTokenService);
    return vivoApiClient;
  }

}
