// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/keyword_plan_campaign_keyword.proto

package com.google.ads.googleads.v8.resources;

public interface KeywordPlanCampaignKeywordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.KeywordPlanCampaignKeyword)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Keyword Plan Campaign keyword.
   * KeywordPlanCampaignKeyword resource names have the form:
   * `customers/{customer_id}/keywordPlanCampaignKeywords/{kp_campaign_keyword_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the Keyword Plan Campaign keyword.
   * KeywordPlanCampaignKeyword resource names have the form:
   * `customers/{customer_id}/keywordPlanCampaignKeywords/{kp_campaign_keyword_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The Keyword Plan campaign to which this negative keyword belongs.
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 8 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the keywordPlanCampaign field is set.
   */
  boolean hasKeywordPlanCampaign();
  /**
   * <pre>
   * The Keyword Plan campaign to which this negative keyword belongs.
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 8 [(.google.api.resource_reference) = { ... }</code>
   * @return The keywordPlanCampaign.
   */
  java.lang.String getKeywordPlanCampaign();
  /**
   * <pre>
   * The Keyword Plan campaign to which this negative keyword belongs.
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 8 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for keywordPlanCampaign.
   */
  com.google.protobuf.ByteString
      getKeywordPlanCampaignBytes();

  /**
   * <pre>
   * Output only. The ID of the Keyword Plan negative keyword.
   * </pre>
   *
   * <code>optional int64 id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the Keyword Plan negative keyword.
   * </pre>
   *
   * <code>optional int64 id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The keyword text.
   * </pre>
   *
   * <code>optional string text = 10;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * The keyword text.
   * </pre>
   *
   * <code>optional string text = 10;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * The keyword text.
   * </pre>
   *
   * <code>optional string text = 10;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The keyword match type.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 5;</code>
   * @return The enum numeric value on the wire for matchType.
   */
  int getMatchTypeValue();
  /**
   * <pre>
   * The keyword match type.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 5;</code>
   * @return The matchType.
   */
  com.google.ads.googleads.v8.enums.KeywordMatchTypeEnum.KeywordMatchType getMatchType();

  /**
   * <pre>
   * Immutable. If true, the keyword is negative.
   * Must be set to true. Only negative campaign keywords are supported.
   * </pre>
   *
   * <code>optional bool negative = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the negative field is set.
   */
  boolean hasNegative();
  /**
   * <pre>
   * Immutable. If true, the keyword is negative.
   * Must be set to true. Only negative campaign keywords are supported.
   * </pre>
   *
   * <code>optional bool negative = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The negative.
   */
  boolean getNegative();
}