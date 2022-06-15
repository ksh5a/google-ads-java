// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/audience_insights_service.proto

package com.google.ads.googleads.v11.services;

public interface ListAudienceInsightsAttributesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.ListAudienceInsightsAttributesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The types of attributes to be returned.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimensions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the dimensions.
   */
  java.util.List<com.google.ads.googleads.v11.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension> getDimensionsList();
  /**
   * <pre>
   * Required. The types of attributes to be returned.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimensions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of dimensions.
   */
  int getDimensionsCount();
  /**
   * <pre>
   * Required. The types of attributes to be returned.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimensions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The dimensions at the given index.
   */
  com.google.ads.googleads.v11.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension getDimensions(int index);
  /**
   * <pre>
   * Required. The types of attributes to be returned.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimensions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the enum numeric values on the wire for dimensions.
   */
  java.util.List<java.lang.Integer>
  getDimensionsValueList();
  /**
   * <pre>
   * Required. The types of attributes to be returned.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimensions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of dimensions at the given index.
   */
  int getDimensionsValue(int index);

  /**
   * <pre>
   * Required. A free text query.  Attributes matching or related to this string will be
   * returned.
   * </pre>
   *
   * <code>string query_text = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The queryText.
   */
  java.lang.String getQueryText();
  /**
   * <pre>
   * Required. A free text query.  Attributes matching or related to this string will be
   * returned.
   * </pre>
   *
   * <code>string query_text = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for queryText.
   */
  com.google.protobuf.ByteString
      getQueryTextBytes();

  /**
   * <pre>
   * The name of the customer being planned for.  This is a user-defined value.
   * </pre>
   *
   * <code>string customer_insights_group = 4;</code>
   * @return The customerInsightsGroup.
   */
  java.lang.String getCustomerInsightsGroup();
  /**
   * <pre>
   * The name of the customer being planned for.  This is a user-defined value.
   * </pre>
   *
   * <code>string customer_insights_group = 4;</code>
   * @return The bytes for customerInsightsGroup.
   */
  com.google.protobuf.ByteString
      getCustomerInsightsGroupBytes();
}