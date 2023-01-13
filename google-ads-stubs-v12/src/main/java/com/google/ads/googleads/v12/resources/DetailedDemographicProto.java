// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/detailed_demographic.proto

package com.google.ads.googleads.v12.resources;

public final class DetailedDemographicProto {
  private DetailedDemographicProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_DetailedDemographic_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_DetailedDemographic_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v12/resources/det" +
      "ailed_demographic.proto\022\"google.ads.goog" +
      "leads.v12.resources\032Egoogle/ads/googlead" +
      "s/v12/common/criterion_category_availabi" +
      "lity.proto\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\"\302\003\n\023Detai" +
      "ledDemographic\022K\n\rresource_name\030\001 \001(\tB4\340" +
      "A\003\372A.\n,googleads.googleapis.com/Detailed" +
      "Demographic\022\017\n\002id\030\002 \001(\003B\003\340A\003\022\021\n\004name\030\003 \001" +
      "(\tB\003\340A\003\022D\n\006parent\030\004 \001(\tB4\340A\003\372A.\n,googlea" +
      "ds.googleapis.com/DetailedDemographic\022\034\n" +
      "\017launched_to_all\030\005 \001(\010B\003\340A\003\022[\n\016availabil" +
      "ities\030\006 \003(\0132>.google.ads.googleads.v12.c" +
      "ommon.CriterionCategoryAvailabilityB\003\340A\003" +
      ":y\352Av\n,googleads.googleapis.com/Detailed" +
      "Demographic\022Fcustomers/{customer_id}/det" +
      "ailedDemographics/{detailed_demographic_" +
      "id}B\212\002\n&com.google.ads.googleads.v12.res" +
      "ourcesB\030DetailedDemographicProtoP\001ZKgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v12/resources;resources\242\002\003GAA\252\002\"" +
      "Google.Ads.GoogleAds.V12.Resources\312\002\"Goo" +
      "gle\\Ads\\GoogleAds\\V12\\Resources\352\002&Google" +
      "::Ads::GoogleAds::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.common.CriterionCategoryAvailabilityProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_DetailedDemographic_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_DetailedDemographic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_DetailedDemographic_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Parent", "LaunchedToAll", "Availabilities", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.common.CriterionCategoryAvailabilityProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}