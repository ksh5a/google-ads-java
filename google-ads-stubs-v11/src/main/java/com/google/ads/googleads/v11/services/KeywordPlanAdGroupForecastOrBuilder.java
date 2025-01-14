// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/keyword_plan_service.proto

package com.google.ads.googleads.v11.services;

public interface KeywordPlanAdGroupForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.KeywordPlanAdGroupForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_ad_group = 3;</code>
   * @return Whether the keywordPlanAdGroup field is set.
   */
  boolean hasKeywordPlanAdGroup();
  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_ad_group = 3;</code>
   * @return The keywordPlanAdGroup.
   */
  java.lang.String getKeywordPlanAdGroup();
  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_ad_group = 3;</code>
   * @return The bytes for keywordPlanAdGroup.
   */
  com.google.protobuf.ByteString
      getKeywordPlanAdGroupBytes();

  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.ForecastMetrics ad_group_forecast = 2;</code>
   * @return Whether the adGroupForecast field is set.
   */
  boolean hasAdGroupForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.ForecastMetrics ad_group_forecast = 2;</code>
   * @return The adGroupForecast.
   */
  com.google.ads.googleads.v11.services.ForecastMetrics getAdGroupForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.ForecastMetrics ad_group_forecast = 2;</code>
   */
  com.google.ads.googleads.v11.services.ForecastMetricsOrBuilder getAdGroupForecastOrBuilder();
}
