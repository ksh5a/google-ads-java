// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/smart_campaign_setting_service.proto

package com.google.ads.googleads.v11.services;

public final class SmartCampaignSettingServiceProto {
  private SmartCampaignSettingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_SmartCampaignSettingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_SmartCampaignSettingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v11/services/smar" +
      "t_campaign_setting_service.proto\022!google" +
      ".ads.googleads.v11.services\032:google/ads/" +
      "googleads/v11/enums/response_content_typ" +
      "e.proto\032?google/ads/googleads/v11/resour" +
      "ces/smart_campaign_setting.proto\032\034google" +
      "/api/annotations.proto\032\027google/api/clien" +
      "t.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\032 google/prot" +
      "obuf/field_mask.proto\032\027google/rpc/status" +
      ".proto\"\265\002\n\"MutateSmartCampaignSettingsRe" +
      "quest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022Y\n\nopera" +
      "tions\030\002 \003(\0132@.google.ads.googleads.v11.s" +
      "ervices.SmartCampaignSettingOperationB\003\340" +
      "A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_" +
      "only\030\004 \001(\010\022j\n\025response_content_type\030\005 \001(" +
      "\0162K.google.ads.googleads.v11.enums.Respo" +
      "nseContentTypeEnum.ResponseContentType\"\232" +
      "\001\n\035SmartCampaignSettingOperation\022H\n\006upda" +
      "te\030\001 \001(\01328.google.ads.googleads.v11.reso" +
      "urces.SmartCampaignSetting\022/\n\013update_mas" +
      "k\030\002 \001(\0132\032.google.protobuf.FieldMask\"\256\001\n#" +
      "MutateSmartCampaignSettingsResponse\0221\n\025p" +
      "artial_failure_error\030\001 \001(\0132\022.google.rpc." +
      "Status\022T\n\007results\030\002 \003(\0132C.google.ads.goo" +
      "gleads.v11.services.MutateSmartCampaignS" +
      "ettingResult\"\307\001\n MutateSmartCampaignSett" +
      "ingResult\022I\n\rresource_name\030\001 \001(\tB2\372A/\n-g" +
      "oogleads.googleapis.com/SmartCampaignSet" +
      "ting\022X\n\026smart_campaign_setting\030\002 \001(\01328.g" +
      "oogle.ads.googleads.v11.resources.SmartC" +
      "ampaignSetting2\364\002\n\033SmartCampaignSettingS" +
      "ervice\022\215\002\n\033MutateSmartCampaignSettings\022E" +
      ".google.ads.googleads.v11.services.Mutat" +
      "eSmartCampaignSettingsRequest\032F.google.a" +
      "ds.googleads.v11.services.MutateSmartCam" +
      "paignSettingsResponse\"_\202\323\344\223\002@\";/v11/cust" +
      "omers/{customer_id=*}/smartCampaignSetti" +
      "ngs:mutate:\001*\332A\026customer_id,operations\032E" +
      "\312A\030googleads.googleapis.com\322A\'https://ww" +
      "w.googleapis.com/auth/adwordsB\214\002\n%com.go" +
      "ogle.ads.googleads.v11.servicesB SmartCa" +
      "mpaignSettingServiceProtoP\001ZIgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v11/services;services\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V11.Services\312\002!Google\\Ads\\Go" +
      "ogleAds\\V11\\Services\352\002%Google::Ads::Goog" +
      "leAds::V11::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.resources.SmartCampaignSettingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v11_services_SmartCampaignSettingOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_services_SmartCampaignSettingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_SmartCampaignSettingOperation_descriptor,
        new java.lang.String[] { "Update", "UpdateMask", });
    internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingResult_descriptor,
        new java.lang.String[] { "ResourceName", "SmartCampaignSetting", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v11.resources.SmartCampaignSettingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
