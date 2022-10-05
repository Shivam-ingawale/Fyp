package com.lasteyestudios.ipoalerts.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CompanyWishlistDatabase_Impl extends CompanyWishlistDatabase {
  private volatile CompanyWishlistDao _companyWishlistDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `company_wishlist_table` (`ID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timeStamp` INTEGER, `ShortName` TEXT NOT NULL, `SYMBOLS` TEXT NOT NULL, `biddingStartDate` TEXT, `growwShortName` TEXT, `issueSize` TEXT, `listingDate` TEXT, `logoUrl` TEXT, `maxPrice` TEXT, `minBidQuantity` TEXT, `minPrice` TEXT, `searchId` TEXT, `status` TEXT, `liked` INTEGER NOT NULL, `additionalTxt` TEXT, `retailSubscriptionRate` TEXT, `issuePrice` TEXT, `listingGains` TEXT, `listingPrice` TEXT, `symbol` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0fcc6710abe9b850604af725839b5035')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `company_wishlist_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCompanyWishlistTable = new HashMap<String, TableInfo.Column>(21);
        _columnsCompanyWishlistTable.put("ID", new TableInfo.Column("ID", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("timeStamp", new TableInfo.Column("timeStamp", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("ShortName", new TableInfo.Column("ShortName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("SYMBOLS", new TableInfo.Column("SYMBOLS", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("biddingStartDate", new TableInfo.Column("biddingStartDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("growwShortName", new TableInfo.Column("growwShortName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("issueSize", new TableInfo.Column("issueSize", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("listingDate", new TableInfo.Column("listingDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("logoUrl", new TableInfo.Column("logoUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("maxPrice", new TableInfo.Column("maxPrice", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("minBidQuantity", new TableInfo.Column("minBidQuantity", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("minPrice", new TableInfo.Column("minPrice", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("searchId", new TableInfo.Column("searchId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("liked", new TableInfo.Column("liked", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("additionalTxt", new TableInfo.Column("additionalTxt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("retailSubscriptionRate", new TableInfo.Column("retailSubscriptionRate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("issuePrice", new TableInfo.Column("issuePrice", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("listingGains", new TableInfo.Column("listingGains", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("listingPrice", new TableInfo.Column("listingPrice", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyWishlistTable.put("symbol", new TableInfo.Column("symbol", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCompanyWishlistTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCompanyWishlistTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCompanyWishlistTable = new TableInfo("company_wishlist_table", _columnsCompanyWishlistTable, _foreignKeysCompanyWishlistTable, _indicesCompanyWishlistTable);
        final TableInfo _existingCompanyWishlistTable = TableInfo.read(_db, "company_wishlist_table");
        if (! _infoCompanyWishlistTable.equals(_existingCompanyWishlistTable)) {
          return new RoomOpenHelper.ValidationResult(false, "company_wishlist_table(com.lasteyestudios.ipoalerts.data.local.model.CompanyLocalModel).\n"
                  + " Expected:\n" + _infoCompanyWishlistTable + "\n"
                  + " Found:\n" + _existingCompanyWishlistTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "0fcc6710abe9b850604af725839b5035", "01d75366cd1aa3188ec057f6c242309a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "company_wishlist_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `company_wishlist_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CompanyWishlistDao.class, CompanyWishlistDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public CompanyWishlistDao companyWishlistDao() {
    if (_companyWishlistDao != null) {
      return _companyWishlistDao;
    } else {
      synchronized(this) {
        if(_companyWishlistDao == null) {
          _companyWishlistDao = new CompanyWishlistDao_Impl(this);
        }
        return _companyWishlistDao;
      }
    }
  }
}
