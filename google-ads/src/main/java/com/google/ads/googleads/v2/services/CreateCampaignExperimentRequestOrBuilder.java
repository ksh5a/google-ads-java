// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/campaign_experiment_service.proto

package com.google.ads.googleads.v2.services;

public interface CreateCampaignExperimentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.CreateCampaignExperimentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer whose campaign experiment is being created.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer whose campaign experiment is being created.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The campaign experiment to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignExperiment campaign_experiment = 2;</code>
   */
  boolean hasCampaignExperiment();
  /**
   * <pre>
   * The campaign experiment to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignExperiment campaign_experiment = 2;</code>
   */
  com.google.ads.googleads.v2.resources.CampaignExperiment getCampaignExperiment();
  /**
   * <pre>
   * The campaign experiment to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignExperiment campaign_experiment = 2;</code>
   */
  com.google.ads.googleads.v2.resources.CampaignExperimentOrBuilder getCampaignExperimentOrBuilder();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   */
  boolean getValidateOnly();
}