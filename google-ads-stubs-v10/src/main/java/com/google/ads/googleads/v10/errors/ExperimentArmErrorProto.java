// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/experiment_arm_error.proto

package com.google.ads.googleads.v10.errors;

public final class ExperimentArmErrorProto {
  private ExperimentArmErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_ExperimentArmErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_ExperimentArmErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v10/errors/experi" +
      "ment_arm_error.proto\022\037google.ads.googlea" +
      "ds.v10.errors\032\034google/api/annotations.pr" +
      "oto\"\261\005\n\026ExperimentArmErrorEnum\"\226\005\n\022Exper" +
      "imentArmError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOW" +
      "N\020\001\022\'\n#EXPERIMENT_ARM_COUNT_LIMIT_EXCEED" +
      "ED\020\002\022\033\n\027INVALID_CAMPAIGN_STATUS\020\003\022!\n\035DUP" +
      "LICATE_EXPERIMENT_ARM_NAME\020\004\022%\n!CANNOT_S" +
      "ET_TREATMENT_ARM_CAMPAIGN\020\005\022\036\n\032CANNOT_MO" +
      "DIFY_CAMPAIGN_IDS\020\006\022-\n)CANNOT_MODIFY_CAM" +
      "PAIGN_WITHOUT_SUFFIX_SET\020\007\022+\n\'CANNOT_MUT" +
      "ATE_TRAFFIC_SPLIT_AFTER_START\020\010\022*\n&CANNO" +
      "T_ADD_CAMPAIGN_WITH_SHARED_BUDGET\020\t\022*\n&C" +
      "ANNOT_ADD_CAMPAIGN_WITH_CUSTOM_BUDGET\020\n\022" +
      "4\n0CANNOT_ADD_CAMPAIGNS_WITH_DYNAMIC_ASS" +
      "ETS_ENABLED\020\013\0225\n1UNSUPPORTED_CAMPAIGN_AD" +
      "VERTISING_CHANNEL_SUB_TYPE\020\014\022,\n(CANNOT_A" +
      "DD_BASE_CAMPAIGN_WITH_DATE_RANGE\020\r\0221\n-BI" +
      "DDING_STRATEGY_NOT_SUPPORTED_IN_EXPERIME" +
      "NTS\020\016\0220\n,TRAFFIC_SPLIT_NOT_SUPPORTED_FOR" +
      "_CHANNEL_TYPE\020\017B\367\001\n#com.google.ads.googl" +
      "eads.v10.errorsB\027ExperimentArmErrorProto" +
      "P\001ZEgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v10/errors;errors\242\002\003GAA\252" +
      "\002\037Google.Ads.GoogleAds.V10.Errors\312\002\037Goog" +
      "le\\Ads\\GoogleAds\\V10\\Errors\352\002#Google::Ad" +
      "s::GoogleAds::V10::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_ExperimentArmErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_ExperimentArmErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_ExperimentArmErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}