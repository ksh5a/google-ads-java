// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/ad_asset.proto

package com.google.ads.googleads.v12.common;

public final class AdAssetProto {
  private AdAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_AdTextAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_AdTextAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_AdImageAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_AdImageAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_AdVideoAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_AdVideoAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_AdMediaBundleAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_AdMediaBundleAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_AdDiscoveryCarouselCardAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_AdDiscoveryCarouselCardAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/ads/googleads/v12/common/ad_ass" +
      "et.proto\022\037google.ads.googleads.v12.commo" +
      "n\0322google/ads/googleads/v12/common/asset" +
      "_policy.proto\032<google/ads/googleads/v12/" +
      "enums/asset_performance_label.proto\032<goo" +
      "gle/ads/googleads/v12/enums/served_asset" +
      "_field_type.proto\"\324\002\n\013AdTextAsset\022\021\n\004tex" +
      "t\030\004 \001(\tH\000\210\001\001\022c\n\014pinned_field\030\002 \001(\0162M.goo" +
      "gle.ads.googleads.v12.enums.ServedAssetF" +
      "ieldTypeEnum.ServedAssetFieldType\022p\n\027ass" +
      "et_performance_label\030\005 \001(\0162O.google.ads." +
      "googleads.v12.enums.AssetPerformanceLabe" +
      "lEnum.AssetPerformanceLabel\022R\n\023policy_su" +
      "mmary_info\030\006 \001(\01325.google.ads.googleads." +
      "v12.common.AdAssetPolicySummaryB\007\n\005_text" +
      "\",\n\014AdImageAsset\022\022\n\005asset\030\002 \001(\tH\000\210\001\001B\010\n\006" +
      "_asset\",\n\014AdVideoAsset\022\022\n\005asset\030\002 \001(\tH\000\210" +
      "\001\001B\010\n\006_asset\"2\n\022AdMediaBundleAsset\022\022\n\005as" +
      "set\030\002 \001(\tH\000\210\001\001B\010\n\006_asset\"<\n\034AdDiscoveryC" +
      "arouselCardAsset\022\022\n\005asset\030\001 \001(\tH\000\210\001\001B\010\n\006" +
      "_assetB\354\001\n#com.google.ads.googleads.v12." +
      "commonB\014AdAssetProtoP\001ZEgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v12/" +
      "common;common\242\002\003GAA\252\002\037Google.Ads.GoogleA" +
      "ds.V12.Common\312\002\037Google\\Ads\\GoogleAds\\V12" +
      "\\Common\352\002#Google::Ads::GoogleAds::V12::C" +
      "ommonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.common.AssetPolicyProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.AssetPerformanceLabelProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.ServedAssetFieldTypeProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_common_AdTextAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_common_AdTextAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_AdTextAsset_descriptor,
        new java.lang.String[] { "Text", "PinnedField", "AssetPerformanceLabel", "PolicySummaryInfo", "Text", });
    internal_static_google_ads_googleads_v12_common_AdImageAsset_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_common_AdImageAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_AdImageAsset_descriptor,
        new java.lang.String[] { "Asset", "Asset", });
    internal_static_google_ads_googleads_v12_common_AdVideoAsset_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_common_AdVideoAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_AdVideoAsset_descriptor,
        new java.lang.String[] { "Asset", "Asset", });
    internal_static_google_ads_googleads_v12_common_AdMediaBundleAsset_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_common_AdMediaBundleAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_AdMediaBundleAsset_descriptor,
        new java.lang.String[] { "Asset", "Asset", });
    internal_static_google_ads_googleads_v12_common_AdDiscoveryCarouselCardAsset_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v12_common_AdDiscoveryCarouselCardAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_AdDiscoveryCarouselCardAsset_descriptor,
        new java.lang.String[] { "Asset", "Asset", });
    com.google.ads.googleads.v12.common.AssetPolicyProto.getDescriptor();
    com.google.ads.googleads.v12.enums.AssetPerformanceLabelProto.getDescriptor();
    com.google.ads.googleads.v12.enums.ServedAssetFieldTypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}