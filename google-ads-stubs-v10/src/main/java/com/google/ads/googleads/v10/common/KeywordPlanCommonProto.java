// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/keyword_plan_common.proto

package com.google.ads.googleads.v10.common;

public final class KeywordPlanCommonProto {
  private KeywordPlanCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordPlanHistoricalMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordPlanHistoricalMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_HistoricalMetricsOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_HistoricalMetricsOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_MonthlySearchVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_MonthlySearchVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetricResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetricResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordPlanDeviceSearches_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordPlanDeviceSearches_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordAnnotations_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordAnnotations_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordConcept_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordConcept_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_ConceptGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_ConceptGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v10/common/keywor" +
      "d_plan_common.proto\022\037google.ads.googlead" +
      "s.v10.common\032+google/ads/googleads/v10/c" +
      "ommon/dates.proto\032+google/ads/googleads/" +
      "v10/enums/device.proto\032Ggoogle/ads/googl" +
      "eads/v10/enums/keyword_plan_aggregate_me" +
      "tric_type.proto\032Cgoogle/ads/googleads/v1" +
      "0/enums/keyword_plan_competition_level.p" +
      "roto\032Dgoogle/ads/googleads/v10/enums/key" +
      "word_plan_concept_group_type.proto\0322goog" +
      "le/ads/googleads/v10/enums/month_of_year" +
      ".proto\032\034google/api/annotations.proto\"\352\003\n" +
      "\034KeywordPlanHistoricalMetrics\022!\n\024avg_mon" +
      "thly_searches\030\007 \001(\003H\000\210\001\001\022T\n\026monthly_sear" +
      "ch_volumes\030\006 \003(\01324.google.ads.googleads." +
      "v10.common.MonthlySearchVolume\022p\n\013compet" +
      "ition\030\002 \001(\0162[.google.ads.googleads.v10.e" +
      "nums.KeywordPlanCompetitionLevelEnum.Key" +
      "wordPlanCompetitionLevel\022\036\n\021competition_" +
      "index\030\010 \001(\003H\001\210\001\001\022\'\n\032low_top_of_page_bid_" +
      "micros\030\t \001(\003H\002\210\001\001\022(\n\033high_top_of_page_bi" +
      "d_micros\030\n \001(\003H\003\210\001\001B\027\n\025_avg_monthly_sear" +
      "chesB\024\n\022_competition_indexB\035\n\033_low_top_o" +
      "f_page_bid_microsB\036\n\034_high_top_of_page_b" +
      "id_micros\"\177\n\030HistoricalMetricsOptions\022N\n" +
      "\020year_month_range\030\001 \001(\0132/.google.ads.goo" +
      "gleads.v10.common.YearMonthRangeH\000\210\001\001B\023\n" +
      "\021_year_month_range\"\261\001\n\023MonthlySearchVolu" +
      "me\022\021\n\004year\030\004 \001(\003H\000\210\001\001\022J\n\005month\030\002 \001(\0162;.g" +
      "oogle.ads.googleads.v10.enums.MonthOfYea" +
      "rEnum.MonthOfYear\022\035\n\020monthly_searches\030\005 " +
      "\001(\003H\001\210\001\001B\007\n\005_yearB\023\n\021_monthly_searches\"\241" +
      "\001\n\033KeywordPlanAggregateMetrics\022\201\001\n\026aggre" +
      "gate_metric_types\030\001 \003(\0162a.google.ads.goo" +
      "gleads.v10.enums.KeywordPlanAggregateMet" +
      "ricTypeEnum.KeywordPlanAggregateMetricTy" +
      "pe\"x\n!KeywordPlanAggregateMetricResults\022" +
      "S\n\017device_searches\030\001 \003(\0132:.google.ads.go" +
      "ogleads.v10.common.KeywordPlanDeviceSear" +
      "ches\"\212\001\n\031KeywordPlanDeviceSearches\022A\n\006de" +
      "vice\030\001 \001(\01621.google.ads.googleads.v10.en" +
      "ums.DeviceEnum.Device\022\031\n\014search_count\030\002 " +
      "\001(\003H\000\210\001\001B\017\n\r_search_count\"W\n\022KeywordAnno" +
      "tations\022A\n\010concepts\030\001 \003(\0132/.google.ads.g" +
      "oogleads.v10.common.KeywordConcept\"d\n\016Ke" +
      "ywordConcept\022\014\n\004name\030\001 \001(\t\022D\n\rconcept_gr" +
      "oup\030\002 \001(\0132-.google.ads.googleads.v10.com" +
      "mon.ConceptGroup\"\207\001\n\014ConceptGroup\022\014\n\004nam" +
      "e\030\001 \001(\t\022i\n\004type\030\002 \001(\0162[.google.ads.googl" +
      "eads.v10.enums.KeywordPlanConceptGroupTy" +
      "peEnum.KeywordPlanConceptGroupTypeB\366\001\n#c" +
      "om.google.ads.googleads.v10.commonB\026Keyw" +
      "ordPlanCommonProtoP\001ZEgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v10/co" +
      "mmon;common\242\002\003GAA\252\002\037Google.Ads.GoogleAds" +
      ".V10.Common\312\002\037Google\\Ads\\GoogleAds\\V10\\C" +
      "ommon\352\002#Google::Ads::GoogleAds::V10::Com" +
      "monb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.DatesProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.KeywordPlanAggregateMetricTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.KeywordPlanCompetitionLevelProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.KeywordPlanConceptGroupTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.MonthOfYearProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_common_KeywordPlanHistoricalMetrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_common_KeywordPlanHistoricalMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordPlanHistoricalMetrics_descriptor,
        new java.lang.String[] { "AvgMonthlySearches", "MonthlySearchVolumes", "Competition", "CompetitionIndex", "LowTopOfPageBidMicros", "HighTopOfPageBidMicros", "AvgMonthlySearches", "CompetitionIndex", "LowTopOfPageBidMicros", "HighTopOfPageBidMicros", });
    internal_static_google_ads_googleads_v10_common_HistoricalMetricsOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_common_HistoricalMetricsOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_HistoricalMetricsOptions_descriptor,
        new java.lang.String[] { "YearMonthRange", "YearMonthRange", });
    internal_static_google_ads_googleads_v10_common_MonthlySearchVolume_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_common_MonthlySearchVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_MonthlySearchVolume_descriptor,
        new java.lang.String[] { "Year", "Month", "MonthlySearches", "Year", "MonthlySearches", });
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetrics_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetrics_descriptor,
        new java.lang.String[] { "AggregateMetricTypes", });
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetricResults_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetricResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetricResults_descriptor,
        new java.lang.String[] { "DeviceSearches", });
    internal_static_google_ads_googleads_v10_common_KeywordPlanDeviceSearches_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v10_common_KeywordPlanDeviceSearches_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordPlanDeviceSearches_descriptor,
        new java.lang.String[] { "Device", "SearchCount", "SearchCount", });
    internal_static_google_ads_googleads_v10_common_KeywordAnnotations_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v10_common_KeywordAnnotations_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordAnnotations_descriptor,
        new java.lang.String[] { "Concepts", });
    internal_static_google_ads_googleads_v10_common_KeywordConcept_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v10_common_KeywordConcept_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordConcept_descriptor,
        new java.lang.String[] { "Name", "ConceptGroup", });
    internal_static_google_ads_googleads_v10_common_ConceptGroup_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v10_common_ConceptGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_ConceptGroup_descriptor,
        new java.lang.String[] { "Name", "Type", });
    com.google.ads.googleads.v10.common.DatesProto.getDescriptor();
    com.google.ads.googleads.v10.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v10.enums.KeywordPlanAggregateMetricTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.KeywordPlanCompetitionLevelProto.getDescriptor();
    com.google.ads.googleads.v10.enums.KeywordPlanConceptGroupTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.MonthOfYearProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}