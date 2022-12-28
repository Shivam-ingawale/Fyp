package com.lasteyestudios.fyp.data.ipo

import android.util.Log
import com.lasteyestudios.fyp.data.ipo.ipoCompanyListing.IPOCompanyListings
import com.lasteyestudios.fyp.data.ipo.ipoDetails.IPOCompanyDetails
import com.lasteyestudios.fyp.data.ipo.SearchIPOAllotments.APIMessageSearchAllotments
import com.lasteyestudios.fyp.data.ipo.SearchIPOAllotments.SearchAllotments
import com.lasteyestudios.fyp.data.ipo.common.RetrofitHelper
import com.lasteyestudios.fyp.data.ipo.common.Transformer
import com.lasteyestudios.fyp.data.ipo.ipoAllotments.IPOAllotments
import com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel
import com.lasteyestudios.fyp.data.models.ipodetailsmodel.IPODetailsModel
import com.lasteyestudios.fyp.data.models.ipolistingmodel.IPOListingModel
import com.lasteyestudios.fyp.data.models.searchallotmentresultmodel.SearchAllotmentResultModel
import com.lasteyestudios.fyp.utils.IPO_LOG_TAG


class IPOClient {

    private val urlEndPointAllotments: String = "https://www.1mg.com/pwa-api/api/v4/diseases/"
    private val urlEndPointIPOCompanyListings = "https://www.1mg.com/pwa-api/api/v4/diseases/"
    private val urlEndPointIPOCompanyDetails =
        "https://groww.in/v1/api/stocks_primary_market_data/v1/ipo/"

    private val transformer = Transformer()

    companion object {
        private var INSTANCE: IPOClient? = null
        fun getInstance(): IPOClient {
            if (INSTANCE == null) {
                INSTANCE = IPOClient()
            }
            return INSTANCE!!
        }
    }

    suspend fun getAvailableIPOAllotmentsData(): List<AvailableAllotmentModel>? {

        Log.d(IPO_LOG_TAG, "client -> start")

        val ipoAllotmentsApi = RetrofitHelper(urlEndPointAllotments).getInstance()
            .create(IPOAllotments::class.java)
        val res = ipoAllotmentsApi.getIPOAllotments()
        try {
            Log.d(IPO_LOG_TAG, "getIPOAllotments res -> ${res.toString()}")
            return transformer.getAvailableIPOAllotmentsData(res["d"].asString)
        } catch (e: Exception) {
            Log.d("TAG", "error while getIPOAllotments -> " + e.message)
        }
        return null

    }

//    suspend fun getExploreFeed(): com.lasteyestudios.fyp.data.models.MediaResponse? {
//
//        val exploreFeedAPI = RetrofitHelper(urlEndPointIPOCompanyListing).getInstance()
//            .create(ExploreFeedApi::class.java)
//        val lang = Lang("hindi")
//        val exploreFeedDataClass = APIExploreFeed(
//            message = lang,
//            userId = userId,
//            passCode = passCode,
//            client = "web"
//        )
//        val res = exploreFeedAPI.getMedia(exploreFeedDataClass)
//        try {
//            return transformer.genericFeedData(res["payload"].asJsonObject["d"] as JsonArray)
//        } catch (e: Exception) {
//            Log.d("tag", "error: $e")
//        }
//        return null
//    }

    suspend fun getSearchAllotmentsResults(
        companyId: String,
        keyWord: String,
        userDoc: String,
    ): SearchAllotmentResultModel? {
        val searchAllotments = RetrofitHelper(urlEndPointAllotments).getInstance()
            .create(SearchAllotments::class.java)
        val message = APIMessageSearchAllotments(
            clientid = companyId,
            key_word = keyWord,
            PAN = userDoc
        )
        val res = searchAllotments.getSearchAllotmentsResults(
            message = message
        )
        try {
            Log.d(IPO_LOG_TAG, "getSearchAllotmentsResults res -> ${res.toString()}")
            return transformer.searchAllotmentResults(res.toString())
        } catch (e: Exception) {
            Log.d("tag", "error: $e")
        }
        return null
    }

    suspend fun getIPOCompanyListings(): IPOListingModel? {
        val ipoCompanyListings =
            RetrofitHelper(urlEndPointIPOCompanyListings).getInstance()
                .create(IPOCompanyListings::class.java)

        val res = ipoCompanyListings.getIPOCompanyListings(prefixTerm="a", page = 1)
        try {
            Log.d(IPO_LOG_TAG, "getIPOCompanyListings: $res")
            return transformer.growIPOListingToData(res["data"].asJsonObject)
        } catch (e: Exception) {
            Log.d("tag", "error: $e")
        }
        return null
    }

    suspend fun getIPOCompanyDetails(searchId: String): IPODetailsModel? {
        val ipoCompanyListings =
            RetrofitHelper(urlEndPointIPOCompanyDetails).getInstance()
                .create(IPOCompanyDetails::class.java)

        val res = ipoCompanyListings.getIPOCompanyDetails(searchId = searchId)
        try {
            return transformer.growIPODetailsToDetails(res)
        } catch (e: Exception) {
            Log.d("tag", "error: $e")
        }
        return null
    }


}