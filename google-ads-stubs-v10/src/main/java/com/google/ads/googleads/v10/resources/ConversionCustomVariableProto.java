// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/conversion_custom_variable.proto

package com.google.ads.googleads.v10.resources;

public final class ConversionCustomVariableProto {
  private ConversionCustomVariableProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ConversionCustomVariable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ConversionCustomVariable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v10/resources/con" +
      "version_custom_variable.proto\022\"google.ad" +
      "s.googleads.v10.resources\032Fgoogle/ads/go" +
      "ogleads/v10/enums/conversion_custom_vari" +
      "able_status.proto\032\034google/api/annotation" +
      "s.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\"\350\003\n\030Conversi" +
      "onCustomVariable\022P\n\rresource_name\030\001 \001(\tB" +
      "9\340A\005\372A3\n1googleads.googleapis.com/Conver" +
      "sionCustomVariable\022\017\n\002id\030\002 \001(\003B\003\340A\003\022\021\n\004n" +
      "ame\030\003 \001(\tB\003\340A\002\022\023\n\003tag\030\004 \001(\tB\006\340A\002\340A\005\022q\n\006s" +
      "tatus\030\005 \001(\0162a.google.ads.googleads.v10.e" +
      "nums.ConversionCustomVariableStatusEnum." +
      "ConversionCustomVariableStatus\022A\n\016owner_" +
      "customer\030\006 \001(\tB)\340A\003\372A#\n!googleads.google" +
      "apis.com/Customer:\212\001\352A\206\001\n1googleads.goog" +
      "leapis.com/ConversionCustomVariable\022Qcus" +
      "tomers/{customer_id}/conversionCustomVar" +
      "iables/{conversion_custom_variable_id}B\217" +
      "\002\n&com.google.ads.googleads.v10.resource" +
      "sB\035ConversionCustomVariableProtoP\001ZKgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v10/resources;resources\242\002\003GAA\252\002\"" +
      "Google.Ads.GoogleAds.V10.Resources\312\002\"Goo" +
      "gle\\Ads\\GoogleAds\\V10\\Resources\352\002&Google" +
      "::Ads::GoogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.ConversionCustomVariableStatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_ConversionCustomVariable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ConversionCustomVariable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ConversionCustomVariable_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Tag", "Status", "OwnerCustomer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.ConversionCustomVariableStatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}