package com.lasteyestudios.fyp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/lasteyestudios/fyp/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/lasteyestudios/fyp/databinding/ActivityMainBinding;", "currentNavController", "Landroidx/navigation/NavController;", "networkStatus", "Lcom/lasteyestudios/fyp/utils/NetworkStatus;", "sharedViewModel", "Lcom/lasteyestudios/fyp/tabs/common/SharedViewModel;", "getSharedViewModel", "()Lcom/lasteyestudios/fyp/tabs/common/SharedViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "snackBar", "Lcom/google/android/material/snackbar/Snackbar;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.navigation.NavController currentNavController;
    private com.google.android.material.snackbar.Snackbar snackBar;
    private com.lasteyestudios.fyp.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy sharedViewModel$delegate = null;
    private com.lasteyestudios.fyp.utils.NetworkStatus networkStatus;
    
    public MainActivity() {
        super();
    }
    
    private final com.lasteyestudios.fyp.tabs.common.SharedViewModel getSharedViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}