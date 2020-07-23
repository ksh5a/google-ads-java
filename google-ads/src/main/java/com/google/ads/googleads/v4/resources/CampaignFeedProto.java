// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/campaign_feed.proto

package com.google.ads.googleads.v4.resources;

public final class CampaignFeedProto {
  private CampaignFeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_CampaignFeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_CampaignFeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v4/resources/camp" +
      "aign_feed.proto\022!google.ads.googleads.v4" +
      ".resources\0326google/ads/googleads/v4/comm" +
      "on/matching_function.proto\0324google/ads/g" +
      "oogleads/v4/enums/feed_link_status.proto" +
      "\0324google/ads/googleads/v4/enums/placehol" +
      "der_type.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032\036goog" +
      "le/protobuf/wrappers.proto\032\034google/api/a" +
      "nnotations.proto\"\345\004\n\014CampaignFeed\022D\n\rres" +
      "ource_name\030\001 \001(\tB-\340A\005\372A\'\n%googleads.goog" +
      "leapis.com/CampaignFeed\022Q\n\004feed\030\002 \001(\0132\034." +
      "google.protobuf.StringValueB%\340A\005\372A\037\n\035goo" +
      "gleads.googleapis.com/Feed\022Y\n\010campaign\030\003" +
      " \001(\0132\034.google.protobuf.StringValueB)\340A\005\372" +
      "A#\n!googleads.googleapis.com/Campaign\022]\n" +
      "\021placeholder_types\030\004 \003(\0162B.google.ads.go" +
      "ogleads.v4.enums.PlaceholderTypeEnum.Pla" +
      "ceholderType\022K\n\021matching_function\030\005 \001(\0132" +
      "0.google.ads.googleads.v4.common.Matchin" +
      "gFunction\022U\n\006status\030\006 \001(\0162@.google.ads.g" +
      "oogleads.v4.enums.FeedLinkStatusEnum.Fee" +
      "dLinkStatusB\003\340A\003:^\352A[\n%googleads.googlea" +
      "pis.com/CampaignFeed\0222customers/{custome" +
      "r}/campaignFeeds/{campaign_feed}B\376\001\n%com" +
      ".google.ads.googleads.v4.resourcesB\021Camp" +
      "aignFeedProtoP\001ZJgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v4/resource" +
      "s;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds" +
      ".V4.Resources\312\002!Google\\Ads\\GoogleAds\\V4\\" +
      "Resources\352\002%Google::Ads::GoogleAds::V4::" +
      "Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.common.MatchingFunctionProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.FeedLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_CampaignFeed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_CampaignFeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_CampaignFeed_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "Campaign", "PlaceholderTypes", "MatchingFunction", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.common.MatchingFunctionProto.getDescriptor();
    com.google.ads.googleads.v4.enums.FeedLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v4.enums.PlaceholderTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}