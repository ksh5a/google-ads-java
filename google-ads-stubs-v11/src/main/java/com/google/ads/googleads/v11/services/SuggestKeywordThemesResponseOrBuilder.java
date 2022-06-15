// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/smart_campaign_suggest_service.proto

package com.google.ads.googleads.v11.services;

public interface SuggestKeywordThemesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.SuggestKeywordThemesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Smart campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.resources.KeywordThemeConstant keyword_themes = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v11.resources.KeywordThemeConstant> 
      getKeywordThemesList();
  /**
   * <pre>
   * Smart campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.resources.KeywordThemeConstant keyword_themes = 1;</code>
   */
  com.google.ads.googleads.v11.resources.KeywordThemeConstant getKeywordThemes(int index);
  /**
   * <pre>
   * Smart campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.resources.KeywordThemeConstant keyword_themes = 1;</code>
   */
  int getKeywordThemesCount();
  /**
   * <pre>
   * Smart campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.resources.KeywordThemeConstant keyword_themes = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.resources.KeywordThemeConstantOrBuilder> 
      getKeywordThemesOrBuilderList();
  /**
   * <pre>
   * Smart campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.resources.KeywordThemeConstant keyword_themes = 1;</code>
   */
  com.google.ads.googleads.v11.resources.KeywordThemeConstantOrBuilder getKeywordThemesOrBuilder(
      int index);
}