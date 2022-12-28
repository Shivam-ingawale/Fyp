package com.lasteyestudios.fyp.tabs.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0016\u0017B:\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/current/ItemRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Lcom/lasteyestudios/fyp/tabs/current/ItemRecyclerAdapter$ItemAdapterViewHolder;", "context", "Landroid/content/Context;", "onItemClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "searchId", "", "from", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "HomeAdapterDiffCallback", "ItemAdapterViewHolder", "app_debug"})
public final class ItemRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<java.lang.String, com.lasteyestudios.fyp.tabs.current.ItemRecyclerAdapter.ItemAdapterViewHolder> {
    private final android.content.Context context = null;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onItemClicked = null;
    private final java.lang.String from = null;
    
    public ItemRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.Nullable()
    java.lang.String from) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lasteyestudios.fyp.tabs.current.ItemRecyclerAdapter.ItemAdapterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lasteyestudios.fyp.tabs.current.ItemRecyclerAdapter.ItemAdapterViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/current/ItemRecyclerAdapter$HomeAdapterDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class HomeAdapterDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<java.lang.String> {
        @org.jetbrains.annotations.NotNull()
        public static final com.lasteyestudios.fyp.tabs.current.ItemRecyclerAdapter.HomeAdapterDiffCallback INSTANCE = null;
        
        private HomeAdapterDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        java.lang.String oldItem, @org.jetbrains.annotations.NotNull()
        java.lang.String newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        java.lang.String oldItem, @org.jetbrains.annotations.NotNull()
        java.lang.String newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/current/ItemRecyclerAdapter$ItemAdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/lasteyestudios/fyp/databinding/MedicineListItemBinding;", "(Lcom/lasteyestudios/fyp/tabs/current/ItemRecyclerAdapter;Lcom/lasteyestudios/fyp/databinding/MedicineListItemBinding;)V", "bind", "", "item", "", "app_debug"})
    public final class ItemAdapterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.lasteyestudios.fyp.databinding.MedicineListItemBinding binding = null;
        
        public ItemAdapterViewHolder(@org.jetbrains.annotations.NotNull()
        com.lasteyestudios.fyp.databinding.MedicineListItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        java.lang.String item) {
        }
    }
}