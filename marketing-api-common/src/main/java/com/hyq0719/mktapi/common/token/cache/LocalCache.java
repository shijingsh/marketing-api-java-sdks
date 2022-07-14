package com.hyq0719.mktapi.common.token.cache;

import net.jodah.expiringmap.ExpirationPolicy;
import net.jodah.expiringmap.ExpiringMap;

import java.util.concurrent.TimeUnit;

public class LocalCache<K, V> {

  /**
   * 存放token，保证线程安全
   */
 /* private Map<K, V> cache = new ConcurrentHashMap<>();
*/
  private ExpiringMap<K, V> cache = ExpiringMap.builder()
    .variableExpiration()
    .expiration(1, TimeUnit.HOURS)
    .expirationPolicy(ExpirationPolicy.CREATED)
    .build();

  /**
   * 存token
   *
   * @param key   token key
   * @param value token值
   */
  public void put(K key, V value) {
    cache.put(key, value);
  }

  /**
   * 取token
   *
   * @param key token key
   * @return token值
   */
  public V get(K key) {
    return cache.get(key);
  }
}
