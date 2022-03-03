// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/reach_plan_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * Forecasted traffic metrics for a planned product.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.PlannedProductForecast}
 */
public final class PlannedProductForecast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.PlannedProductForecast)
    PlannedProductForecastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlannedProductForecast.newBuilder() to construct.
  private PlannedProductForecast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlannedProductForecast() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlannedProductForecast();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlannedProductForecast(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            onTargetReach_ = input.readInt64();
            break;
          }
          case 16: {

            totalReach_ = input.readInt64();
            break;
          }
          case 24: {

            onTargetImpressions_ = input.readInt64();
            break;
          }
          case 32: {

            totalImpressions_ = input.readInt64();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000001;
            viewableImpressions_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v10_services_PlannedProductForecast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v10_services_PlannedProductForecast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.PlannedProductForecast.class, com.google.ads.googleads.v10.services.PlannedProductForecast.Builder.class);
  }

  private int bitField0_;
  public static final int ON_TARGET_REACH_FIELD_NUMBER = 1;
  private long onTargetReach_;
  /**
   * <pre>
   * Number of unique people reached that exactly matches the Targeting.
   * Note that a minimum number of unique people must be reached in order for
   * data to be reported. If the minimum number is not met, the on_target_reach
   * value will be rounded to 0.
   * </pre>
   *
   * <code>int64 on_target_reach = 1;</code>
   * @return The onTargetReach.
   */
  @java.lang.Override
  public long getOnTargetReach() {
    return onTargetReach_;
  }

  public static final int TOTAL_REACH_FIELD_NUMBER = 2;
  private long totalReach_;
  /**
   * <pre>
   * Number of unique people reached. This includes people that may fall
   * outside the specified Targeting.
   * Note that a minimum number of unique people must be reached in order for
   * data to be reported. If the minimum number is not met, the total_reach
   * value will be rounded to 0.
   * </pre>
   *
   * <code>int64 total_reach = 2;</code>
   * @return The totalReach.
   */
  @java.lang.Override
  public long getTotalReach() {
    return totalReach_;
  }

  public static final int ON_TARGET_IMPRESSIONS_FIELD_NUMBER = 3;
  private long onTargetImpressions_;
  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting.
   * </pre>
   *
   * <code>int64 on_target_impressions = 3;</code>
   * @return The onTargetImpressions.
   */
  @java.lang.Override
  public long getOnTargetImpressions() {
    return onTargetImpressions_;
  }

  public static final int TOTAL_IMPRESSIONS_FIELD_NUMBER = 4;
  private long totalImpressions_;
  /**
   * <pre>
   * Total number of ad impressions. This includes impressions that may fall
   * outside the specified Targeting, due to insufficient information on
   * signed-in users.
   * </pre>
   *
   * <code>int64 total_impressions = 4;</code>
   * @return The totalImpressions.
   */
  @java.lang.Override
  public long getTotalImpressions() {
    return totalImpressions_;
  }

  public static final int VIEWABLE_IMPRESSIONS_FIELD_NUMBER = 5;
  private long viewableImpressions_;
  /**
   * <pre>
   * Number of times the ad's impressions were considered viewable.
   * See https://support.google.com/google-ads/answer/7029393 for
   * more information about what makes an ad viewable and how
   * viewability is measured.
   * </pre>
   *
   * <code>optional int64 viewable_impressions = 5;</code>
   * @return Whether the viewableImpressions field is set.
   */
  @java.lang.Override
  public boolean hasViewableImpressions() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Number of times the ad's impressions were considered viewable.
   * See https://support.google.com/google-ads/answer/7029393 for
   * more information about what makes an ad viewable and how
   * viewability is measured.
   * </pre>
   *
   * <code>optional int64 viewable_impressions = 5;</code>
   * @return The viewableImpressions.
   */
  @java.lang.Override
  public long getViewableImpressions() {
    return viewableImpressions_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (onTargetReach_ != 0L) {
      output.writeInt64(1, onTargetReach_);
    }
    if (totalReach_ != 0L) {
      output.writeInt64(2, totalReach_);
    }
    if (onTargetImpressions_ != 0L) {
      output.writeInt64(3, onTargetImpressions_);
    }
    if (totalImpressions_ != 0L) {
      output.writeInt64(4, totalImpressions_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(5, viewableImpressions_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (onTargetReach_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, onTargetReach_);
    }
    if (totalReach_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, totalReach_);
    }
    if (onTargetImpressions_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, onTargetImpressions_);
    }
    if (totalImpressions_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, totalImpressions_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, viewableImpressions_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v10.services.PlannedProductForecast)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.PlannedProductForecast other = (com.google.ads.googleads.v10.services.PlannedProductForecast) obj;

    if (getOnTargetReach()
        != other.getOnTargetReach()) return false;
    if (getTotalReach()
        != other.getTotalReach()) return false;
    if (getOnTargetImpressions()
        != other.getOnTargetImpressions()) return false;
    if (getTotalImpressions()
        != other.getTotalImpressions()) return false;
    if (hasViewableImpressions() != other.hasViewableImpressions()) return false;
    if (hasViewableImpressions()) {
      if (getViewableImpressions()
          != other.getViewableImpressions()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ON_TARGET_REACH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOnTargetReach());
    hash = (37 * hash) + TOTAL_REACH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalReach());
    hash = (37 * hash) + ON_TARGET_IMPRESSIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOnTargetImpressions());
    hash = (37 * hash) + TOTAL_IMPRESSIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalImpressions());
    if (hasViewableImpressions()) {
      hash = (37 * hash) + VIEWABLE_IMPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getViewableImpressions());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.PlannedProductForecast parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v10.services.PlannedProductForecast prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Forecasted traffic metrics for a planned product.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.PlannedProductForecast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.PlannedProductForecast)
      com.google.ads.googleads.v10.services.PlannedProductForecastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v10_services_PlannedProductForecast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v10_services_PlannedProductForecast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.PlannedProductForecast.class, com.google.ads.googleads.v10.services.PlannedProductForecast.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.PlannedProductForecast.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      onTargetReach_ = 0L;

      totalReach_ = 0L;

      onTargetImpressions_ = 0L;

      totalImpressions_ = 0L;

      viewableImpressions_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v10_services_PlannedProductForecast_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.PlannedProductForecast getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.PlannedProductForecast.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.PlannedProductForecast build() {
      com.google.ads.googleads.v10.services.PlannedProductForecast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.PlannedProductForecast buildPartial() {
      com.google.ads.googleads.v10.services.PlannedProductForecast result = new com.google.ads.googleads.v10.services.PlannedProductForecast(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.onTargetReach_ = onTargetReach_;
      result.totalReach_ = totalReach_;
      result.onTargetImpressions_ = onTargetImpressions_;
      result.totalImpressions_ = totalImpressions_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.viewableImpressions_ = viewableImpressions_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v10.services.PlannedProductForecast) {
        return mergeFrom((com.google.ads.googleads.v10.services.PlannedProductForecast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.PlannedProductForecast other) {
      if (other == com.google.ads.googleads.v10.services.PlannedProductForecast.getDefaultInstance()) return this;
      if (other.getOnTargetReach() != 0L) {
        setOnTargetReach(other.getOnTargetReach());
      }
      if (other.getTotalReach() != 0L) {
        setTotalReach(other.getTotalReach());
      }
      if (other.getOnTargetImpressions() != 0L) {
        setOnTargetImpressions(other.getOnTargetImpressions());
      }
      if (other.getTotalImpressions() != 0L) {
        setTotalImpressions(other.getTotalImpressions());
      }
      if (other.hasViewableImpressions()) {
        setViewableImpressions(other.getViewableImpressions());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v10.services.PlannedProductForecast parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.services.PlannedProductForecast) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long onTargetReach_ ;
    /**
     * <pre>
     * Number of unique people reached that exactly matches the Targeting.
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the on_target_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 on_target_reach = 1;</code>
     * @return The onTargetReach.
     */
    @java.lang.Override
    public long getOnTargetReach() {
      return onTargetReach_;
    }
    /**
     * <pre>
     * Number of unique people reached that exactly matches the Targeting.
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the on_target_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 on_target_reach = 1;</code>
     * @param value The onTargetReach to set.
     * @return This builder for chaining.
     */
    public Builder setOnTargetReach(long value) {
      
      onTargetReach_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of unique people reached that exactly matches the Targeting.
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the on_target_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 on_target_reach = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOnTargetReach() {
      
      onTargetReach_ = 0L;
      onChanged();
      return this;
    }

    private long totalReach_ ;
    /**
     * <pre>
     * Number of unique people reached. This includes people that may fall
     * outside the specified Targeting.
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the total_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 total_reach = 2;</code>
     * @return The totalReach.
     */
    @java.lang.Override
    public long getTotalReach() {
      return totalReach_;
    }
    /**
     * <pre>
     * Number of unique people reached. This includes people that may fall
     * outside the specified Targeting.
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the total_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 total_reach = 2;</code>
     * @param value The totalReach to set.
     * @return This builder for chaining.
     */
    public Builder setTotalReach(long value) {
      
      totalReach_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of unique people reached. This includes people that may fall
     * outside the specified Targeting.
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the total_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 total_reach = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalReach() {
      
      totalReach_ = 0L;
      onChanged();
      return this;
    }

    private long onTargetImpressions_ ;
    /**
     * <pre>
     * Number of ad impressions that exactly matches the Targeting.
     * </pre>
     *
     * <code>int64 on_target_impressions = 3;</code>
     * @return The onTargetImpressions.
     */
    @java.lang.Override
    public long getOnTargetImpressions() {
      return onTargetImpressions_;
    }
    /**
     * <pre>
     * Number of ad impressions that exactly matches the Targeting.
     * </pre>
     *
     * <code>int64 on_target_impressions = 3;</code>
     * @param value The onTargetImpressions to set.
     * @return This builder for chaining.
     */
    public Builder setOnTargetImpressions(long value) {
      
      onTargetImpressions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of ad impressions that exactly matches the Targeting.
     * </pre>
     *
     * <code>int64 on_target_impressions = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOnTargetImpressions() {
      
      onTargetImpressions_ = 0L;
      onChanged();
      return this;
    }

    private long totalImpressions_ ;
    /**
     * <pre>
     * Total number of ad impressions. This includes impressions that may fall
     * outside the specified Targeting, due to insufficient information on
     * signed-in users.
     * </pre>
     *
     * <code>int64 total_impressions = 4;</code>
     * @return The totalImpressions.
     */
    @java.lang.Override
    public long getTotalImpressions() {
      return totalImpressions_;
    }
    /**
     * <pre>
     * Total number of ad impressions. This includes impressions that may fall
     * outside the specified Targeting, due to insufficient information on
     * signed-in users.
     * </pre>
     *
     * <code>int64 total_impressions = 4;</code>
     * @param value The totalImpressions to set.
     * @return This builder for chaining.
     */
    public Builder setTotalImpressions(long value) {
      
      totalImpressions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total number of ad impressions. This includes impressions that may fall
     * outside the specified Targeting, due to insufficient information on
     * signed-in users.
     * </pre>
     *
     * <code>int64 total_impressions = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalImpressions() {
      
      totalImpressions_ = 0L;
      onChanged();
      return this;
    }

    private long viewableImpressions_ ;
    /**
     * <pre>
     * Number of times the ad's impressions were considered viewable.
     * See https://support.google.com/google-ads/answer/7029393 for
     * more information about what makes an ad viewable and how
     * viewability is measured.
     * </pre>
     *
     * <code>optional int64 viewable_impressions = 5;</code>
     * @return Whether the viewableImpressions field is set.
     */
    @java.lang.Override
    public boolean hasViewableImpressions() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Number of times the ad's impressions were considered viewable.
     * See https://support.google.com/google-ads/answer/7029393 for
     * more information about what makes an ad viewable and how
     * viewability is measured.
     * </pre>
     *
     * <code>optional int64 viewable_impressions = 5;</code>
     * @return The viewableImpressions.
     */
    @java.lang.Override
    public long getViewableImpressions() {
      return viewableImpressions_;
    }
    /**
     * <pre>
     * Number of times the ad's impressions were considered viewable.
     * See https://support.google.com/google-ads/answer/7029393 for
     * more information about what makes an ad viewable and how
     * viewability is measured.
     * </pre>
     *
     * <code>optional int64 viewable_impressions = 5;</code>
     * @param value The viewableImpressions to set.
     * @return This builder for chaining.
     */
    public Builder setViewableImpressions(long value) {
      bitField0_ |= 0x00000001;
      viewableImpressions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of times the ad's impressions were considered viewable.
     * See https://support.google.com/google-ads/answer/7029393 for
     * more information about what makes an ad viewable and how
     * viewability is measured.
     * </pre>
     *
     * <code>optional int64 viewable_impressions = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearViewableImpressions() {
      bitField0_ = (bitField0_ & ~0x00000001);
      viewableImpressions_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.PlannedProductForecast)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.PlannedProductForecast)
  private static final com.google.ads.googleads.v10.services.PlannedProductForecast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.PlannedProductForecast();
  }

  public static com.google.ads.googleads.v10.services.PlannedProductForecast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlannedProductForecast>
      PARSER = new com.google.protobuf.AbstractParser<PlannedProductForecast>() {
    @java.lang.Override
    public PlannedProductForecast parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlannedProductForecast(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlannedProductForecast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlannedProductForecast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.PlannedProductForecast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
