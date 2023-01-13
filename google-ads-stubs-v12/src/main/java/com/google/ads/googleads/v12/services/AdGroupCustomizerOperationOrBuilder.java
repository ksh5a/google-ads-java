// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/ad_group_customizer_service.proto

package com.google.ads.googleads.v12.services;

public interface AdGroupCustomizerOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.AdGroupCustomizerOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * customizer
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AdGroupCustomizer create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * customizer
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AdGroupCustomizer create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v12.resources.AdGroupCustomizer getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * customizer
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AdGroupCustomizer create = 1;</code>
   */
  com.google.ads.googleads.v12.resources.AdGroupCustomizerOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group customizer is
   * expected, in this format:
   * `customers/{customer_id}/adGroupCustomizers/{ad_group_id}~{customizer_attribute_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group customizer is
   * expected, in this format:
   * `customers/{customer_id}/adGroupCustomizers/{ad_group_id}~{customizer_attribute_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group customizer is
   * expected, in this format:
   * `customers/{customer_id}/adGroupCustomizers/{ad_group_id}~{customizer_attribute_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v12.services.AdGroupCustomizerOperation.OperationCase getOperationCase();
}