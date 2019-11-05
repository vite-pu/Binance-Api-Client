package com.binance.api.client.constant;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Constants used throughout Binance's API.
 */
public class BinanceApiConstants {

  private static String getWsUri() {
      String url1 = System.getProperty("bnWsUrl");
      System.out.println(url1);
      if (StringUtils.isEmpty(url1)) {
          return "wss://stream.binance.com:9443/ws";
      } else {
          return url1;
      }
  }

  private static String getRestUrl() {
      String url = System.getProperty("bnRestUrl");
      if (StringUtils.isEmpty(url)) {
          return "https://api.binance.com";
      } else {
          return url;
      }
  }

  /**
   * REST API base URL.
   */
//  public static final String API_BASE_URL = "https://api.binance.com";
  public static final String API_BASE_URL = getRestUrl();
  /**
   * Streaming API base URL.
   */
//  public static final String WS_API_BASE_URL = "wss://stream.binance.com:9443/ws";
    public static final String WS_API_BASE_URL = getWsUri();

  /**
   * Asset info base URL.
   */
//  public static final String ASSET_INFO_API_BASE_URL = "https://www.binance.com/";
  public static final String ASSET_INFO_API_BASE_URL = getRestUrl();

  /**
   * HTTP Header to be used for API-KEY authentication.
   */
  public static final String API_KEY_HEADER = "X-MBX-APIKEY";

  /**
   * Decorator to indicate that an endpoint requires an API key.
   */
  public static final String ENDPOINT_SECURITY_TYPE_APIKEY = "APIKEY";
  public static final String ENDPOINT_SECURITY_TYPE_APIKEY_HEADER = ENDPOINT_SECURITY_TYPE_APIKEY + ": #";

  /**
   * Decorator to indicate that an endpoint requires a signature.
   */
  public static final String ENDPOINT_SECURITY_TYPE_SIGNED = "SIGNED";
  public static final String ENDPOINT_SECURITY_TYPE_SIGNED_HEADER = ENDPOINT_SECURITY_TYPE_SIGNED + ": #";

  /**
   * Default receiving window.
   */
  public static final long DEFAULT_RECEIVING_WINDOW = 6_000L;
  
  /**
   * Default ToStringStyle used by toString methods. 
   * Override this to change the output format of the overridden toString methods. 
   *  - Example ToStringStyle.JSON_STYLE
   */
  public static ToStringStyle TO_STRING_BUILDER_STYLE = ToStringStyle.SHORT_PREFIX_STYLE;
}
