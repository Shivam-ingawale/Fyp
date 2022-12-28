package com.lasteyestudios.fyp.tabs.allotment.searchallotment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u001a\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u0019H\u0016J\u001a\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010+\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006,"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/allotment/searchallotment/SearchAllotmentFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/lasteyestudios/fyp/databinding/FragmentSearchAllotmentBinding;", "args", "Lcom/lasteyestudios/fyp/tabs/allotment/searchallotment/SearchAllotmentFragmentArgs;", "getArgs", "()Lcom/lasteyestudios/fyp/tabs/allotment/searchallotment/SearchAllotmentFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/lasteyestudios/fyp/databinding/FragmentSearchAllotmentBinding;", "companyId", "", "companyName", "keyWord", "searchAllotmentViewModel", "Lcom/lasteyestudios/fyp/tabs/allotment/searchallotment/SearchAllotmentViewModel;", "getSearchAllotmentViewModel", "()Lcom/lasteyestudios/fyp/tabs/allotment/searchallotment/SearchAllotmentViewModel;", "searchAllotmentViewModel$delegate", "Lkotlin/Lazy;", "googleReview", "", "hideKeyboard", "letsGo", "text", "input", "Lcom/google/android/material/textfield/TextInputLayout;", "noRecordsFound", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "retryLogic", "app_debug"})
public final class SearchAllotmentFragment extends androidx.fragment.app.Fragment {
    private com.lasteyestudios.fyp.databinding.FragmentSearchAllotmentBinding _binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private java.lang.String companyName;
    private java.lang.String keyWord;
    private java.lang.String companyId;
    private final kotlin.Lazy searchAllotmentViewModel$delegate = null;
    
    public SearchAllotmentFragment() {
        super();
    }
    
    private final com.lasteyestudios.fyp.databinding.FragmentSearchAllotmentBinding getBinding() {
        return null;
    }
    
    private final com.lasteyestudios.fyp.tabs.allotment.searchallotment.SearchAllotmentFragmentArgs getArgs() {
        return null;
    }
    
    private final com.lasteyestudios.fyp.tabs.allotment.searchallotment.SearchAllotmentViewModel getSearchAllotmentViewModel() {
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
    
    private final void hideKeyboard() {
    }
    
    private final void letsGo(java.lang.String text, com.google.android.material.textfield.TextInputLayout input) {
    }
    
    private final void retryLogic() {
    }
    
    private final void noRecordsFound() {
    }
    
    private final void googleReview() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}