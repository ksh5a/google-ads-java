// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/keyword_plan_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * The forecast curve for the campaign.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve}
 */
public final class KeywordPlanCampaignForecastCurve extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve)
    KeywordPlanCampaignForecastCurveOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanCampaignForecastCurve.newBuilder() to construct.
  private KeywordPlanCampaignForecastCurve(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanCampaignForecastCurve() {
    keywordPlanCampaign_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanCampaignForecastCurve();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordPlanCampaignForecastCurve(
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
          case 18: {
            com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.Builder subBuilder = null;
            if (maxCpcBidForecastCurve_ != null) {
              subBuilder = maxCpcBidForecastCurve_.toBuilder();
            }
            maxCpcBidForecastCurve_ = input.readMessage(com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(maxCpcBidForecastCurve_);
              maxCpcBidForecastCurve_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            keywordPlanCampaign_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanCampaignForecastCurve_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanCampaignForecastCurve_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve.class, com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve.Builder.class);
  }

  private int bitField0_;
  public static final int KEYWORD_PLAN_CAMPAIGN_FIELD_NUMBER = 3;
  private volatile java.lang.Object keywordPlanCampaign_;
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return Whether the keywordPlanCampaign field is set.
   */
  @java.lang.Override
  public boolean hasKeywordPlanCampaign() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return The keywordPlanCampaign.
   */
  @java.lang.Override
  public java.lang.String getKeywordPlanCampaign() {
    java.lang.Object ref = keywordPlanCampaign_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keywordPlanCampaign_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return The bytes for keywordPlanCampaign.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeywordPlanCampaignBytes() {
    java.lang.Object ref = keywordPlanCampaign_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keywordPlanCampaign_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_CPC_BID_FORECAST_CURVE_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve maxCpcBidForecastCurve_;
  /**
   * <pre>
   * The max cpc bid forecast curve for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
   * @return Whether the maxCpcBidForecastCurve field is set.
   */
  @java.lang.Override
  public boolean hasMaxCpcBidForecastCurve() {
    return maxCpcBidForecastCurve_ != null;
  }
  /**
   * <pre>
   * The max cpc bid forecast curve for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
   * @return The maxCpcBidForecastCurve.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve getMaxCpcBidForecastCurve() {
    return maxCpcBidForecastCurve_ == null ? com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.getDefaultInstance() : maxCpcBidForecastCurve_;
  }
  /**
   * <pre>
   * The max cpc bid forecast curve for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder getMaxCpcBidForecastCurveOrBuilder() {
    return getMaxCpcBidForecastCurve();
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
    if (maxCpcBidForecastCurve_ != null) {
      output.writeMessage(2, getMaxCpcBidForecastCurve());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, keywordPlanCampaign_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxCpcBidForecastCurve_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMaxCpcBidForecastCurve());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, keywordPlanCampaign_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve other = (com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve) obj;

    if (hasKeywordPlanCampaign() != other.hasKeywordPlanCampaign()) return false;
    if (hasKeywordPlanCampaign()) {
      if (!getKeywordPlanCampaign()
          .equals(other.getKeywordPlanCampaign())) return false;
    }
    if (hasMaxCpcBidForecastCurve() != other.hasMaxCpcBidForecastCurve()) return false;
    if (hasMaxCpcBidForecastCurve()) {
      if (!getMaxCpcBidForecastCurve()
          .equals(other.getMaxCpcBidForecastCurve())) return false;
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
    if (hasKeywordPlanCampaign()) {
      hash = (37 * hash) + KEYWORD_PLAN_CAMPAIGN_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordPlanCampaign().hashCode();
    }
    if (hasMaxCpcBidForecastCurve()) {
      hash = (37 * hash) + MAX_CPC_BID_FORECAST_CURVE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxCpcBidForecastCurve().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve prototype) {
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
   * The forecast curve for the campaign.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve)
      com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanCampaignForecastCurve_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanCampaignForecastCurve_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve.class, com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve.newBuilder()
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
      keywordPlanCampaign_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (maxCpcBidForecastCurveBuilder_ == null) {
        maxCpcBidForecastCurve_ = null;
      } else {
        maxCpcBidForecastCurve_ = null;
        maxCpcBidForecastCurveBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanCampaignForecastCurve_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve build() {
      com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve buildPartial() {
      com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve result = new com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.keywordPlanCampaign_ = keywordPlanCampaign_;
      if (maxCpcBidForecastCurveBuilder_ == null) {
        result.maxCpcBidForecastCurve_ = maxCpcBidForecastCurve_;
      } else {
        result.maxCpcBidForecastCurve_ = maxCpcBidForecastCurveBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve) {
        return mergeFrom((com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve other) {
      if (other == com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve.getDefaultInstance()) return this;
      if (other.hasKeywordPlanCampaign()) {
        bitField0_ |= 0x00000001;
        keywordPlanCampaign_ = other.keywordPlanCampaign_;
        onChanged();
      }
      if (other.hasMaxCpcBidForecastCurve()) {
        mergeMaxCpcBidForecastCurve(other.getMaxCpcBidForecastCurve());
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
      com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object keywordPlanCampaign_ = "";
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return Whether the keywordPlanCampaign field is set.
     */
    public boolean hasKeywordPlanCampaign() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return The keywordPlanCampaign.
     */
    public java.lang.String getKeywordPlanCampaign() {
      java.lang.Object ref = keywordPlanCampaign_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keywordPlanCampaign_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return The bytes for keywordPlanCampaign.
     */
    public com.google.protobuf.ByteString
        getKeywordPlanCampaignBytes() {
      java.lang.Object ref = keywordPlanCampaign_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keywordPlanCampaign_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @param value The keywordPlanCampaign to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlanCampaign(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      keywordPlanCampaign_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeywordPlanCampaign() {
      bitField0_ = (bitField0_ & ~0x00000001);
      keywordPlanCampaign_ = getDefaultInstance().getKeywordPlanCampaign();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @param value The bytes for keywordPlanCampaign to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlanCampaignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      keywordPlanCampaign_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve maxCpcBidForecastCurve_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.Builder, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder> maxCpcBidForecastCurveBuilder_;
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     * @return Whether the maxCpcBidForecastCurve field is set.
     */
    public boolean hasMaxCpcBidForecastCurve() {
      return maxCpcBidForecastCurveBuilder_ != null || maxCpcBidForecastCurve_ != null;
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     * @return The maxCpcBidForecastCurve.
     */
    public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve getMaxCpcBidForecastCurve() {
      if (maxCpcBidForecastCurveBuilder_ == null) {
        return maxCpcBidForecastCurve_ == null ? com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.getDefaultInstance() : maxCpcBidForecastCurve_;
      } else {
        return maxCpcBidForecastCurveBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public Builder setMaxCpcBidForecastCurve(com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve value) {
      if (maxCpcBidForecastCurveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxCpcBidForecastCurve_ = value;
        onChanged();
      } else {
        maxCpcBidForecastCurveBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public Builder setMaxCpcBidForecastCurve(
        com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.Builder builderForValue) {
      if (maxCpcBidForecastCurveBuilder_ == null) {
        maxCpcBidForecastCurve_ = builderForValue.build();
        onChanged();
      } else {
        maxCpcBidForecastCurveBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public Builder mergeMaxCpcBidForecastCurve(com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve value) {
      if (maxCpcBidForecastCurveBuilder_ == null) {
        if (maxCpcBidForecastCurve_ != null) {
          maxCpcBidForecastCurve_ =
            com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.newBuilder(maxCpcBidForecastCurve_).mergeFrom(value).buildPartial();
        } else {
          maxCpcBidForecastCurve_ = value;
        }
        onChanged();
      } else {
        maxCpcBidForecastCurveBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public Builder clearMaxCpcBidForecastCurve() {
      if (maxCpcBidForecastCurveBuilder_ == null) {
        maxCpcBidForecastCurve_ = null;
        onChanged();
      } else {
        maxCpcBidForecastCurve_ = null;
        maxCpcBidForecastCurveBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.Builder getMaxCpcBidForecastCurveBuilder() {
      
      onChanged();
      return getMaxCpcBidForecastCurveFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder getMaxCpcBidForecastCurveOrBuilder() {
      if (maxCpcBidForecastCurveBuilder_ != null) {
        return maxCpcBidForecastCurveBuilder_.getMessageOrBuilder();
      } else {
        return maxCpcBidForecastCurve_ == null ?
            com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.getDefaultInstance() : maxCpcBidForecastCurve_;
      }
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.Builder, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder> 
        getMaxCpcBidForecastCurveFieldBuilder() {
      if (maxCpcBidForecastCurveBuilder_ == null) {
        maxCpcBidForecastCurveBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.Builder, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder>(
                getMaxCpcBidForecastCurve(),
                getParentForChildren(),
                isClean());
        maxCpcBidForecastCurve_ = null;
      }
      return maxCpcBidForecastCurveBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve)
  private static final com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve();
  }

  public static com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanCampaignForecastCurve>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanCampaignForecastCurve>() {
    @java.lang.Override
    public KeywordPlanCampaignForecastCurve parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordPlanCampaignForecastCurve(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordPlanCampaignForecastCurve> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanCampaignForecastCurve> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.KeywordPlanCampaignForecastCurve getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
