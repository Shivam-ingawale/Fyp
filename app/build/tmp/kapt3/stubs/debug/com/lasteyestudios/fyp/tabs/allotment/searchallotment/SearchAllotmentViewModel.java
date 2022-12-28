package com.lasteyestudios.fyp.tabs.allotment.searchallotment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011R\u001e\u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/allotment/searchallotment/SearchAllotmentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_searchAllotmentIPOs", "Landroidx/lifecycle/MutableLiveData;", "Lcom/lasteyestudios/fyp/data/models/Response;", "Lcom/lasteyestudios/fyp/data/models/searchallotmentresultmodel/SearchAllotmentResultModel;", "networkRepository", "Lcom/lasteyestudios/fyp/repository/NetworkRepository;", "searchAllotmentIPOs", "Landroidx/lifecycle/LiveData;", "getSearchAllotmentIPOs", "()Landroidx/lifecycle/LiveData;", "clearData", "", "loadAllotmentIPOData", "companyId", "", "userDoc", "keyWord", "app_debug"})
public final class SearchAllotmentViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.lasteyestudios.fyp.data.models.Response<com.lasteyestudios.fyp.data.models.searchallotmentresultmodel.SearchAllotmentResultModel>> _searchAllotmentIPOs = null;
    private final com.lasteyestudios.fyp.repository.NetworkRepository networkRepository = null;
    
    public SearchAllotmentViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.lasteyestudios.fyp.data.models.Response<com.lasteyestudios.fyp.data.models.searchallotmentresultmodel.SearchAllotmentResultModel>> getSearchAllotmentIPOs() {
        return null;
    }
    
    public final void loadAllotmentIPOData(@org.jetbrains.annotations.NotNull()
    java.lang.String companyId, @org.jetbrains.annotations.NotNull()
    java.lang.String userDoc, @org.jetbrains.annotations.NotNull()
    java.lang.String keyWord) {
    }
    
    public final void clearData() {
    }
}