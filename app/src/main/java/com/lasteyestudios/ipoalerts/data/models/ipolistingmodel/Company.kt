package com.lasteyestudios.ipoalerts.data.models.ipolistingmodel

data class Company(
    val biddingStartDate: String?,
    val growwShortName: String?,
    val issueSize: String?,
    val listingDate: String?,
    val logoUrl: String?,
    val maxPrice: String?,
    val minBidQuantity: String?,
    val minPrice: String?,
    val searchId: String?,
    val status: String?,
    var liked: Boolean,
    val additionalTxt: String?,
    val retailSubscriptionRate: String?,
    val issuePrice: String?,
    val listingGains: String?,
    val listingPrice: String?,
)

//    val biddingEndDate: String?,
//    val documentUrl: String?,
//    val lotSize: String?,
//    val name: String?,
//    val symbol: String?,
//    val canApply: Boolean,
//    val statusEnable: Boolean


//{
//    "canApply": false,
//    "statusEnable": false,
//    "symbol": "TARSONS",
//    "name": "Tarsons Products Ltd.",
//    "lotSize": 22,
//    "minPrice": 635,
//    "maxPrice": 662,
//    "biddingStartDate": "2021-11-15",
//    "biddingEndDate": "2021-11-17",
//    "issueSize": 10234700000,
//    "growwShortName": "Tarsons Products",
//    "status": "ACTIVE",
//    "logoUrl": "https://assets-netstorage.groww.in/stocks-ipo/logos/logos-96.png",
//    "documentUrl": "https://www.sebi.gov.in/filings/public-issues/nov-2021/tarsons-products-limited_53811.html",
//    "retailSubscriptionRate": 5.9,
//    "additionalTxt": "IPO closes today!",
//    "searchId": "tarsons-products-ipo",
//    "minBidQuantity": 51,
//    "listingDate": "2021-06-24",
//    "listingGains": 3.436426116838488,
//    "additionalTxt": "Listed at 301.0 for 3.44% gains",
//    "listingPrice": 301,
//    "issuePrice": 291
//}