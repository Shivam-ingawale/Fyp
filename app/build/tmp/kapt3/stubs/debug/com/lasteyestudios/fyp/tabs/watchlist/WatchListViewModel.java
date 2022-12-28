package com.lasteyestudios.fyp.tabs.watchlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bJ!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0000\u00a2\u0006\u0002\b\u001fJ\u0006\u0010 \u001a\u00020\u0016J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000eJ\u0006\u0010#\u001a\u00020\u001aR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/watchlist/WatchListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_currentIPOs", "Landroidx/lifecycle/MutableLiveData;", "", "", "currentIPOs", "Landroidx/lifecycle/LiveData;", "getCurrentIPOs", "()Landroidx/lifecycle/LiveData;", "getAllCompanyWishlist", "Lcom/lasteyestudios/fyp/data/local/model/CompanyLocalModel;", "getGetAllCompanyWishlist", "getAllSymbolCompanyWishlist", "getGetAllSymbolCompanyWishlist", "()Ljava/util/List;", "setGetAllSymbolCompanyWishlist", "(Ljava/util/List;)V", "localDbRepository", "Lcom/lasteyestudios/fyp/repository/LocalDbRepository;", "mDownloadsList", "", "deleteCompanyWishlistBySymbol", "", "Symbol", "getListCompanyFromCompanyLocal", "Lcom/lasteyestudios/fyp/data/models/ipolistingmodel/Company;", "it", "getListCompanyFromCompanyLocal$app_debug", "getLocalDbRepository", "insertWatchlistCompanyLocal", "company", "loadData", "app_debug"})
public final class WatchListViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _currentIPOs = null;
    private final com.lasteyestudios.fyp.repository.LocalDbRepository localDbRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.lasteyestudios.fyp.data.local.model.CompanyLocalModel>> getAllCompanyWishlist = null;
    private java.util.List<com.lasteyestudios.fyp.data.local.model.CompanyLocalModel> mDownloadsList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> getAllSymbolCompanyWishlist;
    
    public WatchListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getCurrentIPOs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.lasteyestudios.fyp.data.local.model.CompanyLocalModel>> getGetAllCompanyWishlist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGetAllSymbolCompanyWishlist() {
        return null;
    }
    
    public final void setGetAllSymbolCompanyWishlist(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lasteyestudios.fyp.repository.LocalDbRepository getLocalDbRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.lasteyestudios.fyp.data.models.ipolistingmodel.Company> getListCompanyFromCompanyLocal$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.lasteyestudios.fyp.data.local.model.CompanyLocalModel> it) {
        return null;
    }
    
    public final void insertWatchlistCompanyLocal(@org.jetbrains.annotations.NotNull()
    com.lasteyestudios.fyp.data.local.model.CompanyLocalModel company) {
    }
    
    public final void deleteCompanyWishlistBySymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String Symbol) {
    }
    
    public final void loadData() {
    }
}