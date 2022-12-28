package com.lasteyestudios.fyp.tabs.allotment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0017\u0018B=\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u000f\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0016R>\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/allotment/AllotmentAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/lasteyestudios/fyp/data/models/availableallotmentmodel/AvailableAllotmentModel;", "Lcom/lasteyestudios/fyp/tabs/allotment/AllotmentAdapter$ItemAdapterViewHolder;", "onAllotmentItemClicked", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "companyId", "companyName", "", "(Lkotlin/jvm/functions/Function2;)V", "closingDate", "s", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "HomeAdapterDiffCallback", "ItemAdapterViewHolder", "app_debug"})
public final class AllotmentAdapter extends androidx.recyclerview.widget.ListAdapter<com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel, com.lasteyestudios.fyp.tabs.allotment.AllotmentAdapter.ItemAdapterViewHolder> {
    private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> onAllotmentItemClicked = null;
    
    public AllotmentAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onAllotmentItemClicked) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String closingDate(@org.jetbrains.annotations.Nullable()
    java.lang.String s) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lasteyestudios.fyp.tabs.allotment.AllotmentAdapter.ItemAdapterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lasteyestudios.fyp.tabs.allotment.AllotmentAdapter.ItemAdapterViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/allotment/AllotmentAdapter$HomeAdapterDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/lasteyestudios/fyp/data/models/availableallotmentmodel/AvailableAllotmentModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class HomeAdapterDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel> {
        @org.jetbrains.annotations.NotNull()
        public static final com.lasteyestudios.fyp.tabs.allotment.AllotmentAdapter.HomeAdapterDiffCallback INSTANCE = null;
        
        private HomeAdapterDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel oldItem, @org.jetbrains.annotations.NotNull()
        com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel oldItem, @org.jetbrains.annotations.NotNull()
        com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/allotment/AllotmentAdapter$ItemAdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/lasteyestudios/fyp/databinding/AllotmentItemBinding;", "(Lcom/lasteyestudios/fyp/tabs/allotment/AllotmentAdapter;Lcom/lasteyestudios/fyp/databinding/AllotmentItemBinding;)V", "bind", "", "item", "Lcom/lasteyestudios/fyp/data/models/availableallotmentmodel/AvailableAllotmentModel;", "app_debug"})
    public final class ItemAdapterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.lasteyestudios.fyp.databinding.AllotmentItemBinding binding = null;
        
        public ItemAdapterViewHolder(@org.jetbrains.annotations.NotNull()
        com.lasteyestudios.fyp.databinding.AllotmentItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.lasteyestudios.fyp.data.models.availableallotmentmodel.AvailableAllotmentModel item) {
        }
    }
}