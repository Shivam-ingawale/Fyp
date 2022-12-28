package com.lasteyestudios.fyp.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/lasteyestudios/fyp/data/local/CompanyWishlistDao;", "", "deleteCompanyWishlistBySymbol", "", "Symbol", "", "getAllCompanyWishlist", "Landroidx/lifecycle/LiveData;", "", "Lcom/lasteyestudios/fyp/data/local/model/CompanyLocalModel;", "getAllSymbolCompanyWishlist", "getCompanyLocalFromGrowwShortName", "growwShortName", "insertCompanyWishlist", "companyLocalModel", "app_debug"})
public abstract interface CompanyWishlistDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM company_wishlist_table ORDER BY timeStamp DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.lasteyestudios.fyp.data.local.model.CompanyLocalModel>> getAllCompanyWishlist();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT Symbol FROM company_wishlist_table ORDER BY timeStamp DESC")
    public abstract java.util.List<java.lang.String> getAllSymbolCompanyWishlist();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertCompanyWishlist(@org.jetbrains.annotations.NotNull()
    com.lasteyestudios.fyp.data.local.model.CompanyLocalModel companyLocalModel);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM company_wishlist_table WHERE growwShortName = :growwShortName")
    public abstract com.lasteyestudios.fyp.data.local.model.CompanyLocalModel getCompanyLocalFromGrowwShortName(@org.jetbrains.annotations.NotNull()
    java.lang.String growwShortName);
    
    @androidx.room.Query(value = "DELETE FROM company_wishlist_table WHERE symbol = :Symbol")
    public abstract void deleteCompanyWishlistBySymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String Symbol);
}