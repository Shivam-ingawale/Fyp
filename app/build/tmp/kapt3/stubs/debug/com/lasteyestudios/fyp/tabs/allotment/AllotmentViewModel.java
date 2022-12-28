package com.lasteyestudios.fyp.tabs.allotment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fR$\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00050\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/allotment/AllotmentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_allotmentIPOs", "Landroidx/lifecycle/MutableLiveData;", "Lcom/lasteyestudios/fyp/data/models/Response;", "", "Lcom/lasteyestudios/fyp/data/models/availableallotmentmodel/AvailableAllotmentModel;", "allotmentIPOs", "Landroidx/lifecycle/LiveData;", "getAllotmentIPOs", "()Landroidx/lifecycle/LiveData;", "networkRepository", "Lcom/lasteyestudios/fyp/repository/NetworkRepository;", "loadAllotmentIPOData", "", "app_debug"})
public final class AllotmentViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.lasteyestudios.fyp.data.models.Response<java.util.List<com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel>>> _allotmentIPOs = null;
    private final com.lasteyestudios.fyp.repository.NetworkRepository networkRepository = null;
    
    public AllotmentViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.lasteyestudios.fyp.data.models.Response<java.util.List<com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel>>> getAllotmentIPOs() {
        return null;
    }
    
    public final void loadAllotmentIPOData() {
    }
}