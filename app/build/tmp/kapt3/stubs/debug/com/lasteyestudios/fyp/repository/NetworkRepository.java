package com.lasteyestudios.fyp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u00130\u0012J$\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\"\u0010\u0018\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00040\u00040\u00130\u0012J,\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00130\u00122\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016R\u0018\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/lasteyestudios/fyp/repository/NetworkRepository;", "", "()V", "availableAllotments", "", "Lcom/lasteyestudios/fyp/data/models/availableallotmentmodel/AvailableAllotmentModel;", "currentlyGettingAvailableAllotments", "", "currentlyGettingExploreResponse", "currentlyGettingIPOCompanyDetails", "currentlyGettingSearchAllotmentsResults", "iPOCompanyDetails", "Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/IPODetailsModel;", "ipoClient", "Lcom/lasteyestudios/fyp/data/ipo/IPOClient;", "myIpoListing", "Lcom/lasteyestudios/fyp/data/models/ipolistingmodel/IPOListingModel;", "getAvailableIPOAllotmentsData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/lasteyestudios/fyp/data/models/Response;", "getIPOCompanyDetails", "searchId", "", "growwShortName", "getIPOCompanyListings", "Lcom/lasteyestudios/fyp/data/models/ipolistingmodel/Company;", "getSearchAllotmentsResults", "Lcom/lasteyestudios/fyp/data/models/searchallotmentresultmodel/SearchAllotmentResultModel;", "companyId", "userDoc", "keyWord", "Companion", "app_debug"})
public final class NetworkRepository {
    private com.lasteyestudios.fyp.data.ipo.IPOClient ipoClient;
    private com.lasteyestudios.fyp.data.models.ipolistingmodel.IPOListingModel myIpoListing;
    private boolean currentlyGettingExploreResponse = false;
    private java.util.List<com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel> availableAllotments;
    private boolean currentlyGettingAvailableAllotments = false;
    private com.lasteyestudios.fyp.data.models.ipodetailsmodel.IPODetailsModel iPOCompanyDetails;
    private boolean currentlyGettingIPOCompanyDetails = false;
    private boolean currentlyGettingSearchAllotmentsResults = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.lasteyestudios.fyp.repository.NetworkRepository.Companion Companion = null;
    private static com.lasteyestudios.fyp.repository.NetworkRepository INSTANCE;
    
    public NetworkRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.lasteyestudios.fyp.data.models.Response<java.util.List<java.util.List<com.lasteyestudios.fyp.data.models.ipolistingmodel.Company>>>> getIPOCompanyListings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.lasteyestudios.fyp.data.models.Response<com.lasteyestudios.fyp.data.models.ipodetailsmodel.IPODetailsModel>> getIPOCompanyDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String searchId, @org.jetbrains.annotations.NotNull()
    java.lang.String growwShortName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.lasteyestudios.fyp.data.models.Response<java.util.List<com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel>>> getAvailableIPOAllotmentsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.lasteyestudios.fyp.data.models.Response<com.lasteyestudios.fyp.data.models.searchallotmentresultmodel.SearchAllotmentResultModel>> getSearchAllotmentsResults(@org.jetbrains.annotations.NotNull()
    java.lang.String companyId, @org.jetbrains.annotations.NotNull()
    java.lang.String userDoc, @org.jetbrains.annotations.NotNull()
    java.lang.String keyWord) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/lasteyestudios/fyp/repository/NetworkRepository$Companion;", "", "()V", "INSTANCE", "Lcom/lasteyestudios/fyp/repository/NetworkRepository;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lasteyestudios.fyp.repository.NetworkRepository getInstance() {
            return null;
        }
    }
}