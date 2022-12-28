package com.lasteyestudios.fyp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0011\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R&\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\u00050\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/lasteyestudios/fyp/repository/NotificationRepo;", "", "()V", "_notifications", "Landroidx/lifecycle/MutableLiveData;", "", "", "localDbRepository", "Lcom/lasteyestudios/fyp/repository/LocalDbRepository;", "networkRepository", "Lcom/lasteyestudios/fyp/repository/NetworkRepository;", "notifications", "Landroidx/lifecycle/LiveData;", "getNotifications", "()Landroidx/lifecycle/LiveData;", "watchListViewModel", "Lcom/lasteyestudios/fyp/tabs/watchlist/WatchListViewModel;", "getCompanyLocalFromGrowwShortName", "Lcom/lasteyestudios/fyp/data/local/model/CompanyLocalModel;", "growwShortName", "getIPOCompanyListingsForNotifications", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class NotificationRepo {
    private final com.lasteyestudios.fyp.repository.NetworkRepository networkRepository = null;
    private final com.lasteyestudios.fyp.repository.LocalDbRepository localDbRepository = null;
    private final com.lasteyestudios.fyp.tabs.watchlist.WatchListViewModel watchListViewModel = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.util.List<java.lang.String>>> _notifications = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lasteyestudios.fyp.repository.NotificationRepo.Companion Companion = null;
    private static com.lasteyestudios.fyp.repository.NotificationRepo INSTANCE;
    
    public NotificationRepo() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.util.List<java.lang.String>>> getNotifications() {
        return null;
    }
    
    private final com.lasteyestudios.fyp.data.local.model.CompanyLocalModel getCompanyLocalFromGrowwShortName(java.lang.String growwShortName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getIPOCompanyListingsForNotifications(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/lasteyestudios/fyp/repository/NotificationRepo$Companion;", "", "()V", "INSTANCE", "Lcom/lasteyestudios/fyp/repository/NotificationRepo;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lasteyestudios.fyp.repository.NotificationRepo getInstance() {
            return null;
        }
    }
}