// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/campaign_feed_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * The result for the campaign feed mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.MutateCampaignFeedResult}
 */
public final class MutateCampaignFeedResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.MutateCampaignFeedResult)
    MutateCampaignFeedResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCampaignFeedResult.newBuilder() to construct.
  private MutateCampaignFeedResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCampaignFeedResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCampaignFeedResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.CampaignFeedServiceProto.internal_static_google_ads_googleads_v12_services_MutateCampaignFeedResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.CampaignFeedServiceProto.internal_static_google_ads_googleads_v12_services_MutateCampaignFeedResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.MutateCampaignFeedResult.class, com.google.ads.googleads.v12.services.MutateCampaignFeedResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAMPAIGN_FEED_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v12.resources.CampaignFeed campaignFeed_;
  /**
   * <pre>
   * The mutated campaign feed with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
   * @return Whether the campaignFeed field is set.
   */
  @java.lang.Override
  public boolean hasCampaignFeed() {
    return campaignFeed_ != null;
  }
  /**
   * <pre>
   * The mutated campaign feed with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
   * @return The campaignFeed.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.resources.CampaignFeed getCampaignFeed() {
    return campaignFeed_ == null ? com.google.ads.googleads.v12.resources.CampaignFeed.getDefaultInstance() : campaignFeed_;
  }
  /**
   * <pre>
   * The mutated campaign feed with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.resources.CampaignFeedOrBuilder getCampaignFeedOrBuilder() {
    return getCampaignFeed();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (campaignFeed_ != null) {
      output.writeMessage(2, getCampaignFeed());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (campaignFeed_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCampaignFeed());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v12.services.MutateCampaignFeedResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.MutateCampaignFeedResult other = (com.google.ads.googleads.v12.services.MutateCampaignFeedResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCampaignFeed() != other.hasCampaignFeed()) return false;
    if (hasCampaignFeed()) {
      if (!getCampaignFeed()
          .equals(other.getCampaignFeed())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasCampaignFeed()) {
      hash = (37 * hash) + CAMPAIGN_FEED_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignFeed().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.MutateCampaignFeedResult prototype) {
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
   * The result for the campaign feed mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.MutateCampaignFeedResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.MutateCampaignFeedResult)
      com.google.ads.googleads.v12.services.MutateCampaignFeedResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.CampaignFeedServiceProto.internal_static_google_ads_googleads_v12_services_MutateCampaignFeedResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.CampaignFeedServiceProto.internal_static_google_ads_googleads_v12_services_MutateCampaignFeedResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.MutateCampaignFeedResult.class, com.google.ads.googleads.v12.services.MutateCampaignFeedResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.MutateCampaignFeedResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      resourceName_ = "";

      if (campaignFeedBuilder_ == null) {
        campaignFeed_ = null;
      } else {
        campaignFeed_ = null;
        campaignFeedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.CampaignFeedServiceProto.internal_static_google_ads_googleads_v12_services_MutateCampaignFeedResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateCampaignFeedResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.MutateCampaignFeedResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateCampaignFeedResult build() {
      com.google.ads.googleads.v12.services.MutateCampaignFeedResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateCampaignFeedResult buildPartial() {
      com.google.ads.googleads.v12.services.MutateCampaignFeedResult result = new com.google.ads.googleads.v12.services.MutateCampaignFeedResult(this);
      result.resourceName_ = resourceName_;
      if (campaignFeedBuilder_ == null) {
        result.campaignFeed_ = campaignFeed_;
      } else {
        result.campaignFeed_ = campaignFeedBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v12.services.MutateCampaignFeedResult) {
        return mergeFrom((com.google.ads.googleads.v12.services.MutateCampaignFeedResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.MutateCampaignFeedResult other) {
      if (other == com.google.ads.googleads.v12.services.MutateCampaignFeedResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasCampaignFeed()) {
        mergeCampaignFeed(other.getCampaignFeed());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              resourceName_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCampaignFeedFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v12.resources.CampaignFeed campaignFeed_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.resources.CampaignFeed, com.google.ads.googleads.v12.resources.CampaignFeed.Builder, com.google.ads.googleads.v12.resources.CampaignFeedOrBuilder> campaignFeedBuilder_;
    /**
     * <pre>
     * The mutated campaign feed with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
     * @return Whether the campaignFeed field is set.
     */
    public boolean hasCampaignFeed() {
      return campaignFeedBuilder_ != null || campaignFeed_ != null;
    }
    /**
     * <pre>
     * The mutated campaign feed with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
     * @return The campaignFeed.
     */
    public com.google.ads.googleads.v12.resources.CampaignFeed getCampaignFeed() {
      if (campaignFeedBuilder_ == null) {
        return campaignFeed_ == null ? com.google.ads.googleads.v12.resources.CampaignFeed.getDefaultInstance() : campaignFeed_;
      } else {
        return campaignFeedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated campaign feed with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
     */
    public Builder setCampaignFeed(com.google.ads.googleads.v12.resources.CampaignFeed value) {
      if (campaignFeedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        campaignFeed_ = value;
        onChanged();
      } else {
        campaignFeedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign feed with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
     */
    public Builder setCampaignFeed(
        com.google.ads.googleads.v12.resources.CampaignFeed.Builder builderForValue) {
      if (campaignFeedBuilder_ == null) {
        campaignFeed_ = builderForValue.build();
        onChanged();
      } else {
        campaignFeedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign feed with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
     */
    public Builder mergeCampaignFeed(com.google.ads.googleads.v12.resources.CampaignFeed value) {
      if (campaignFeedBuilder_ == null) {
        if (campaignFeed_ != null) {
          campaignFeed_ =
            com.google.ads.googleads.v12.resources.CampaignFeed.newBuilder(campaignFeed_).mergeFrom(value).buildPartial();
        } else {
          campaignFeed_ = value;
        }
        onChanged();
      } else {
        campaignFeedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign feed with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
     */
    public Builder clearCampaignFeed() {
      if (campaignFeedBuilder_ == null) {
        campaignFeed_ = null;
        onChanged();
      } else {
        campaignFeed_ = null;
        campaignFeedBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign feed with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
     */
    public com.google.ads.googleads.v12.resources.CampaignFeed.Builder getCampaignFeedBuilder() {
      
      onChanged();
      return getCampaignFeedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated campaign feed with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
     */
    public com.google.ads.googleads.v12.resources.CampaignFeedOrBuilder getCampaignFeedOrBuilder() {
      if (campaignFeedBuilder_ != null) {
        return campaignFeedBuilder_.getMessageOrBuilder();
      } else {
        return campaignFeed_ == null ?
            com.google.ads.googleads.v12.resources.CampaignFeed.getDefaultInstance() : campaignFeed_;
      }
    }
    /**
     * <pre>
     * The mutated campaign feed with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.CampaignFeed campaign_feed = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.resources.CampaignFeed, com.google.ads.googleads.v12.resources.CampaignFeed.Builder, com.google.ads.googleads.v12.resources.CampaignFeedOrBuilder> 
        getCampaignFeedFieldBuilder() {
      if (campaignFeedBuilder_ == null) {
        campaignFeedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.resources.CampaignFeed, com.google.ads.googleads.v12.resources.CampaignFeed.Builder, com.google.ads.googleads.v12.resources.CampaignFeedOrBuilder>(
                getCampaignFeed(),
                getParentForChildren(),
                isClean());
        campaignFeed_ = null;
      }
      return campaignFeedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.MutateCampaignFeedResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.MutateCampaignFeedResult)
  private static final com.google.ads.googleads.v12.services.MutateCampaignFeedResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.MutateCampaignFeedResult();
  }

  public static com.google.ads.googleads.v12.services.MutateCampaignFeedResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCampaignFeedResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateCampaignFeedResult>() {
    @java.lang.Override
    public MutateCampaignFeedResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MutateCampaignFeedResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCampaignFeedResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.MutateCampaignFeedResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
