package com.lasteyestudios.fyp.data.models.ipodetailsmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\"J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010E\u001a\u00020\u0013H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0013\u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\fH\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0013\u0010Y\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00cf\u0002\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010_\u001a\u00020`H\u00d6\u0001J\t\u0010a\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u001b\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u001b\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010&\u00a8\u0006b"}, d2 = {"Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/IPODetailsModel;", "", "aboutCompany", "Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/AboutCompany;", "applicationDetails", "", "bannerText", "companyName", "companyShortName", "documentUrl", "endDate", "financials", "", "Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/Financial;", "growwShortName", "issuePrice", "issueSize", "issueType", "listing", "Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/Listing;", "listingDate", "logoUrl", "lotSize", "maxPrice", "minBidQty", "minBidQuantity", "minPrice", "startDate", "status", "subscriptionRates", "Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/SubscriptionRate;", "subscriptionUpdatedAt", "symbol", "faceValue", "(Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/AboutCompany;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/Listing;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAboutCompany", "()Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/AboutCompany;", "getApplicationDetails", "()Ljava/lang/String;", "getBannerText", "getCompanyName", "getCompanyShortName", "getDocumentUrl", "getEndDate", "getFaceValue", "getFinancials", "()Ljava/util/List;", "getGrowwShortName", "getIssuePrice", "getIssueSize", "getIssueType", "getListing", "()Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/Listing;", "getListingDate", "getLogoUrl", "getLotSize", "getMaxPrice", "getMinBidQty", "getMinBidQuantity", "getMinPrice", "getStartDate", "getStatus", "getSubscriptionRates", "getSubscriptionUpdatedAt", "getSymbol", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class IPODetailsModel {
    @org.jetbrains.annotations.Nullable()
    private final com.lasteyestudios.fyp.data.models.ipodetailsmodel.AboutCompany aboutCompany = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String applicationDetails = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bannerText = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String companyName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String companyShortName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String documentUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String endDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.lasteyestudios.fyp.data.models.ipodetailsmodel.Financial> financials = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String growwShortName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String issuePrice = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String issueSize = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String issueType = null;
    @org.jetbrains.annotations.NotNull()
    private final com.lasteyestudios.fyp.data.models.ipodetailsmodel.Listing listing = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String listingDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String logoUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lotSize = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String maxPrice = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String minBidQty = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String minBidQuantity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String minPrice = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String startDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.lasteyestudios.fyp.data.models.ipodetailsmodel.SubscriptionRate> subscriptionRates = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subscriptionUpdatedAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String symbol = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String faceValue = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.lasteyestudios.fyp.data.models.ipodetailsmodel.IPODetailsModel copy(@org.jetbrains.annotations.Nullable()
    com.lasteyestudios.fyp.data.models.ipodetailsmodel.AboutCompany aboutCompany, @org.jetbrains.annotations.Nullable()
    java.lang.String applicationDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String bannerText, @org.jetbrains.annotations.Nullable()
    java.lang.String companyName, @org.jetbrains.annotations.Nullable()
    java.lang.String companyShortName, @org.jetbrains.annotations.Nullable()
    java.lang.String documentUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String endDate, @org.jetbrains.annotations.Nullable()
    java.util.List<com.lasteyestudios.fyp.data.models.ipodetailsmodel.Financial> financials, @org.jetbrains.annotations.Nullable()
    java.lang.String growwShortName, @org.jetbrains.annotations.Nullable()
    java.lang.String issuePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String issueSize, @org.jetbrains.annotations.Nullable()
    java.lang.String issueType, @org.jetbrains.annotations.NotNull()
    com.lasteyestudios.fyp.data.models.ipodetailsmodel.Listing listing, @org.jetbrains.annotations.Nullable()
    java.lang.String listingDate, @org.jetbrains.annotations.Nullable()
    java.lang.String logoUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String lotSize, @org.jetbrains.annotations.Nullable()
    java.lang.String maxPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String minBidQty, @org.jetbrains.annotations.Nullable()
    java.lang.String minBidQuantity, @org.jetbrains.annotations.Nullable()
    java.lang.String minPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String startDate, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.util.List<com.lasteyestudios.fyp.data.models.ipodetailsmodel.SubscriptionRate> subscriptionRates, @org.jetbrains.annotations.Nullable()
    java.lang.String subscriptionUpdatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String symbol, @org.jetbrains.annotations.Nullable()
    java.lang.String faceValue) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public IPODetailsModel(@org.jetbrains.annotations.Nullable()
    com.lasteyestudios.fyp.data.models.ipodetailsmodel.AboutCompany aboutCompany, @org.jetbrains.annotations.Nullable()
    java.lang.String applicationDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String bannerText, @org.jetbrains.annotations.Nullable()
    java.lang.String companyName, @org.jetbrains.annotations.Nullable()
    java.lang.String companyShortName, @org.jetbrains.annotations.Nullable()
    java.lang.String documentUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String endDate, @org.jetbrains.annotations.Nullable()
    java.util.List<com.lasteyestudios.fyp.data.models.ipodetailsmodel.Financial> financials, @org.jetbrains.annotations.Nullable()
    java.lang.String growwShortName, @org.jetbrains.annotations.Nullable()
    java.lang.String issuePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String issueSize, @org.jetbrains.annotations.Nullable()
    java.lang.String issueType, @org.jetbrains.annotations.NotNull()
    com.lasteyestudios.fyp.data.models.ipodetailsmodel.Listing listing, @org.jetbrains.annotations.Nullable()
    java.lang.String listingDate, @org.jetbrains.annotations.Nullable()
    java.lang.String logoUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String lotSize, @org.jetbrains.annotations.Nullable()
    java.lang.String maxPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String minBidQty, @org.jetbrains.annotations.Nullable()
    java.lang.String minBidQuantity, @org.jetbrains.annotations.Nullable()
    java.lang.String minPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String startDate, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.util.List<com.lasteyestudios.fyp.data.models.ipodetailsmodel.SubscriptionRate> subscriptionRates, @org.jetbrains.annotations.Nullable()
    java.lang.String subscriptionUpdatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String symbol, @org.jetbrains.annotations.Nullable()
    java.lang.String faceValue) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.lasteyestudios.fyp.data.models.ipodetailsmodel.AboutCompany component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.lasteyestudios.fyp.data.models.ipodetailsmodel.AboutCompany getAboutCompany() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApplicationDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBannerText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompanyName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompanyShortName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDocumentUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEndDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.lasteyestudios.fyp.data.models.ipodetailsmodel.Financial> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.lasteyestudios.fyp.data.models.ipodetailsmodel.Financial> getFinancials() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGrowwShortName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIssuePrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIssueSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIssueType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lasteyestudios.fyp.data.models.ipodetailsmodel.Listing component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lasteyestudios.fyp.data.models.ipodetailsmodel.Listing getListing() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getListingDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLogoUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLotSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMaxPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMinBidQty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMinBidQuantity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMinPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStartDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.lasteyestudios.fyp.data.models.ipodetailsmodel.SubscriptionRate> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.lasteyestudios.fyp.data.models.ipodetailsmodel.SubscriptionRate> getSubscriptionRates() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubscriptionUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSymbol() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFaceValue() {
        return null;
    }
}