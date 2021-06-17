// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/resources/customer_user_access.proto

package com.google.ads.googleads.v7.resources;

public final class CustomerUserAccessProto {
  private CustomerUserAccessProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_resources_CustomerUserAccess_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_resources_CustomerUserAccess_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v7/resources/cust" +
      "omer_user_access.proto\022!google.ads.googl" +
      "eads.v7.resources\032/google/ads/googleads/" +
      "v7/enums/access_role.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\032\034google/api/annotations.proto\"\372\003\n" +
      "\022CustomerUserAccess\022J\n\rresource_name\030\001 \001" +
      "(\tB3\340A\005\372A-\n+googleads.googleapis.com/Cus" +
      "tomerUserAccess\022\024\n\007user_id\030\002 \001(\003B\003\340A\003\022\037\n" +
      "\remail_address\030\003 \001(\tB\003\340A\003H\000\210\001\001\022M\n\013access" +
      "_role\030\004 \001(\01628.google.ads.googleads.v7.en" +
      "ums.AccessRoleEnum.AccessRole\022+\n\031access_" +
      "creation_date_time\030\006 \001(\tB\003\340A\003H\001\210\001\001\022,\n\032in" +
      "viter_user_email_address\030\007 \001(\tB\003\340A\003H\002\210\001\001" +
      ":h\352Ae\n+googleads.googleapis.com/Customer" +
      "UserAccess\0226customers/{customer_id}/cust" +
      "omerUserAccesses/{user_id}B\020\n\016_email_add" +
      "ressB\034\n\032_access_creation_date_timeB\035\n\033_i" +
      "nviter_user_email_addressB\204\002\n%com.google" +
      ".ads.googleads.v7.resourcesB\027CustomerUse" +
      "rAccessProtoP\001ZJgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v7/resources" +
      ";resources\242\002\003GAA\252\002!Google.Ads.GoogleAds." +
      "V7.Resources\312\002!Google\\Ads\\GoogleAds\\V7\\R" +
      "esources\352\002%Google::Ads::GoogleAds::V7::R" +
      "esourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.enums.AccessRoleProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_resources_CustomerUserAccess_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_resources_CustomerUserAccess_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_resources_CustomerUserAccess_descriptor,
        new java.lang.String[] { "ResourceName", "UserId", "EmailAddress", "AccessRole", "AccessCreationDateTime", "InviterUserEmailAddress", "EmailAddress", "AccessCreationDateTime", "InviterUserEmailAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v7.enums.AccessRoleProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}