// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/batch_job.proto

package com.google.ads.googleads.v10.resources;

public final class BatchJobProto {
  private BatchJobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_BatchJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_BatchJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_BatchJob_BatchJobMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_BatchJob_BatchJobMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v10/resources/bat" +
      "ch_job.proto\022\"google.ads.googleads.v10.r" +
      "esources\0325google/ads/googleads/v10/enums" +
      "/batch_job_status.proto\032\034google/api/anno" +
      "tations.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\"\224\007\n\010Ba" +
      "tchJob\022@\n\rresource_name\030\001 \001(\tB)\340A\005\372A#\n!g" +
      "oogleads.googleapis.com/BatchJob\022\024\n\002id\030\007" +
      " \001(\003B\003\340A\003H\000\210\001\001\022)\n\027next_add_sequence_toke" +
      "n\030\010 \001(\tB\003\340A\003H\001\210\001\001\022T\n\010metadata\030\004 \001(\0132=.go" +
      "ogle.ads.googleads.v10.resources.BatchJo" +
      "b.BatchJobMetadataB\003\340A\003\022V\n\006status\030\005 \001(\0162" +
      "A.google.ads.googleads.v10.enums.BatchJo" +
      "bStatusEnum.BatchJobStatusB\003\340A\003\022(\n\026long_" +
      "running_operation\030\t \001(\tB\003\340A\003H\002\210\001\001\032\224\003\n\020Ba" +
      "tchJobMetadata\022$\n\022creation_date_time\030\010 \001" +
      "(\tB\003\340A\003H\000\210\001\001\022!\n\017start_date_time\030\007 \001(\tB\003\340" +
      "A\003H\001\210\001\001\022&\n\024completion_date_time\030\t \001(\tB\003\340" +
      "A\003H\002\210\001\001\022,\n\032estimated_completion_ratio\030\n " +
      "\001(\001B\003\340A\003H\003\210\001\001\022!\n\017operation_count\030\013 \001(\003B\003" +
      "\340A\003H\004\210\001\001\022*\n\030executed_operation_count\030\014 \001" +
      "(\003B\003\340A\003H\005\210\001\001B\025\n\023_creation_date_timeB\022\n\020_" +
      "start_date_timeB\027\n\025_completion_date_time" +
      "B\035\n\033_estimated_completion_ratioB\022\n\020_oper" +
      "ation_countB\033\n\031_executed_operation_count" +
      ":X\352AU\n!googleads.googleapis.com/BatchJob" +
      "\0220customers/{customer_id}/batchJobs/{bat" +
      "ch_job_id}B\005\n\003_idB\032\n\030_next_add_sequence_" +
      "tokenB\031\n\027_long_running_operationB\377\001\n&com" +
      ".google.ads.googleads.v10.resourcesB\rBat" +
      "chJobProtoP\001ZKgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v10/resources;" +
      "resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V" +
      "10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\" +
      "Resources\352\002&Google::Ads::GoogleAds::V10:" +
      ":Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.BatchJobStatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_BatchJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_BatchJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_BatchJob_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "NextAddSequenceToken", "Metadata", "Status", "LongRunningOperation", "Id", "NextAddSequenceToken", "LongRunningOperation", });
    internal_static_google_ads_googleads_v10_resources_BatchJob_BatchJobMetadata_descriptor =
      internal_static_google_ads_googleads_v10_resources_BatchJob_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_BatchJob_BatchJobMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_BatchJob_BatchJobMetadata_descriptor,
        new java.lang.String[] { "CreationDateTime", "StartDateTime", "CompletionDateTime", "EstimatedCompletionRatio", "OperationCount", "ExecutedOperationCount", "CreationDateTime", "StartDateTime", "CompletionDateTime", "EstimatedCompletionRatio", "OperationCount", "ExecutedOperationCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.BatchJobStatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}