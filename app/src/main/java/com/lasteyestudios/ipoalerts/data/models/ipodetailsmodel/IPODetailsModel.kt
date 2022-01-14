package com.lasteyestudios.ipoalerts.data.models.ipodetailsmodel

data class IPODetailsModel(
    val aboutCompany: AboutCompany?,
    val applicationDetails: String?,
    val bannerText: String?,
    val companyName: String?,
    val companyShortName: String?,
    val documentUrl: String?,
    val endDate: String?,
    val financials: List<Financial?>?,
    val growwShortName: String?,
    val issuePrice: String?,
    val issueSize: String?,
    val issueType: String?,
    val listing: Listing,
    val listingDate: String?,
    val logoUrl: String?,
    val lotSize: String?,
    val maxPrice: String?,
    val minBidQty: String?,
    val minBidQuantity: String?,
    val minPrice: String?,
    val startDate: String?,
    val status: String?,
    val subscriptionRates: List<SubscriptionRate?>?,
    val subscriptionUpdatedAt: String?,
    val symbol: String?
)