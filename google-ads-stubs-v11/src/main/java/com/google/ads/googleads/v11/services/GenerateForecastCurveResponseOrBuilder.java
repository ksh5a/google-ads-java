// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/keyword_plan_service.proto

package com.google.ads.googleads.v11.services;

public interface GenerateForecastCurveResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.GenerateForecastCurveResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of forecast curves for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve> 
      getCampaignForecastCurvesList();
  /**
   * <pre>
   * List of forecast curves for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
   */
  com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve getCampaignForecastCurves(int index);
  /**
   * <pre>
   * List of forecast curves for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
   */
  int getCampaignForecastCurvesCount();
  /**
   * <pre>
   * List of forecast curves for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurveOrBuilder> 
      getCampaignForecastCurvesOrBuilderList();
  /**
   * <pre>
   * List of forecast curves for the keyword plan campaign.
   * One maximum.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve campaign_forecast_curves = 1;</code>
   */
  com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurveOrBuilder getCampaignForecastCurvesOrBuilder(
      int index);
}
