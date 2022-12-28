package com.lasteyestudios.fyp.data.ipo.ipoCompanyListing

import com.google.gson.JsonObject
import retrofit2.http.GET
import retrofit2.http.Query

interface IPOCompanyListings {
    @GET("by_prefix")
    suspend fun getIPOCompanyListings(@Query(value = "prefix_term") prefixTerm : String,
                                     @Query(value = "page") page : Int) : JsonObject
}
//?prefix_term={prefix_term}&page={page}&is_new_view=true
//curl 'https://www.1mg.com/pwa-api/api/v4/diseases/by_prefix?prefix_term=a&page=1&is_new_view=true' \