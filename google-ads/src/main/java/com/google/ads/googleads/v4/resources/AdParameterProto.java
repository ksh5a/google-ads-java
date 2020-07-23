// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/ad_parameter.proto

package com.google.ads.googleads.v4.resources;

public final class AdParameterProto {
  private AdParameterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_AdParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_AdParameter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v4/resources/ad_p" +
      "arameter.proto\022!google.ads.googleads.v4." +
      "resources\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\032\036google/pr" +
      "otobuf/wrappers.proto\032\034google/api/annota" +
      "tions.proto\"\215\003\n\013AdParameter\022C\n\rresource_" +
      "name\030\001 \001(\tB,\340A\005\372A&\n$googleads.googleapis" +
      ".com/AdParameter\022k\n\022ad_group_criterion\030\002" +
      " \001(\0132\034.google.protobuf.StringValueB1\340A\005\372" +
      "A+\n)googleads.googleapis.com/AdGroupCrit" +
      "erion\0229\n\017parameter_index\030\003 \001(\0132\033.google." +
      "protobuf.Int64ValueB\003\340A\005\0224\n\016insertion_te" +
      "xt\030\004 \001(\0132\034.google.protobuf.StringValue:[" +
      "\352AX\n$googleads.googleapis.com/AdParamete" +
      "r\0220customers/{customer}/adParameters/{ad" +
      "_parameter}B\375\001\n%com.google.ads.googleads" +
      ".v4.resourcesB\020AdParameterProtoP\001ZJgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v4/resources;resources\242\002\003GAA\252\002!Go" +
      "ogle.Ads.GoogleAds.V4.Resources\312\002!Google" +
      "\\Ads\\GoogleAds\\V4\\Resources\352\002%Google::Ad" +
      "s::GoogleAds::V4::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_AdParameter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_AdParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_AdParameter_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterion", "ParameterIndex", "InsertionText", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}