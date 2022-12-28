package com.lasteyestudios.fyp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/lasteyestudios/fyp/repository/LocalDbRepository;", "", "companyWishlistDao", "Lcom/lasteyestudios/fyp/data/local/CompanyWishlistDao;", "(Lcom/lasteyestudios/fyp/data/local/CompanyWishlistDao;)V", "deleteCompanyWishlistBySymbol", "", "symbol", "", "getAllCompanyWishlist", "Landroidx/lifecycle/LiveData;", "", "Lcom/lasteyestudios/fyp/data/local/model/CompanyLocalModel;", "getAllSymbolCompanyWishlist", "getCompanyLocalFromGrowwShortName", "growwShortName", "insertCompanyWishlist", "companyLocalModel", "app_debug"})
public final class LocalDbRepository {
    private final com.lasteyestudios.fyp.data.local.CompanyWishlistDao companyWishlistDao = null;
    
    public LocalDbRepository(@org.jetbrains.annotations.NotNull()
    com.lasteyestudios.fyp.data.local.CompanyWishlistDao companyWishlistDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.lasteyestudios.fyp.data.local.model.CompanyLocalModel>> getAllCompanyWishlist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAllSymbolCompanyWishlist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lasteyestudios.fyp.data.local.model.CompanyLocalModel getCompanyLocalFromGrowwShortName(@org.jetbrains.annotations.NotNull()
    java.lang.String growwShortName) {
        return null;
    }
    
    public final void insertCompanyWishlist(@org.jetbrains.annotations.NotNull()
    com.lasteyestudios.fyp.data.local.model.CompanyLocalModel companyLocalModel) {
    }
    
    public final void deleteCompanyWishlistBySymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
    }
}