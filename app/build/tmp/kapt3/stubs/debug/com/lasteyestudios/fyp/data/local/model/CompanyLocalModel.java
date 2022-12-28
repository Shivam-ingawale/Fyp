package com.lasteyestudios.fyp.data.local.model;

import java.lang.System;

@androidx.room.Entity(tableName = "company_wishlist_table")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00c6\u0003JB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006("}, d2 = {"Lcom/lasteyestudios/fyp/data/local/model/CompanyLocalModel;", "Lcom/lasteyestudios/fyp/data/local/model/RecyclerItem;", "ID", "", "timeStamp", "", "growwShortName", "", "SYMBOL", "company", "Lcom/lasteyestudios/fyp/data/models/ipolistingmodel/Company;", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/lasteyestudios/fyp/data/models/ipolistingmodel/Company;)V", "getID", "()I", "getSYMBOL", "()Ljava/lang/String;", "setSYMBOL", "(Ljava/lang/String;)V", "getCompany", "()Lcom/lasteyestudios/fyp/data/models/ipolistingmodel/Company;", "getGrowwShortName", "setGrowwShortName", "getTimeStamp", "()Ljava/lang/Long;", "setTimeStamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/lasteyestudios/fyp/data/models/ipolistingmodel/Company;)Lcom/lasteyestudios/fyp/data/local/model/CompanyLocalModel;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class CompanyLocalModel implements com.lasteyestudios.fyp.data.local.model.RecyclerItem {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int ID = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long timeStamp;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ShortName")
    private java.lang.String growwShortName;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "SYMBOLS")
    private java.lang.String SYMBOL;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.lasteyestudios.fyp.data.models.ipolistingmodel.Company company = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.lasteyestudios.fyp.data.local.model.CompanyLocalModel copy(int ID, @org.jetbrains.annotations.Nullable()
    java.lang.Long timeStamp, @org.jetbrains.annotations.NotNull()
    java.lang.String growwShortName, @org.jetbrains.annotations.NotNull()
    java.lang.String SYMBOL, @org.jetbrains.annotations.NotNull()
    com.lasteyestudios.fyp.data.models.ipolistingmodel.Company company) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CompanyLocalModel(int ID, @org.jetbrains.annotations.Nullable()
    java.lang.Long timeStamp, @org.jetbrains.annotations.NotNull()
    java.lang.String growwShortName, @org.jetbrains.annotations.NotNull()
    java.lang.String SYMBOL, @org.jetbrains.annotations.NotNull()
    com.lasteyestudios.fyp.data.models.ipolistingmodel.Company company) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getID() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTimeStamp() {
        return null;
    }
    
    public final void setTimeStamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGrowwShortName() {
        return null;
    }
    
    public final void setGrowwShortName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSYMBOL() {
        return null;
    }
    
    public final void setSYMBOL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lasteyestudios.fyp.data.models.ipolistingmodel.Company component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lasteyestudios.fyp.data.models.ipolistingmodel.Company getCompany() {
        return null;
    }
}