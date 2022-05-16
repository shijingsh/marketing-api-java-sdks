package test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import test.util.RedisClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication(scanBasePackages = {"test"})
public class MarketingApiTestApp {

  public static void main(String[] args) throws UnknownHostException {

    ConfigurableApplicationContext application = SpringApplication.run(MarketingApiTestApp.class, args);

    Environment env = application.getEnvironment();
    log.info("\n----------------------------------------------------------\n\t" +
        "Application '{}' is running! Access URLs:\n\t" +
        //"Login: \thttp://{}:{}/login\n\t" +
        //"Doc: \thttp://{}:{}/doc.html\n" +
        "Doc: \thttp://{}:{}/swagger-ui.html\n" +
        "----------------------------------------------------------",
      env.getProperty("spring.application.name"),
      InetAddress.getLocalHost().getHostAddress(),
      env.getProperty("server.port"),
      InetAddress.getLocalHost().getHostAddress(),
      env.getProperty("server.port"));
  }

  @Bean(destroyMethod = "close")
  public RedisClient redisClient(AppProperties appProp) {
    AppProperties.RedisClientProperties redisProp = appProp.getRedisClient();
    RedisClient redisClient = new RedisClient(redisProp);
    log.info("Connected to redis {}", redisProp);
    return redisClient;
  }
}
