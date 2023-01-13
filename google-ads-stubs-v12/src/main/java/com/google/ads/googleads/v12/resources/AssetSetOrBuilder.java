// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/asset_set.proto

package com.google.ads.googleads.v12.resources;

public interface AssetSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.AssetSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The ID of the asset set.
   * </pre>
   *
   * <code>int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Immutable. The resource name of the asset set.
   * Asset set resource names have the form:
   * `customers/{customer_id}/assetSets/{asset_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the asset set.
   * Asset set resource names have the form:
   * `customers/{customer_id}/assetSets/{asset_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Required. Name of the asset set. Required. It must have a minimum length of 1 and
   * maximum length of 128.
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the asset set. Required. It must have a minimum length of 1 and
   * maximum length of 128.
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Immutable. The type of the asset set. Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.AssetSetTypeEnum.AssetSetType type = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Required. Immutable. The type of the asset set. Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.AssetSetTypeEnum.AssetSetType type = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  com.google.ads.googleads.v12.enums.AssetSetTypeEnum.AssetSetType getType();

  /**
   * <pre>
   * Output only. The status of the asset set. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.AssetSetStatusEnum.AssetSetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the asset set. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.AssetSetStatusEnum.AssetSetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v12.enums.AssetSetStatusEnum.AssetSetStatus getStatus();

  /**
   * <pre>
   * Merchant ID and Feed Label from Google Merchant Center.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AssetSet.MerchantCenterFeed merchant_center_feed = 5;</code>
   * @return Whether the merchantCenterFeed field is set.
   */
  boolean hasMerchantCenterFeed();
  /**
   * <pre>
   * Merchant ID and Feed Label from Google Merchant Center.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AssetSet.MerchantCenterFeed merchant_center_feed = 5;</code>
   * @return The merchantCenterFeed.
   */
  com.google.ads.googleads.v12.resources.AssetSet.MerchantCenterFeed getMerchantCenterFeed();
  /**
   * <pre>
   * Merchant ID and Feed Label from Google Merchant Center.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AssetSet.MerchantCenterFeed merchant_center_feed = 5;</code>
   */
  com.google.ads.googleads.v12.resources.AssetSet.MerchantCenterFeedOrBuilder getMerchantCenterFeedOrBuilder();

  /**
   * <pre>
   * Immutable. Parent asset set id for the asset set where the elements of this asset set
   * come from. For example: the sync level location AssetSet id where the
   * the elements in LocationGroup AssetSet come from. This field is required
   * and only applicable for Location Group typed AssetSet.
   * </pre>
   *
   * <code>int64 location_group_parent_asset_set_id = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The locationGroupParentAssetSetId.
   */
  long getLocationGroupParentAssetSetId();

  /**
   * <pre>
   * Location asset set data. This will be used for sync level location
   * set. This can only be set if AssetSet's type is LOCATION_SYNC.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.LocationSet location_set = 7;</code>
   * @return Whether the locationSet field is set.
   */
  boolean hasLocationSet();
  /**
   * <pre>
   * Location asset set data. This will be used for sync level location
   * set. This can only be set if AssetSet's type is LOCATION_SYNC.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.LocationSet location_set = 7;</code>
   * @return The locationSet.
   */
  com.google.ads.googleads.v12.common.LocationSet getLocationSet();
  /**
   * <pre>
   * Location asset set data. This will be used for sync level location
   * set. This can only be set if AssetSet's type is LOCATION_SYNC.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.LocationSet location_set = 7;</code>
   */
  com.google.ads.googleads.v12.common.LocationSetOrBuilder getLocationSetOrBuilder();

  /**
   * <pre>
   * Business Profile location group asset set data.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.BusinessProfileLocationGroup business_profile_location_group = 8;</code>
   * @return Whether the businessProfileLocationGroup field is set.
   */
  boolean hasBusinessProfileLocationGroup();
  /**
   * <pre>
   * Business Profile location group asset set data.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.BusinessProfileLocationGroup business_profile_location_group = 8;</code>
   * @return The businessProfileLocationGroup.
   */
  com.google.ads.googleads.v12.common.BusinessProfileLocationGroup getBusinessProfileLocationGroup();
  /**
   * <pre>
   * Business Profile location group asset set data.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.BusinessProfileLocationGroup business_profile_location_group = 8;</code>
   */
  com.google.ads.googleads.v12.common.BusinessProfileLocationGroupOrBuilder getBusinessProfileLocationGroupOrBuilder();

  /**
   * <pre>
   * Represents information about a Chain dynamic location group.
   * Only applicable if the sync level AssetSet's type is LOCATION_SYNC and
   * sync source is chain.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.ChainLocationGroup chain_location_group = 9;</code>
   * @return Whether the chainLocationGroup field is set.
   */
  boolean hasChainLocationGroup();
  /**
   * <pre>
   * Represents information about a Chain dynamic location group.
   * Only applicable if the sync level AssetSet's type is LOCATION_SYNC and
   * sync source is chain.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.ChainLocationGroup chain_location_group = 9;</code>
   * @return The chainLocationGroup.
   */
  com.google.ads.googleads.v12.common.ChainLocationGroup getChainLocationGroup();
  /**
   * <pre>
   * Represents information about a Chain dynamic location group.
   * Only applicable if the sync level AssetSet's type is LOCATION_SYNC and
   * sync source is chain.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.ChainLocationGroup chain_location_group = 9;</code>
   */
  com.google.ads.googleads.v12.common.ChainLocationGroupOrBuilder getChainLocationGroupOrBuilder();

  public com.google.ads.googleads.v12.resources.AssetSet.AssetSetSourceCase getAssetSetSourceCase();
}