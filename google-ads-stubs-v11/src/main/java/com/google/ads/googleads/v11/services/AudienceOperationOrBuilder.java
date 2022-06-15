// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/audience_service.proto

package com.google.ads.googleads.v11.services;

public interface AudienceOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.AudienceOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new audience
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.Audience create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new audience
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.Audience create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v11.resources.Audience getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new audience
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.Audience create = 1;</code>
   */
  com.google.ads.googleads.v11.resources.AudienceOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The audience is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.Audience update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The audience is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.Audience update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v11.resources.Audience getUpdate();
  /**
   * <pre>
   * Update operation: The audience is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.Audience update = 2;</code>
   */
  com.google.ads.googleads.v11.resources.AudienceOrBuilder getUpdateOrBuilder();

  public com.google.ads.googleads.v11.services.AudienceOperation.OperationCase getOperationCase();
}