package com.lasteyestudios.fyp.tabs.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R\u001e\u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_detailsIPOs", "Landroidx/lifecycle/MutableLiveData;", "Lcom/lasteyestudios/fyp/data/models/Response;", "Lcom/lasteyestudios/fyp/data/models/ipodetailsmodel/IPODetailsModel;", "detailsIPOs", "Landroidx/lifecycle/LiveData;", "getDetailsIPOs", "()Landroidx/lifecycle/LiveData;", "networkRepository", "Lcom/lasteyestudios/fyp/repository/NetworkRepository;", "clearData", "", "loadData", "searchId", "", "growwShortName", "app_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.lasteyestudios.fyp.repository.NetworkRepository networkRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.lasteyestudios.fyp.data.models.Response<com.lasteyestudios.fyp.data.models.ipodetailsmodel.IPODetailsModel>> _detailsIPOs = null;
    
    public DetailsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.lasteyestudios.fyp.data.models.Response<com.lasteyestudios.fyp.data.models.ipodetailsmodel.IPODetailsModel>> getDetailsIPOs() {
        return null;
    }
    
    public final void loadData(@org.jetbrains.annotations.NotNull()
    java.lang.String searchId, @org.jetbrains.annotations.NotNull()
    java.lang.String growwShortName) {
    }
    
    public final void clearData() {
    }
}