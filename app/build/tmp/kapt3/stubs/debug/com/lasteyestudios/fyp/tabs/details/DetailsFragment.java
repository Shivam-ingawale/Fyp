package com.lasteyestudios.fyp.tabs.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\u0014\u0010\"\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J\u001a\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000fH\u0002J\u0010\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00061"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/details/DetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/lasteyestudios/fyp/databinding/FragmentIpoDetailsBinding;", "binding", "getBinding", "()Lcom/lasteyestudios/fyp/databinding/FragmentIpoDetailsBinding;", "detailsViewModel", "Lcom/lasteyestudios/fyp/tabs/details/DetailsViewModel;", "getDetailsViewModel", "()Lcom/lasteyestudios/fyp/tabs/details/DetailsViewModel;", "detailsViewModel$delegate", "Lkotlin/Lazy;", "growwShortName", "", "liked", "", "searchId", "watchListViewModel", "Lcom/lasteyestudios/fyp/tabs/watchlist/WatchListViewModel;", "getWatchListViewModel", "()Lcom/lasteyestudios/fyp/tabs/watchlist/WatchListViewModel;", "watchListViewModel$delegate", "addWatchlistCompany", "", "add", "Lcom/lasteyestudios/fyp/data/models/ipolistingmodel/Company;", "deleteWatchlistCompany", "deleteSymbol", "formattedDescription", "temp", "", "handleRetry", "objToString", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "rupeeFormat", "value", "subscriptionHelper", "app_debug"})
public final class DetailsFragment extends androidx.fragment.app.Fragment {
    private com.lasteyestudios.fyp.databinding.FragmentIpoDetailsBinding _binding;
    private java.lang.String searchId;
    private boolean liked = false;
    private final kotlin.Lazy detailsViewModel$delegate = null;
    private final kotlin.Lazy watchListViewModel$delegate = null;
    private java.lang.String growwShortName;
    
    public DetailsFragment() {
        super();
    }
    
    private final com.lasteyestudios.fyp.databinding.FragmentIpoDetailsBinding getBinding() {
        return null;
    }
    
    private final com.lasteyestudios.fyp.tabs.details.DetailsViewModel getDetailsViewModel() {
        return null;
    }
    
    private final com.lasteyestudios.fyp.tabs.watchlist.WatchListViewModel getWatchListViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void deleteWatchlistCompany(java.lang.String deleteSymbol) {
    }
    
    private final void addWatchlistCompany(com.lasteyestudios.fyp.data.models.ipolistingmodel.Company add) {
    }
    
    private final java.lang.String subscriptionHelper(java.lang.String value) {
        return null;
    }
    
    private final java.lang.String rupeeFormat(java.lang.String value) {
        return null;
    }
    
    private final java.lang.String objToString(java.lang.Object temp) {
        return null;
    }
    
    private final java.lang.String formattedDescription(java.lang.Object temp) {
        return null;
    }
    
    private final void handleRetry() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}