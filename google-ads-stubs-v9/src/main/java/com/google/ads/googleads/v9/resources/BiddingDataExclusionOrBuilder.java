// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/bidding_data_exclusion.proto

package com.google.ads.googleads.v9.resources;

public interface BiddingDataExclusionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.resources.BiddingDataExclusion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the data exclusion.
   * Data exclusion resource names have the form:
   * `customers/{customer_id}/biddingDataExclusions/{data_exclusion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the data exclusion.
   * Data exclusion resource names have the form:
   * `customers/{customer_id}/biddingDataExclusions/{data_exclusion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the data exclusion.
   * </pre>
   *
   * <code>int64 data_exclusion_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The dataExclusionId.
   */
  long getDataExclusionId();

  /**
   * <pre>
   * The scope of the data exclusion.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SeasonalityEventScopeEnum.SeasonalityEventScope scope = 3;</code>
   * @return The enum numeric value on the wire for scope.
   */
  int getScopeValue();
  /**
   * <pre>
   * The scope of the data exclusion.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SeasonalityEventScopeEnum.SeasonalityEventScope scope = 3;</code>
   * @return The scope.
   */
  com.google.ads.googleads.v9.enums.SeasonalityEventScopeEnum.SeasonalityEventScope getScope();

  /**
   * <pre>
   * Output only. The status of the data exclusion.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SeasonalityEventStatusEnum.SeasonalityEventStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the data exclusion.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SeasonalityEventStatusEnum.SeasonalityEventStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v9.enums.SeasonalityEventStatusEnum.SeasonalityEventStatus getStatus();

  /**
   * <pre>
   * Required. The inclusive start time of the data exclusion in yyyy-MM-dd HH:mm:ss
   * format.
   * A data exclusion is backward looking and should be used for events that
   * start in the past and end either in the past or future.
   * </pre>
   *
   * <code>string start_date_time = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The startDateTime.
   */
  java.lang.String getStartDateTime();
  /**
   * <pre>
   * Required. The inclusive start time of the data exclusion in yyyy-MM-dd HH:mm:ss
   * format.
   * A data exclusion is backward looking and should be used for events that
   * start in the past and end either in the past or future.
   * </pre>
   *
   * <code>string start_date_time = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for startDateTime.
   */
  com.google.protobuf.ByteString
      getStartDateTimeBytes();

  /**
   * <pre>
   * Required. The exclusive end time of the data exclusion in yyyy-MM-dd HH:mm:ss format.
   * The length of [start_date_time, end_date_time) interval must be
   * within (0, 14 days].
   * </pre>
   *
   * <code>string end_date_time = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The endDateTime.
   */
  java.lang.String getEndDateTime();
  /**
   * <pre>
   * Required. The exclusive end time of the data exclusion in yyyy-MM-dd HH:mm:ss format.
   * The length of [start_date_time, end_date_time) interval must be
   * within (0, 14 days].
   * </pre>
   *
   * <code>string end_date_time = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for endDateTime.
   */
  com.google.protobuf.ByteString
      getEndDateTimeBytes();

  /**
   * <pre>
   * The name of the data exclusion. The name can be at most 255
   * characters.
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the data exclusion. The name can be at most 255
   * characters.
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The description of the data exclusion. The description can be at
   * most 2048 characters.
   * </pre>
   *
   * <code>string description = 8;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the data exclusion. The description can be at
   * most 2048 characters.
   * </pre>
   *
   * <code>string description = 8;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * If not specified, all devices will be included in this exclusion.
   * Otherwise, only the specified targeted devices will be included in this
   * exclusion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.DeviceEnum.Device devices = 9;</code>
   * @return A list containing the devices.
   */
  java.util.List<com.google.ads.googleads.v9.enums.DeviceEnum.Device> getDevicesList();
  /**
   * <pre>
   * If not specified, all devices will be included in this exclusion.
   * Otherwise, only the specified targeted devices will be included in this
   * exclusion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.DeviceEnum.Device devices = 9;</code>
   * @return The count of devices.
   */
  int getDevicesCount();
  /**
   * <pre>
   * If not specified, all devices will be included in this exclusion.
   * Otherwise, only the specified targeted devices will be included in this
   * exclusion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.DeviceEnum.Device devices = 9;</code>
   * @param index The index of the element to return.
   * @return The devices at the given index.
   */
  com.google.ads.googleads.v9.enums.DeviceEnum.Device getDevices(int index);
  /**
   * <pre>
   * If not specified, all devices will be included in this exclusion.
   * Otherwise, only the specified targeted devices will be included in this
   * exclusion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.DeviceEnum.Device devices = 9;</code>
   * @return A list containing the enum numeric values on the wire for devices.
   */
  java.util.List<java.lang.Integer>
  getDevicesValueList();
  /**
   * <pre>
   * If not specified, all devices will be included in this exclusion.
   * Otherwise, only the specified targeted devices will be included in this
   * exclusion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.DeviceEnum.Device devices = 9;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of devices at the given index.
   */
  int getDevicesValue(int index);

  /**
   * <pre>
   * The data exclusion will apply to the campaigns listed when the scope of
   * this exclusion is CAMPAIGN. The maximum number of campaigns per event is
   * 2000.
   * Note: a data exclusion with both advertising_channel_types and
   * campaign_ids is not supported.
   * </pre>
   *
   * <code>repeated string campaigns = 10 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the campaigns.
   */
  java.util.List<java.lang.String>
      getCampaignsList();
  /**
   * <pre>
   * The data exclusion will apply to the campaigns listed when the scope of
   * this exclusion is CAMPAIGN. The maximum number of campaigns per event is
   * 2000.
   * Note: a data exclusion with both advertising_channel_types and
   * campaign_ids is not supported.
   * </pre>
   *
   * <code>repeated string campaigns = 10 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of campaigns.
   */
  int getCampaignsCount();
  /**
   * <pre>
   * The data exclusion will apply to the campaigns listed when the scope of
   * this exclusion is CAMPAIGN. The maximum number of campaigns per event is
   * 2000.
   * Note: a data exclusion with both advertising_channel_types and
   * campaign_ids is not supported.
   * </pre>
   *
   * <code>repeated string campaigns = 10 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The campaigns at the given index.
   */
  java.lang.String getCampaigns(int index);
  /**
   * <pre>
   * The data exclusion will apply to the campaigns listed when the scope of
   * this exclusion is CAMPAIGN. The maximum number of campaigns per event is
   * 2000.
   * Note: a data exclusion with both advertising_channel_types and
   * campaign_ids is not supported.
   * </pre>
   *
   * <code>repeated string campaigns = 10 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the campaigns at the given index.
   */
  com.google.protobuf.ByteString
      getCampaignsBytes(int index);

  /**
   * <pre>
   * The data_exclusion will apply to all the campaigns under the listed
   * channels retroactively as well as going forward when the scope of this
   * exclusion is CHANNEL.
   * The supported advertising channel types are DISPLAY, SEARCH and SHOPPING.
   * Note: a data exclusion with both advertising_channel_types and
   * campaign_ids is not supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_types = 11;</code>
   * @return A list containing the advertisingChannelTypes.
   */
  java.util.List<com.google.ads.googleads.v9.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType> getAdvertisingChannelTypesList();
  /**
   * <pre>
   * The data_exclusion will apply to all the campaigns under the listed
   * channels retroactively as well as going forward when the scope of this
   * exclusion is CHANNEL.
   * The supported advertising channel types are DISPLAY, SEARCH and SHOPPING.
   * Note: a data exclusion with both advertising_channel_types and
   * campaign_ids is not supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_types = 11;</code>
   * @return The count of advertisingChannelTypes.
   */
  int getAdvertisingChannelTypesCount();
  /**
   * <pre>
   * The data_exclusion will apply to all the campaigns under the listed
   * channels retroactively as well as going forward when the scope of this
   * exclusion is CHANNEL.
   * The supported advertising channel types are DISPLAY, SEARCH and SHOPPING.
   * Note: a data exclusion with both advertising_channel_types and
   * campaign_ids is not supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_types = 11;</code>
   * @param index The index of the element to return.
   * @return The advertisingChannelTypes at the given index.
   */
  com.google.ads.googleads.v9.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType getAdvertisingChannelTypes(int index);
  /**
   * <pre>
   * The data_exclusion will apply to all the campaigns under the listed
   * channels retroactively as well as going forward when the scope of this
   * exclusion is CHANNEL.
   * The supported advertising channel types are DISPLAY, SEARCH and SHOPPING.
   * Note: a data exclusion with both advertising_channel_types and
   * campaign_ids is not supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_types = 11;</code>
   * @return A list containing the enum numeric values on the wire for advertisingChannelTypes.
   */
  java.util.List<java.lang.Integer>
  getAdvertisingChannelTypesValueList();
  /**
   * <pre>
   * The data_exclusion will apply to all the campaigns under the listed
   * channels retroactively as well as going forward when the scope of this
   * exclusion is CHANNEL.
   * The supported advertising channel types are DISPLAY, SEARCH and SHOPPING.
   * Note: a data exclusion with both advertising_channel_types and
   * campaign_ids is not supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v9.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_types = 11;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of advertisingChannelTypes at the given index.
   */
  int getAdvertisingChannelTypesValue(int index);
}