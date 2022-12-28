package com.lasteyestudios.fyp.data.ipo.SearchIPOAllotments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/lasteyestudios/fyp/data/ipo/SearchIPOAllotments/SearchAllotments;", "", "getSearchAllotmentsResults", "Lcom/google/gson/JsonObject;", "message", "Lcom/lasteyestudios/fyp/data/ipo/SearchIPOAllotments/APIMessageSearchAllotments;", "(Lcom/lasteyestudios/fyp/data/ipo/SearchIPOAllotments/APIMessageSearchAllotments;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SearchAllotments {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "SearchOnPan")
    @retrofit2.http.Headers(value = {"content-type: application/json", "charset: UTF-8"})
    public abstract java.lang.Object getSearchAllotmentsResults(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.lasteyestudios.fyp.data.ipo.SearchIPOAllotments.APIMessageSearchAllotments message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> continuation);
}