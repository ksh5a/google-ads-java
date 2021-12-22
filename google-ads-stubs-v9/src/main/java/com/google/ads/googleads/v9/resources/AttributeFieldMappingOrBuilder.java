// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/feed_mapping.proto

package com.google.ads.googleads.v9.resources;

public interface AttributeFieldMappingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.resources.AttributeFieldMapping)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Feed attribute from which to map.
   * </pre>
   *
   * <code>optional int64 feed_attribute_id = 24 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the feedAttributeId field is set.
   */
  boolean hasFeedAttributeId();
  /**
   * <pre>
   * Immutable. Feed attribute from which to map.
   * </pre>
   *
   * <code>optional int64 feed_attribute_id = 24 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The feedAttributeId.
   */
  long getFeedAttributeId();

  /**
   * <pre>
   * Output only. The placeholder field ID. If a placeholder field enum is not published in
   * the current API version, then this field will be populated and the field
   * oneof will be empty.
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 field_id = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the fieldId field is set.
   */
  boolean hasFieldId();
  /**
   * <pre>
   * Output only. The placeholder field ID. If a placeholder field enum is not published in
   * the current API version, then this field will be populated and the field
   * oneof will be empty.
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 field_id = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldId.
   */
  long getFieldId();

  /**
   * <pre>
   * Immutable. Sitelink Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SitelinkPlaceholderFieldEnum.SitelinkPlaceholderField sitelink_field = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the sitelinkField field is set.
   */
  boolean hasSitelinkField();
  /**
   * <pre>
   * Immutable. Sitelink Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SitelinkPlaceholderFieldEnum.SitelinkPlaceholderField sitelink_field = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for sitelinkField.
   */
  int getSitelinkFieldValue();
  /**
   * <pre>
   * Immutable. Sitelink Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.SitelinkPlaceholderFieldEnum.SitelinkPlaceholderField sitelink_field = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The sitelinkField.
   */
  com.google.ads.googleads.v9.enums.SitelinkPlaceholderFieldEnum.SitelinkPlaceholderField getSitelinkField();

  /**
   * <pre>
   * Immutable. Call Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CallPlaceholderFieldEnum.CallPlaceholderField call_field = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the callField field is set.
   */
  boolean hasCallField();
  /**
   * <pre>
   * Immutable. Call Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CallPlaceholderFieldEnum.CallPlaceholderField call_field = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for callField.
   */
  int getCallFieldValue();
  /**
   * <pre>
   * Immutable. Call Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CallPlaceholderFieldEnum.CallPlaceholderField call_field = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The callField.
   */
  com.google.ads.googleads.v9.enums.CallPlaceholderFieldEnum.CallPlaceholderField getCallField();

  /**
   * <pre>
   * Immutable. App Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AppPlaceholderFieldEnum.AppPlaceholderField app_field = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the appField field is set.
   */
  boolean hasAppField();
  /**
   * <pre>
   * Immutable. App Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AppPlaceholderFieldEnum.AppPlaceholderField app_field = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for appField.
   */
  int getAppFieldValue();
  /**
   * <pre>
   * Immutable. App Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AppPlaceholderFieldEnum.AppPlaceholderField app_field = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The appField.
   */
  com.google.ads.googleads.v9.enums.AppPlaceholderFieldEnum.AppPlaceholderField getAppField();

  /**
   * <pre>
   * Output only. Location Placeholder Fields. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.LocationPlaceholderFieldEnum.LocationPlaceholderField location_field = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the locationField field is set.
   */
  boolean hasLocationField();
  /**
   * <pre>
   * Output only. Location Placeholder Fields. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.LocationPlaceholderFieldEnum.LocationPlaceholderField location_field = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for locationField.
   */
  int getLocationFieldValue();
  /**
   * <pre>
   * Output only. Location Placeholder Fields. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.LocationPlaceholderFieldEnum.LocationPlaceholderField location_field = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The locationField.
   */
  com.google.ads.googleads.v9.enums.LocationPlaceholderFieldEnum.LocationPlaceholderField getLocationField();

  /**
   * <pre>
   * Output only. Affiliate Location Placeholder Fields. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AffiliateLocationPlaceholderFieldEnum.AffiliateLocationPlaceholderField affiliate_location_field = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the affiliateLocationField field is set.
   */
  boolean hasAffiliateLocationField();
  /**
   * <pre>
   * Output only. Affiliate Location Placeholder Fields. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AffiliateLocationPlaceholderFieldEnum.AffiliateLocationPlaceholderField affiliate_location_field = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for affiliateLocationField.
   */
  int getAffiliateLocationFieldValue();
  /**
   * <pre>
   * Output only. Affiliate Location Placeholder Fields. This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AffiliateLocationPlaceholderFieldEnum.AffiliateLocationPlaceholderField affiliate_location_field = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The affiliateLocationField.
   */
  com.google.ads.googleads.v9.enums.AffiliateLocationPlaceholderFieldEnum.AffiliateLocationPlaceholderField getAffiliateLocationField();

  /**
   * <pre>
   * Immutable. Callout Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CalloutPlaceholderFieldEnum.CalloutPlaceholderField callout_field = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the calloutField field is set.
   */
  boolean hasCalloutField();
  /**
   * <pre>
   * Immutable. Callout Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CalloutPlaceholderFieldEnum.CalloutPlaceholderField callout_field = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for calloutField.
   */
  int getCalloutFieldValue();
  /**
   * <pre>
   * Immutable. Callout Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CalloutPlaceholderFieldEnum.CalloutPlaceholderField callout_field = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The calloutField.
   */
  com.google.ads.googleads.v9.enums.CalloutPlaceholderFieldEnum.CalloutPlaceholderField getCalloutField();

  /**
   * <pre>
   * Immutable. Structured Snippet Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.StructuredSnippetPlaceholderFieldEnum.StructuredSnippetPlaceholderField structured_snippet_field = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the structuredSnippetField field is set.
   */
  boolean hasStructuredSnippetField();
  /**
   * <pre>
   * Immutable. Structured Snippet Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.StructuredSnippetPlaceholderFieldEnum.StructuredSnippetPlaceholderField structured_snippet_field = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for structuredSnippetField.
   */
  int getStructuredSnippetFieldValue();
  /**
   * <pre>
   * Immutable. Structured Snippet Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.StructuredSnippetPlaceholderFieldEnum.StructuredSnippetPlaceholderField structured_snippet_field = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The structuredSnippetField.
   */
  com.google.ads.googleads.v9.enums.StructuredSnippetPlaceholderFieldEnum.StructuredSnippetPlaceholderField getStructuredSnippetField();

  /**
   * <pre>
   * Immutable. Message Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.MessagePlaceholderFieldEnum.MessagePlaceholderField message_field = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the messageField field is set.
   */
  boolean hasMessageField();
  /**
   * <pre>
   * Immutable. Message Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.MessagePlaceholderFieldEnum.MessagePlaceholderField message_field = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for messageField.
   */
  int getMessageFieldValue();
  /**
   * <pre>
   * Immutable. Message Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.MessagePlaceholderFieldEnum.MessagePlaceholderField message_field = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The messageField.
   */
  com.google.ads.googleads.v9.enums.MessagePlaceholderFieldEnum.MessagePlaceholderField getMessageField();

  /**
   * <pre>
   * Immutable. Price Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PricePlaceholderFieldEnum.PricePlaceholderField price_field = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the priceField field is set.
   */
  boolean hasPriceField();
  /**
   * <pre>
   * Immutable. Price Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PricePlaceholderFieldEnum.PricePlaceholderField price_field = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for priceField.
   */
  int getPriceFieldValue();
  /**
   * <pre>
   * Immutable. Price Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PricePlaceholderFieldEnum.PricePlaceholderField price_field = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The priceField.
   */
  com.google.ads.googleads.v9.enums.PricePlaceholderFieldEnum.PricePlaceholderField getPriceField();

  /**
   * <pre>
   * Immutable. Promotion Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PromotionPlaceholderFieldEnum.PromotionPlaceholderField promotion_field = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the promotionField field is set.
   */
  boolean hasPromotionField();
  /**
   * <pre>
   * Immutable. Promotion Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PromotionPlaceholderFieldEnum.PromotionPlaceholderField promotion_field = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for promotionField.
   */
  int getPromotionFieldValue();
  /**
   * <pre>
   * Immutable. Promotion Placeholder Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.PromotionPlaceholderFieldEnum.PromotionPlaceholderField promotion_field = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The promotionField.
   */
  com.google.ads.googleads.v9.enums.PromotionPlaceholderFieldEnum.PromotionPlaceholderField getPromotionField();

  /**
   * <pre>
   * Immutable. Ad Customizer Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AdCustomizerPlaceholderFieldEnum.AdCustomizerPlaceholderField ad_customizer_field = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the adCustomizerField field is set.
   */
  boolean hasAdCustomizerField();
  /**
   * <pre>
   * Immutable. Ad Customizer Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AdCustomizerPlaceholderFieldEnum.AdCustomizerPlaceholderField ad_customizer_field = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for adCustomizerField.
   */
  int getAdCustomizerFieldValue();
  /**
   * <pre>
   * Immutable. Ad Customizer Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.AdCustomizerPlaceholderFieldEnum.AdCustomizerPlaceholderField ad_customizer_field = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The adCustomizerField.
   */
  com.google.ads.googleads.v9.enums.AdCustomizerPlaceholderFieldEnum.AdCustomizerPlaceholderField getAdCustomizerField();

  /**
   * <pre>
   * Immutable. Dynamic Search Ad Page Feed Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.DsaPageFeedCriterionFieldEnum.DsaPageFeedCriterionField dsa_page_feed_field = 14 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the dsaPageFeedField field is set.
   */
  boolean hasDsaPageFeedField();
  /**
   * <pre>
   * Immutable. Dynamic Search Ad Page Feed Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.DsaPageFeedCriterionFieldEnum.DsaPageFeedCriterionField dsa_page_feed_field = 14 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for dsaPageFeedField.
   */
  int getDsaPageFeedFieldValue();
  /**
   * <pre>
   * Immutable. Dynamic Search Ad Page Feed Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.DsaPageFeedCriterionFieldEnum.DsaPageFeedCriterionField dsa_page_feed_field = 14 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The dsaPageFeedField.
   */
  com.google.ads.googleads.v9.enums.DsaPageFeedCriterionFieldEnum.DsaPageFeedCriterionField getDsaPageFeedField();

  /**
   * <pre>
   * Immutable. Location Target Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.LocationExtensionTargetingCriterionFieldEnum.LocationExtensionTargetingCriterionField location_extension_targeting_field = 15 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the locationExtensionTargetingField field is set.
   */
  boolean hasLocationExtensionTargetingField();
  /**
   * <pre>
   * Immutable. Location Target Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.LocationExtensionTargetingCriterionFieldEnum.LocationExtensionTargetingCriterionField location_extension_targeting_field = 15 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for locationExtensionTargetingField.
   */
  int getLocationExtensionTargetingFieldValue();
  /**
   * <pre>
   * Immutable. Location Target Fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.LocationExtensionTargetingCriterionFieldEnum.LocationExtensionTargetingCriterionField location_extension_targeting_field = 15 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The locationExtensionTargetingField.
   */
  com.google.ads.googleads.v9.enums.LocationExtensionTargetingCriterionFieldEnum.LocationExtensionTargetingCriterionField getLocationExtensionTargetingField();

  /**
   * <pre>
   * Immutable. Education Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.EducationPlaceholderFieldEnum.EducationPlaceholderField education_field = 16 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the educationField field is set.
   */
  boolean hasEducationField();
  /**
   * <pre>
   * Immutable. Education Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.EducationPlaceholderFieldEnum.EducationPlaceholderField education_field = 16 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for educationField.
   */
  int getEducationFieldValue();
  /**
   * <pre>
   * Immutable. Education Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.EducationPlaceholderFieldEnum.EducationPlaceholderField education_field = 16 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The educationField.
   */
  com.google.ads.googleads.v9.enums.EducationPlaceholderFieldEnum.EducationPlaceholderField getEducationField();

  /**
   * <pre>
   * Immutable. Flight Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.FlightPlaceholderFieldEnum.FlightPlaceholderField flight_field = 17 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the flightField field is set.
   */
  boolean hasFlightField();
  /**
   * <pre>
   * Immutable. Flight Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.FlightPlaceholderFieldEnum.FlightPlaceholderField flight_field = 17 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for flightField.
   */
  int getFlightFieldValue();
  /**
   * <pre>
   * Immutable. Flight Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.FlightPlaceholderFieldEnum.FlightPlaceholderField flight_field = 17 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The flightField.
   */
  com.google.ads.googleads.v9.enums.FlightPlaceholderFieldEnum.FlightPlaceholderField getFlightField();

  /**
   * <pre>
   * Immutable. Custom Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CustomPlaceholderFieldEnum.CustomPlaceholderField custom_field = 18 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the customField field is set.
   */
  boolean hasCustomField();
  /**
   * <pre>
   * Immutable. Custom Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CustomPlaceholderFieldEnum.CustomPlaceholderField custom_field = 18 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for customField.
   */
  int getCustomFieldValue();
  /**
   * <pre>
   * Immutable. Custom Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.CustomPlaceholderFieldEnum.CustomPlaceholderField custom_field = 18 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The customField.
   */
  com.google.ads.googleads.v9.enums.CustomPlaceholderFieldEnum.CustomPlaceholderField getCustomField();

  /**
   * <pre>
   * Immutable. Hotel Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.HotelPlaceholderFieldEnum.HotelPlaceholderField hotel_field = 19 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the hotelField field is set.
   */
  boolean hasHotelField();
  /**
   * <pre>
   * Immutable. Hotel Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.HotelPlaceholderFieldEnum.HotelPlaceholderField hotel_field = 19 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for hotelField.
   */
  int getHotelFieldValue();
  /**
   * <pre>
   * Immutable. Hotel Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.HotelPlaceholderFieldEnum.HotelPlaceholderField hotel_field = 19 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The hotelField.
   */
  com.google.ads.googleads.v9.enums.HotelPlaceholderFieldEnum.HotelPlaceholderField getHotelField();

  /**
   * <pre>
   * Immutable. Real Estate Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.RealEstatePlaceholderFieldEnum.RealEstatePlaceholderField real_estate_field = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the realEstateField field is set.
   */
  boolean hasRealEstateField();
  /**
   * <pre>
   * Immutable. Real Estate Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.RealEstatePlaceholderFieldEnum.RealEstatePlaceholderField real_estate_field = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for realEstateField.
   */
  int getRealEstateFieldValue();
  /**
   * <pre>
   * Immutable. Real Estate Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.RealEstatePlaceholderFieldEnum.RealEstatePlaceholderField real_estate_field = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The realEstateField.
   */
  com.google.ads.googleads.v9.enums.RealEstatePlaceholderFieldEnum.RealEstatePlaceholderField getRealEstateField();

  /**
   * <pre>
   * Immutable. Travel Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.TravelPlaceholderFieldEnum.TravelPlaceholderField travel_field = 21 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the travelField field is set.
   */
  boolean hasTravelField();
  /**
   * <pre>
   * Immutable. Travel Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.TravelPlaceholderFieldEnum.TravelPlaceholderField travel_field = 21 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for travelField.
   */
  int getTravelFieldValue();
  /**
   * <pre>
   * Immutable. Travel Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.TravelPlaceholderFieldEnum.TravelPlaceholderField travel_field = 21 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The travelField.
   */
  com.google.ads.googleads.v9.enums.TravelPlaceholderFieldEnum.TravelPlaceholderField getTravelField();

  /**
   * <pre>
   * Immutable. Local Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.LocalPlaceholderFieldEnum.LocalPlaceholderField local_field = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the localField field is set.
   */
  boolean hasLocalField();
  /**
   * <pre>
   * Immutable. Local Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.LocalPlaceholderFieldEnum.LocalPlaceholderField local_field = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for localField.
   */
  int getLocalFieldValue();
  /**
   * <pre>
   * Immutable. Local Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.LocalPlaceholderFieldEnum.LocalPlaceholderField local_field = 22 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The localField.
   */
  com.google.ads.googleads.v9.enums.LocalPlaceholderFieldEnum.LocalPlaceholderField getLocalField();

  /**
   * <pre>
   * Immutable. Job Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.JobPlaceholderFieldEnum.JobPlaceholderField job_field = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the jobField field is set.
   */
  boolean hasJobField();
  /**
   * <pre>
   * Immutable. Job Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.JobPlaceholderFieldEnum.JobPlaceholderField job_field = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for jobField.
   */
  int getJobFieldValue();
  /**
   * <pre>
   * Immutable. Job Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.JobPlaceholderFieldEnum.JobPlaceholderField job_field = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The jobField.
   */
  com.google.ads.googleads.v9.enums.JobPlaceholderFieldEnum.JobPlaceholderField getJobField();

  /**
   * <pre>
   * Immutable. Image Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.ImagePlaceholderFieldEnum.ImagePlaceholderField image_field = 26 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the imageField field is set.
   */
  boolean hasImageField();
  /**
   * <pre>
   * Immutable. Image Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.ImagePlaceholderFieldEnum.ImagePlaceholderField image_field = 26 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for imageField.
   */
  int getImageFieldValue();
  /**
   * <pre>
   * Immutable. Image Placeholder Fields
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.ImagePlaceholderFieldEnum.ImagePlaceholderField image_field = 26 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The imageField.
   */
  com.google.ads.googleads.v9.enums.ImagePlaceholderFieldEnum.ImagePlaceholderField getImageField();

  public com.google.ads.googleads.v9.resources.AttributeFieldMapping.FieldCase getFieldCase();
}