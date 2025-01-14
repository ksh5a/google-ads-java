// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/segments.proto

package com.google.ads.googleads.v11.common;

public final class SegmentsProto {
  private SegmentsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_common_Segments_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_Segments_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_common_Keyword_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_Keyword_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_common_BudgetCampaignAssociationStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_BudgetCampaignAssociationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_common_AssetInteractionTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_AssetInteractionTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_common_SkAdNetworkSourceApp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_common_SkAdNetworkSourceApp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/ads/googleads/v11/common/segmen" +
      "ts.proto\022\037google.ads.googleads.v11.commo" +
      "n\032.google/ads/googleads/v11/common/crite" +
      "ria.proto\0328google/ads/googleads/v11/enum" +
      "s/ad_destination_type.proto\0324google/ads/" +
      "googleads/v11/enums/ad_network_type.prot" +
      "o\032Ggoogle/ads/googleads/v11/enums/budget" +
      "_campaign_association_status.proto\032/goog" +
      "le/ads/googleads/v11/enums/click_type.pr" +
      "oto\032?google/ads/googleads/v11/enums/conv" +
      "ersion_action_category.proto\032Fgoogle/ads" +
      "/googleads/v11/enums/conversion_attribut" +
      "ion_event_type.proto\032:google/ads/googlea" +
      "ds/v11/enums/conversion_lag_bucket.proto" +
      "\032Hgoogle/ads/googleads/v11/enums/convers" +
      "ion_or_adjustment_lag_bucket.proto\032Lgoog" +
      "le/ads/googleads/v11/enums/conversion_va" +
      "lue_rule_primary_dimension.proto\0320google" +
      "/ads/googleads/v11/enums/day_of_week.pro" +
      "to\032+google/ads/googleads/v11/enums/devic" +
      "e.proto\032?google/ads/googleads/v11/enums/" +
      "external_conversion_source.proto\032>google" +
      "/ads/googleads/v11/enums/hotel_date_sele" +
      "ction_type.proto\0327google/ads/googleads/v" +
      "11/enums/hotel_price_bucket.proto\0324googl" +
      "e/ads/googleads/v11/enums/hotel_rate_typ" +
      "e.proto\0322google/ads/googleads/v11/enums/" +
      "month_of_year.proto\0325google/ads/googlead" +
      "s/v11/enums/placeholder_type.proto\0324goog" +
      "le/ads/googleads/v11/enums/product_chann" +
      "el.proto\032@google/ads/googleads/v11/enums" +
      "/product_channel_exclusivity.proto\0326goog" +
      "le/ads/googleads/v11/enums/product_condi" +
      "tion.proto\0328google/ads/googleads/v11/enu" +
      "ms/recommendation_type.proto\032Dgoogle/ads" +
      "/googleads/v11/enums/search_engine_resul" +
      "ts_page_type.proto\032;google/ads/googleads" +
      "/v11/enums/search_term_match_type.proto\032" +
      "@google/ads/googleads/v11/enums/sk_ad_ne" +
      "twork_ad_event_type.proto\032Egoogle/ads/go" +
      "ogleads/v11/enums/sk_ad_network_attribut" +
      "ion_credit.proto\032<google/ads/googleads/v" +
      "11/enums/sk_ad_network_user_type.proto\032)" +
      "google/ads/googleads/v11/enums/slot.prot" +
      "o\032\031google/api/resource.proto\"\3463\n\010Segment" +
      "s\022e\n\023ad_destination_type\030\210\001 \001(\0162G.google" +
      ".ads.googleads.v11.enums.AdDestinationTy" +
      "peEnum.AdDestinationType\022X\n\017ad_network_t" +
      "ype\030\003 \001(\0162?.google.ads.googleads.v11.enu" +
      "ms.AdNetworkTypeEnum.AdNetworkType\022$\n\026au" +
      "ction_insight_domain\030\221\001 \001(\tH\000\210\001\001\022m\n\"budg" +
      "et_campaign_association_status\030\206\001 \001(\0132@." +
      "google.ads.googleads.v11.common.BudgetCa" +
      "mpaignAssociationStatus\022K\n\nclick_type\030\032 " +
      "\001(\01627.google.ads.googleads.v11.enums.Cli" +
      "ckTypeEnum.ClickType\022N\n\021conversion_actio" +
      "n\030q \001(\tB.\372A+\n)googleads.googleapis.com/C" +
      "onversionActionH\001\210\001\001\022y\n\032conversion_actio" +
      "n_category\0305 \001(\0162U.google.ads.googleads." +
      "v11.enums.ConversionActionCategoryEnum.C" +
      "onversionActionCategory\022#\n\026conversion_ac" +
      "tion_name\030r \001(\tH\002\210\001\001\022\"\n\025conversion_adjus" +
      "tment\030s \001(\010H\003\210\001\001\022\214\001\n!conversion_attribut" +
      "ion_event_type\030\002 \001(\0162a.google.ads.google" +
      "ads.v11.enums.ConversionAttributionEvent" +
      "TypeEnum.ConversionAttributionEventType\022" +
      "j\n\025conversion_lag_bucket\0302 \001(\0162K.google." +
      "ads.googleads.v11.enums.ConversionLagBuc" +
      "ketEnum.ConversionLagBucket\022\220\001\n#conversi" +
      "on_or_adjustment_lag_bucket\0303 \001(\0162c.goog" +
      "le.ads.googleads.v11.enums.ConversionOrA" +
      "djustmentLagBucketEnum.ConversionOrAdjus" +
      "tmentLagBucket\022\021\n\004date\030O \001(\tH\004\210\001\001\022L\n\013day" +
      "_of_week\030\005 \001(\01627.google.ads.googleads.v1" +
      "1.enums.DayOfWeekEnum.DayOfWeek\022A\n\006devic" +
      "e\030\001 \001(\01621.google.ads.googleads.v11.enums" +
      ".DeviceEnum.Device\022y\n\032external_conversio" +
      "n_source\0307 \001(\0162U.google.ads.googleads.v1" +
      "1.enums.ExternalConversionSourceEnum.Ext" +
      "ernalConversionSource\022\037\n\022geo_target_airp" +
      "ort\030t \001(\tH\005\210\001\001\022\036\n\021geo_target_canton\030u \001(" +
      "\tH\006\210\001\001\022\034\n\017geo_target_city\030v \001(\tH\007\210\001\001\022\037\n\022" +
      "geo_target_country\030w \001(\tH\010\210\001\001\022\036\n\021geo_tar" +
      "get_county\030x \001(\tH\t\210\001\001\022 \n\023geo_target_dist" +
      "rict\030y \001(\tH\n\210\001\001\022\035\n\020geo_target_metro\030z \001(" +
      "\tH\013\210\001\001\022.\n!geo_target_most_specific_locat" +
      "ion\030{ \001(\tH\014\210\001\001\022#\n\026geo_target_postal_code" +
      "\030| \001(\tH\r\210\001\001\022 \n\023geo_target_province\030} \001(\t" +
      "H\016\210\001\001\022\036\n\021geo_target_region\030~ \001(\tH\017\210\001\001\022\035\n" +
      "\020geo_target_state\030\177 \001(\tH\020\210\001\001\022\'\n\031hotel_bo" +
      "oking_window_days\030\207\001 \001(\003H\021\210\001\001\022\034\n\017hotel_c" +
      "enter_id\030P \001(\003H\022\210\001\001\022 \n\023hotel_check_in_da" +
      "te\030Q \001(\tH\023\210\001\001\022[\n\032hotel_check_in_day_of_w" +
      "eek\030\t \001(\01627.google.ads.googleads.v11.enu" +
      "ms.DayOfWeekEnum.DayOfWeek\022\027\n\nhotel_city" +
      "\030R \001(\tH\024\210\001\001\022\030\n\013hotel_class\030S \001(\005H\025\210\001\001\022\032\n" +
      "\rhotel_country\030T \001(\tH\026\210\001\001\022t\n\031hotel_date_" +
      "selection_type\030\r \001(\0162Q.google.ads.google" +
      "ads.v11.enums.HotelDateSelectionTypeEnum" +
      ".HotelDateSelectionType\022!\n\024hotel_length_" +
      "of_stay\030U \001(\005H\027\210\001\001\022\037\n\022hotel_rate_rule_id" +
      "\030V \001(\tH\030\210\001\001\022X\n\017hotel_rate_type\030J \001(\0162?.g" +
      "oogle.ads.googleads.v11.enums.HotelRateT" +
      "ypeEnum.HotelRateType\022a\n\022hotel_price_buc" +
      "ket\030N \001(\0162E.google.ads.googleads.v11.enu" +
      "ms.HotelPriceBucketEnum.HotelPriceBucket" +
      "\022\030\n\013hotel_state\030W \001(\tH\031\210\001\001\022\021\n\004hour\030X \001(\005" +
      "H\032\210\001\001\022*\n\035interaction_on_this_extension\030Y" +
      " \001(\010H\033\210\001\001\0229\n\007keyword\030= \001(\0132(.google.ads." +
      "googleads.v11.common.Keyword\022\022\n\005month\030Z " +
      "\001(\tH\034\210\001\001\022R\n\rmonth_of_year\030\022 \001(\0162;.google" +
      ".ads.googleads.v11.enums.MonthOfYearEnum" +
      ".MonthOfYear\022\035\n\020partner_hotel_id\030[ \001(\tH\035" +
      "\210\001\001\022]\n\020placeholder_type\030\024 \001(\0162C.google.a" +
      "ds.googleads.v11.enums.PlaceholderTypeEn" +
      "um.PlaceholderType\022#\n\025product_aggregator" +
      "_id\030\204\001 \001(\003H\036\210\001\001\022,\n\037product_bidding_categ" +
      "ory_level1\030\\ \001(\tH\037\210\001\001\022,\n\037product_bidding" +
      "_category_level2\030] \001(\tH \210\001\001\022,\n\037product_b" +
      "idding_category_level3\030^ \001(\tH!\210\001\001\022,\n\037pro" +
      "duct_bidding_category_level4\030_ \001(\tH\"\210\001\001\022" +
      ",\n\037product_bidding_category_level5\030` \001(\t" +
      "H#\210\001\001\022\032\n\rproduct_brand\030a \001(\tH$\210\001\001\022Z\n\017pro" +
      "duct_channel\030\036 \001(\0162A.google.ads.googlead" +
      "s.v11.enums.ProductChannelEnum.ProductCh" +
      "annel\022|\n\033product_channel_exclusivity\030\037 \001" +
      "(\0162W.google.ads.googleads.v11.enums.Prod" +
      "uctChannelExclusivityEnum.ProductChannel" +
      "Exclusivity\022`\n\021product_condition\030  \001(\0162E" +
      ".google.ads.googleads.v11.enums.ProductC" +
      "onditionEnum.ProductCondition\022\034\n\017product" +
      "_country\030b \001(\tH%\210\001\001\022&\n\031product_custom_at" +
      "tribute0\030c \001(\tH&\210\001\001\022&\n\031product_custom_at" +
      "tribute1\030d \001(\tH\'\210\001\001\022&\n\031product_custom_at" +
      "tribute2\030e \001(\tH(\210\001\001\022&\n\031product_custom_at" +
      "tribute3\030f \001(\tH)\210\001\001\022&\n\031product_custom_at" +
      "tribute4\030g \001(\tH*\210\001\001\022\034\n\017product_item_id\030h" +
      " \001(\tH+\210\001\001\022\035\n\020product_language\030i \001(\tH,\210\001\001" +
      "\022!\n\023product_merchant_id\030\205\001 \001(\003H-\210\001\001\022\035\n\020p" +
      "roduct_store_id\030j \001(\tH.\210\001\001\022\032\n\rproduct_ti" +
      "tle\030k \001(\tH/\210\001\001\022\034\n\017product_type_l1\030l \001(\tH" +
      "0\210\001\001\022\034\n\017product_type_l2\030m \001(\tH1\210\001\001\022\034\n\017pr" +
      "oduct_type_l3\030n \001(\tH2\210\001\001\022\034\n\017product_type" +
      "_l4\030o \001(\tH3\210\001\001\022\034\n\017product_type_l5\030p \001(\tH" +
      "4\210\001\001\022\025\n\007quarter\030\200\001 \001(\tH5\210\001\001\022g\n\023recommend" +
      "ation_type\030\214\001 \001(\0162I.google.ads.googleads" +
      ".v11.enums.RecommendationTypeEnum.Recomm" +
      "endationType\022\204\001\n\037search_engine_results_p" +
      "age_type\030F \001(\0162[.google.ads.googleads.v1" +
      "1.enums.SearchEngineResultsPageTypeEnum." +
      "SearchEngineResultsPageType\022k\n\026search_te" +
      "rm_match_type\030\026 \001(\0162K.google.ads.googlea" +
      "ds.v11.enums.SearchTermMatchTypeEnum.Sea" +
      "rchTermMatchType\022;\n\004slot\030\027 \001(\0162-.google." +
      "ads.googleads.v11.enums.SlotEnum.Slot\022\235\001" +
      "\n\'conversion_value_rule_primary_dimensio" +
      "n\030\212\001 \001(\0162k.google.ads.googleads.v11.enum" +
      "s.ConversionValueRulePrimaryDimensionEnu" +
      "m.ConversionValueRulePrimaryDimension\022\025\n" +
      "\007webpage\030\201\001 \001(\tH6\210\001\001\022\022\n\004week\030\202\001 \001(\tH7\210\001\001" +
      "\022\022\n\004year\030\203\001 \001(\005H8\210\001\001\022,\n\036sk_ad_network_co" +
      "nversion_value\030\211\001 \001(\003H9\210\001\001\022m\n\027sk_ad_netw" +
      "ork_user_type\030\215\001 \001(\0162K.google.ads.google" +
      "ads.v11.enums.SkAdNetworkUserTypeEnum.Sk" +
      "AdNetworkUserType\022w\n\033sk_ad_network_ad_ev" +
      "ent_type\030\216\001 \001(\0162Q.google.ads.googleads.v" +
      "11.enums.SkAdNetworkAdEventTypeEnum.SkAd" +
      "NetworkAdEventType\022]\n\030sk_ad_network_sour" +
      "ce_app\030\217\001 \001(\01325.google.ads.googleads.v11" +
      ".common.SkAdNetworkSourceAppH:\210\001\001\022\210\001\n sk" +
      "_ad_network_attribution_credit\030\220\001 \001(\0162]." +
      "google.ads.googleads.v11.enums.SkAdNetwo" +
      "rkAttributionCreditEnum.SkAdNetworkAttri" +
      "butionCredit\022_\n\030asset_interaction_target" +
      "\030\213\001 \001(\01327.google.ads.googleads.v11.commo" +
      "n.AssetInteractionTargetH;\210\001\001B\031\n\027_auctio" +
      "n_insight_domainB\024\n\022_conversion_actionB\031" +
      "\n\027_conversion_action_nameB\030\n\026_conversion" +
      "_adjustmentB\007\n\005_dateB\025\n\023_geo_target_airp" +
      "ortB\024\n\022_geo_target_cantonB\022\n\020_geo_target" +
      "_cityB\025\n\023_geo_target_countryB\024\n\022_geo_tar" +
      "get_countyB\026\n\024_geo_target_districtB\023\n\021_g" +
      "eo_target_metroB$\n\"_geo_target_most_spec" +
      "ific_locationB\031\n\027_geo_target_postal_code" +
      "B\026\n\024_geo_target_provinceB\024\n\022_geo_target_" +
      "regionB\023\n\021_geo_target_stateB\034\n\032_hotel_bo" +
      "oking_window_daysB\022\n\020_hotel_center_idB\026\n" +
      "\024_hotel_check_in_dateB\r\n\013_hotel_cityB\016\n\014" +
      "_hotel_classB\020\n\016_hotel_countryB\027\n\025_hotel" +
      "_length_of_stayB\025\n\023_hotel_rate_rule_idB\016" +
      "\n\014_hotel_stateB\007\n\005_hourB \n\036_interaction_" +
      "on_this_extensionB\010\n\006_monthB\023\n\021_partner_" +
      "hotel_idB\030\n\026_product_aggregator_idB\"\n _p" +
      "roduct_bidding_category_level1B\"\n _produ" +
      "ct_bidding_category_level2B\"\n _product_b" +
      "idding_category_level3B\"\n _product_biddi" +
      "ng_category_level4B\"\n _product_bidding_c" +
      "ategory_level5B\020\n\016_product_brandB\022\n\020_pro" +
      "duct_countryB\034\n\032_product_custom_attribut" +
      "e0B\034\n\032_product_custom_attribute1B\034\n\032_pro" +
      "duct_custom_attribute2B\034\n\032_product_custo" +
      "m_attribute3B\034\n\032_product_custom_attribut" +
      "e4B\022\n\020_product_item_idB\023\n\021_product_langu" +
      "ageB\026\n\024_product_merchant_idB\023\n\021_product_" +
      "store_idB\020\n\016_product_titleB\022\n\020_product_t" +
      "ype_l1B\022\n\020_product_type_l2B\022\n\020_product_t" +
      "ype_l3B\022\n\020_product_type_l4B\022\n\020_product_t" +
      "ype_l5B\n\n\010_quarterB\n\n\010_webpageB\007\n\005_weekB" +
      "\007\n\005_yearB!\n\037_sk_ad_network_conversion_va" +
      "lueB\033\n\031_sk_ad_network_source_appB\033\n\031_ass" +
      "et_interaction_target\"}\n\007Keyword\022\037\n\022ad_g" +
      "roup_criterion\030\003 \001(\tH\000\210\001\001\022:\n\004info\030\002 \001(\0132" +
      ",.google.ads.googleads.v11.common.Keywor" +
      "dInfoB\025\n\023_ad_group_criterion\"\272\001\n\037BudgetC" +
      "ampaignAssociationStatus\022\025\n\010campaign\030\001 \001" +
      "(\tH\000\210\001\001\022s\n\006status\030\002 \001(\0162c.google.ads.goo" +
      "gleads.v11.enums.BudgetCampaignAssociati" +
      "onStatusEnum.BudgetCampaignAssociationSt" +
      "atusB\013\n\t_campaign\"J\n\026AssetInteractionTar" +
      "get\022\r\n\005asset\030\001 \001(\t\022!\n\031interaction_on_thi" +
      "s_asset\030\002 \001(\010\"`\n\024SkAdNetworkSourceApp\022(\n" +
      "\033sk_ad_network_source_app_id\030\001 \001(\tH\000\210\001\001B" +
      "\036\n\034_sk_ad_network_source_app_idB\355\001\n#com." +
      "google.ads.googleads.v11.commonB\rSegment" +
      "sProtoP\001ZEgoogle.golang.org/genproto/goo" +
      "gleapis/ads/googleads/v11/common;common\242" +
      "\002\003GAA\252\002\037Google.Ads.GoogleAds.V11.Common\312" +
      "\002\037Google\\Ads\\GoogleAds\\V11\\Common\352\002#Goog" +
      "le::Ads::GoogleAds::V11::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.AdDestinationTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.AdNetworkTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.BudgetCampaignAssociationStatusProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ClickTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ConversionAttributionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ConversionLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ConversionValueRulePrimaryDimensionProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.DayOfWeekProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ExternalConversionSourceProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.HotelDateSelectionTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.HotelPriceBucketProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.HotelRateTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.MonthOfYearProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ProductChannelProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ProductChannelExclusivityProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ProductConditionProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.RecommendationTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.SearchEngineResultsPageTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.SearchTermMatchTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.SkAdNetworkAdEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.SkAdNetworkAttributionCreditProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.SkAdNetworkUserTypeProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.SlotProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_common_Segments_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_common_Segments_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_Segments_descriptor,
        new java.lang.String[] { "AdDestinationType", "AdNetworkType", "AuctionInsightDomain", "BudgetCampaignAssociationStatus", "ClickType", "ConversionAction", "ConversionActionCategory", "ConversionActionName", "ConversionAdjustment", "ConversionAttributionEventType", "ConversionLagBucket", "ConversionOrAdjustmentLagBucket", "Date", "DayOfWeek", "Device", "ExternalConversionSource", "GeoTargetAirport", "GeoTargetCanton", "GeoTargetCity", "GeoTargetCountry", "GeoTargetCounty", "GeoTargetDistrict", "GeoTargetMetro", "GeoTargetMostSpecificLocation", "GeoTargetPostalCode", "GeoTargetProvince", "GeoTargetRegion", "GeoTargetState", "HotelBookingWindowDays", "HotelCenterId", "HotelCheckInDate", "HotelCheckInDayOfWeek", "HotelCity", "HotelClass", "HotelCountry", "HotelDateSelectionType", "HotelLengthOfStay", "HotelRateRuleId", "HotelRateType", "HotelPriceBucket", "HotelState", "Hour", "InteractionOnThisExtension", "Keyword", "Month", "MonthOfYear", "PartnerHotelId", "PlaceholderType", "ProductAggregatorId", "ProductBiddingCategoryLevel1", "ProductBiddingCategoryLevel2", "ProductBiddingCategoryLevel3", "ProductBiddingCategoryLevel4", "ProductBiddingCategoryLevel5", "ProductBrand", "ProductChannel", "ProductChannelExclusivity", "ProductCondition", "ProductCountry", "ProductCustomAttribute0", "ProductCustomAttribute1", "ProductCustomAttribute2", "ProductCustomAttribute3", "ProductCustomAttribute4", "ProductItemId", "ProductLanguage", "ProductMerchantId", "ProductStoreId", "ProductTitle", "ProductTypeL1", "ProductTypeL2", "ProductTypeL3", "ProductTypeL4", "ProductTypeL5", "Quarter", "RecommendationType", "SearchEngineResultsPageType", "SearchTermMatchType", "Slot", "ConversionValueRulePrimaryDimension", "Webpage", "Week", "Year", "SkAdNetworkConversionValue", "SkAdNetworkUserType", "SkAdNetworkAdEventType", "SkAdNetworkSourceApp", "SkAdNetworkAttributionCredit", "AssetInteractionTarget", "AuctionInsightDomain", "ConversionAction", "ConversionActionName", "ConversionAdjustment", "Date", "GeoTargetAirport", "GeoTargetCanton", "GeoTargetCity", "GeoTargetCountry", "GeoTargetCounty", "GeoTargetDistrict", "GeoTargetMetro", "GeoTargetMostSpecificLocation", "GeoTargetPostalCode", "GeoTargetProvince", "GeoTargetRegion", "GeoTargetState", "HotelBookingWindowDays", "HotelCenterId", "HotelCheckInDate", "HotelCity", "HotelClass", "HotelCountry", "HotelLengthOfStay", "HotelRateRuleId", "HotelState", "Hour", "InteractionOnThisExtension", "Month", "PartnerHotelId", "ProductAggregatorId", "ProductBiddingCategoryLevel1", "ProductBiddingCategoryLevel2", "ProductBiddingCategoryLevel3", "ProductBiddingCategoryLevel4", "ProductBiddingCategoryLevel5", "ProductBrand", "ProductCountry", "ProductCustomAttribute0", "ProductCustomAttribute1", "ProductCustomAttribute2", "ProductCustomAttribute3", "ProductCustomAttribute4", "ProductItemId", "ProductLanguage", "ProductMerchantId", "ProductStoreId", "ProductTitle", "ProductTypeL1", "ProductTypeL2", "ProductTypeL3", "ProductTypeL4", "ProductTypeL5", "Quarter", "Webpage", "Week", "Year", "SkAdNetworkConversionValue", "SkAdNetworkSourceApp", "AssetInteractionTarget", });
    internal_static_google_ads_googleads_v11_common_Keyword_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_common_Keyword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_Keyword_descriptor,
        new java.lang.String[] { "AdGroupCriterion", "Info", "AdGroupCriterion", });
    internal_static_google_ads_googleads_v11_common_BudgetCampaignAssociationStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v11_common_BudgetCampaignAssociationStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_BudgetCampaignAssociationStatus_descriptor,
        new java.lang.String[] { "Campaign", "Status", "Campaign", });
    internal_static_google_ads_googleads_v11_common_AssetInteractionTarget_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v11_common_AssetInteractionTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_AssetInteractionTarget_descriptor,
        new java.lang.String[] { "Asset", "InteractionOnThisAsset", });
    internal_static_google_ads_googleads_v11_common_SkAdNetworkSourceApp_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v11_common_SkAdNetworkSourceApp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_common_SkAdNetworkSourceApp_descriptor,
        new java.lang.String[] { "SkAdNetworkSourceAppId", "SkAdNetworkSourceAppId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v11.enums.AdDestinationTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.AdNetworkTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.BudgetCampaignAssociationStatusProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ClickTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ConversionAttributionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ConversionLagBucketProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ConversionValueRulePrimaryDimensionProto.getDescriptor();
    com.google.ads.googleads.v11.enums.DayOfWeekProto.getDescriptor();
    com.google.ads.googleads.v11.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ExternalConversionSourceProto.getDescriptor();
    com.google.ads.googleads.v11.enums.HotelDateSelectionTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.HotelPriceBucketProto.getDescriptor();
    com.google.ads.googleads.v11.enums.HotelRateTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.MonthOfYearProto.getDescriptor();
    com.google.ads.googleads.v11.enums.PlaceholderTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ProductChannelProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ProductChannelExclusivityProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ProductConditionProto.getDescriptor();
    com.google.ads.googleads.v11.enums.RecommendationTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.SearchEngineResultsPageTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.SearchTermMatchTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.SkAdNetworkAdEventTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.SkAdNetworkAttributionCreditProto.getDescriptor();
    com.google.ads.googleads.v11.enums.SkAdNetworkUserTypeProto.getDescriptor();
    com.google.ads.googleads.v11.enums.SlotProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
