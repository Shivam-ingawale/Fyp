package com.lasteyestudios.fyp.data.ipo.ipoCompanyListing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/lasteyestudios/fyp/data/ipo/ipoCompanyListing/IPOCompanyListings;", "", "getIPOCompanyListings", "Lcom/google/gson/JsonObject;", "prefixTerm", "", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface IPOCompanyListings {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "by_prefix")
    public abstract java.lang.Object getIPOCompanyListings(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "prefix_term")
    java.lang.String prefixTerm, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> continuation);
}