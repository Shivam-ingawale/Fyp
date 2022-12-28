package com.lasteyestudios.fyp.data.ipo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ+\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/lasteyestudios/fyp/data/ipo/IPOClient;", "", "()V", "transformer", "Lcom/lasteyestudios/fyp/data/ipo/common/Transformer;", "urlEndPointAllotments", "", "urlEndPointIPOCompanyDetails", "urlEndPointIPOCompanyListings", "getAvailableIPOAllotmentsData", "", "Lcom/lasteyestudios/fyp/data/models/availableallotmentmodel/AvailableAllotmentModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIPOCompanyDetails", "Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/IPODetailsModel;", "searchId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIPOCompanyListings", "Lcom/lasteyestudios/fyp/data/models/ipolistingmodel/IPOListingModel;", "getSearchAllotmentsResults", "Lcom/lasteyestudios/fyp/data/models/searchallotmentresultmodel/SearchAllotmentResultModel;", "companyId", "keyWord", "userDoc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class IPOClient {
    private final java.lang.String urlEndPointAllotments = "https://www.1mg.com/pwa-api/api/v4/diseases/";
    private final java.lang.String urlEndPointIPOCompanyListings = "https://www.1mg.com/pwa-api/api/v4/diseases/";
    private final java.lang.String urlEndPointIPOCompanyDetails = "https://groww.in/v1/api/stocks_primary_market_data/v1/ipo/";
    private final com.lasteyestudios.fyp.data.ipo.common.Transformer transformer = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lasteyestudios.fyp.data.ipo.IPOClient.Companion Companion = null;
    private static com.lasteyestudios.fyp.data.ipo.IPOClient INSTANCE;
    
    public IPOClient() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAvailableIPOAllotmentsData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSearchAllotmentsResults(@org.jetbrains.annotations.NotNull()
    java.lang.String companyId, @org.jetbrains.annotations.NotNull()
    java.lang.String keyWord, @org.jetbrains.annotations.NotNull()
    java.lang.String userDoc, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lasteyestudios.fyp.data.models.searchallotmentresultmodel.SearchAllotmentResultModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getIPOCompanyListings(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lasteyestudios.fyp.data.models.ipolistingmodel.IPOListingModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getIPOCompanyDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String searchId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.lasteyestudios.fyp.data.models.ipodetailsmodel.IPODetailsModel> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/lasteyestudios/fyp/data/ipo/IPOClient$Companion;", "", "()V", "INSTANCE", "Lcom/lasteyestudios/fyp/data/ipo/IPOClient;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lasteyestudios.fyp.data.ipo.IPOClient getInstance() {
            return null;
        }
    }
}