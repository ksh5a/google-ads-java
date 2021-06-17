// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/account_link.proto

package com.google.ads.googleads.v7.resources;

public final class AccountLinkProto {
  private AccountLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_AccountLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_AccountLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_ThirdPartyAppAnalyticsLinkIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_DataPartnerLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_DataPartnerLinkIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_GoogleAdsLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_GoogleAdsLinkIdentifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v7/resources/acco" +
      "unt_link.proto\022!google.ads.googleads.v7." +
      "resources\0327google/ads/googleads/v7/enums" +
      "/account_link_status.proto\0327google/ads/g" +
      "oogleads/v7/enums/linked_account_type.pr" +
      "oto\0325google/ads/googleads/v7/enums/mobil" +
      "e_app_vendor.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\032\034" +
      "google/api/annotations.proto\"\326\005\n\013Account" +
      "Link\022C\n\rresource_name\030\001 \001(\tB,\340A\005\372A&\n$goo" +
      "gleads.googleapis.com/AccountLink\022!\n\017acc" +
      "ount_link_id\030\010 \001(\003B\003\340A\003H\001\210\001\001\022V\n\006status\030\003" +
      " \001(\0162F.google.ads.googleads.v7.enums.Acc" +
      "ountLinkStatusEnum.AccountLinkStatus\022Y\n\004" +
      "type\030\004 \001(\0162F.google.ads.googleads.v7.enu" +
      "ms.LinkedAccountTypeEnum.LinkedAccountTy" +
      "peB\003\340A\003\022q\n\031third_party_app_analytics\030\005 \001" +
      "(\0132G.google.ads.googleads.v7.resources.T" +
      "hirdPartyAppAnalyticsLinkIdentifierB\003\340A\005" +
      "H\000\022Y\n\014data_partner\030\006 \001(\0132<.google.ads.go" +
      "ogleads.v7.resources.DataPartnerLinkIden" +
      "tifierB\003\340A\003H\000\022U\n\ngoogle_ads\030\007 \001(\0132:.goog" +
      "le.ads.googleads.v7.resources.GoogleAdsL" +
      "inkIdentifierB\003\340A\003H\000:a\352A^\n$googleads.goo" +
      "gleapis.com/AccountLink\0226customers/{cust" +
      "omer_id}/accountLinks/{account_link_id}B" +
      "\020\n\016linked_accountB\022\n\020_account_link_id\"\363\001" +
      "\n$ThirdPartyAppAnalyticsLinkIdentifier\022+" +
      "\n\031app_analytics_provider_id\030\004 \001(\003B\003\340A\005H\000" +
      "\210\001\001\022\030\n\006app_id\030\005 \001(\tB\003\340A\005H\001\210\001\001\022[\n\napp_ven" +
      "dor\030\003 \001(\0162B.google.ads.googleads.v7.enum" +
      "s.MobileAppVendorEnum.MobileAppVendorB\003\340" +
      "A\005B\034\n\032_app_analytics_provider_idB\t\n\007_app" +
      "_id\"R\n\031DataPartnerLinkIdentifier\022!\n\017data" +
      "_partner_id\030\001 \001(\003B\003\340A\005H\000\210\001\001B\022\n\020_data_par" +
      "tner_id\"h\n\027GoogleAdsLinkIdentifier\022@\n\010cu" +
      "stomer\030\003 \001(\tB)\340A\005\372A#\n!googleads.googleap" +
      "is.com/CustomerH\000\210\001\001B\013\n\t_customerB\375\001\n%co" +
      "m.google.ads.googleads.v7.resourcesB\020Acc" +
      "ountLinkProtoP\001ZJgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v7/resource" +
      "s;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds" +
      ".V7.Resources\312\002!Google\\Ads\\GoogleAds\\V7\\" +
      "Resources\352\002%Google::Ads::GoogleAds::V7::" +
      "Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.enums.AccountLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.LinkedAccountTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.enums.MobileAppVendorProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_resources_AccountLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_resources_AccountLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_AccountLink_descriptor,
        new java.lang.String[] { "ResourceName", "AccountLinkId", "Status", "Type", "ThirdPartyAppAnalytics", "DataPartner", "GoogleAds", "LinkedAccount", "AccountLinkId", });
    internal_static_google_ads_googleads_v7_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v7_resources_ThirdPartyAppAnalyticsLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor,
        new java.lang.String[] { "AppAnalyticsProviderId", "AppId", "AppVendor", "AppAnalyticsProviderId", "AppId", });
    internal_static_google_ads_googleads_v7_resources_DataPartnerLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v7_resources_DataPartnerLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_DataPartnerLinkIdentifier_descriptor,
        new java.lang.String[] { "DataPartnerId", "DataPartnerId", });
    internal_static_google_ads_googleads_v7_resources_GoogleAdsLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v7_resources_GoogleAdsLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_GoogleAdsLinkIdentifier_descriptor,
        new java.lang.String[] { "Customer", "Customer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v7.enums.AccountLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v7.enums.LinkedAccountTypeProto.getDescriptor();
    com.google.ads.googleads.v7.enums.MobileAppVendorProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}