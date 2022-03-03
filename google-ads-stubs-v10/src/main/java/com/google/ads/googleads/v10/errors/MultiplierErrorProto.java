// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/multiplier_error.proto

package com.google.ads.googleads.v10.errors;

public final class MultiplierErrorProto {
  private MultiplierErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_MultiplierErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_MultiplierErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v10/errors/multip" +
      "lier_error.proto\022\037google.ads.googleads.v" +
      "10.errors\032\034google/api/annotations.proto\"" +
      "\317\004\n\023MultiplierErrorEnum\"\267\004\n\017MultiplierEr" +
      "ror\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\027\n\023MUL" +
      "TIPLIER_TOO_HIGH\020\002\022\026\n\022MULTIPLIER_TOO_LOW" +
      "\020\003\022\036\n\032TOO_MANY_FRACTIONAL_DIGITS\020\004\022/\n+MU" +
      "LTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEG" +
      "Y\020\005\0223\n/MULTIPLIER_NOT_ALLOWED_WHEN_BASE_" +
      "BID_IS_MISSING\020\006\022\033\n\027NO_MULTIPLIER_SPECIF" +
      "IED\020\007\0220\n,MULTIPLIER_CAUSES_BID_TO_EXCEED" +
      "_DAILY_BUDGET\020\010\0222\n.MULTIPLIER_CAUSES_BID" +
      "_TO_EXCEED_MONTHLY_BUDGET\020\t\0221\n-MULTIPLIE" +
      "R_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET\020\n\0223" +
      "\n/MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_AL" +
      "LOWED_BID\020\013\0221\n-BID_LESS_THAN_MIN_ALLOWED" +
      "_BID_WITH_MULTIPLIER\020\014\0221\n-MULTIPLIER_AND" +
      "_BIDDING_STRATEGY_TYPE_MISMATCH\020\rB\364\001\n#co" +
      "m.google.ads.googleads.v10.errorsB\024Multi" +
      "plierErrorProtoP\001ZEgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v10/error" +
      "s;errors\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V1" +
      "0.Errors\312\002\037Google\\Ads\\GoogleAds\\V10\\Erro" +
      "rs\352\002#Google::Ads::GoogleAds::V10::Errors" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_MultiplierErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_MultiplierErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_MultiplierErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}