package com.lasteyestudios.ipoalerts.data.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.lasteyestudios.ipoalerts.data.local.model.CompanyLocalModel;
import com.lasteyestudios.ipoalerts.data.models.ipolistingmodel.Company;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CompanyWishlistDao_Impl implements CompanyWishlistDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CompanyLocalModel> __insertionAdapterOfCompanyLocalModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCompanyWishlistBySymbol;

  public CompanyWishlistDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCompanyLocalModel = new EntityInsertionAdapter<CompanyLocalModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `company_wishlist_table` (`ID`,`timeStamp`,`ShortName`,`SYMBOLS`,`biddingStartDate`,`growwShortName`,`issueSize`,`listingDate`,`logoUrl`,`maxPrice`,`minBidQuantity`,`minPrice`,`searchId`,`status`,`liked`,`additionalTxt`,`retailSubscriptionRate`,`issuePrice`,`listingGains`,`listingPrice`,`symbol`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CompanyLocalModel value) {
        stmt.bindLong(1, value.getID());
        if (value.getTimeStamp() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTimeStamp());
        }
        if (value.getGrowwShortName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGrowwShortName());
        }
        if (value.getSYMBOL() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSYMBOL());
        }
        final Company _tmpCompany = value.getCompany();
        if(_tmpCompany != null) {
          if (_tmpCompany.getBiddingStartDate() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpCompany.getBiddingStartDate());
          }
          if (_tmpCompany.getGrowwShortName() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpCompany.getGrowwShortName());
          }
          if (_tmpCompany.getIssueSize() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpCompany.getIssueSize());
          }
          if (_tmpCompany.getListingDate() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpCompany.getListingDate());
          }
          if (_tmpCompany.getLogoUrl() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpCompany.getLogoUrl());
          }
          if (_tmpCompany.getMaxPrice() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindString(10, _tmpCompany.getMaxPrice());
          }
          if (_tmpCompany.getMinBidQuantity() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmpCompany.getMinBidQuantity());
          }
          if (_tmpCompany.getMinPrice() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindString(12, _tmpCompany.getMinPrice());
          }
          if (_tmpCompany.getSearchId() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpCompany.getSearchId());
          }
          if (_tmpCompany.getStatus() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindString(14, _tmpCompany.getStatus());
          }
          final int _tmp = _tmpCompany.getLiked() ? 1 : 0;
          stmt.bindLong(15, _tmp);
          if (_tmpCompany.getAdditionalTxt() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindString(16, _tmpCompany.getAdditionalTxt());
          }
          if (_tmpCompany.getRetailSubscriptionRate() == null) {
            stmt.bindNull(17);
          } else {
            stmt.bindString(17, _tmpCompany.getRetailSubscriptionRate());
          }
          if (_tmpCompany.getIssuePrice() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindString(18, _tmpCompany.getIssuePrice());
          }
          if (_tmpCompany.getListingGains() == null) {
            stmt.bindNull(19);
          } else {
            stmt.bindString(19, _tmpCompany.getListingGains());
          }
          if (_tmpCompany.getListingPrice() == null) {
            stmt.bindNull(20);
          } else {
            stmt.bindString(20, _tmpCompany.getListingPrice());
          }
          if (_tmpCompany.getSymbol() == null) {
            stmt.bindNull(21);
          } else {
            stmt.bindString(21, _tmpCompany.getSymbol());
          }
        } else {
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
          stmt.bindNull(20);
          stmt.bindNull(21);
        }
      }
    };
    this.__preparedStmtOfDeleteCompanyWishlistBySymbol = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM company_wishlist_table WHERE symbol = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertCompanyWishlist(final CompanyLocalModel companyLocalModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCompanyLocalModel.insert(companyLocalModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCompanyWishlistBySymbol(final String Symbol) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCompanyWishlistBySymbol.acquire();
    int _argIndex = 1;
    if (Symbol == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, Symbol);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteCompanyWishlistBySymbol.release(_stmt);
    }
  }

  @Override
  public LiveData<List<CompanyLocalModel>> getAllCompanyWishlist() {
    final String _sql = "SELECT * FROM company_wishlist_table ORDER BY timeStamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"company_wishlist_table"}, false, new Callable<List<CompanyLocalModel>>() {
      @Override
      public List<CompanyLocalModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfID = CursorUtil.getColumnIndexOrThrow(_cursor, "ID");
          final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
          final int _cursorIndexOfGrowwShortName = CursorUtil.getColumnIndexOrThrow(_cursor, "ShortName");
          final int _cursorIndexOfSYMBOL = CursorUtil.getColumnIndexOrThrow(_cursor, "SYMBOLS");
          final int _cursorIndexOfBiddingStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "biddingStartDate");
          final int _cursorIndexOfGrowwShortName_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "growwShortName");
          final int _cursorIndexOfIssueSize = CursorUtil.getColumnIndexOrThrow(_cursor, "issueSize");
          final int _cursorIndexOfListingDate = CursorUtil.getColumnIndexOrThrow(_cursor, "listingDate");
          final int _cursorIndexOfLogoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "logoUrl");
          final int _cursorIndexOfMaxPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "maxPrice");
          final int _cursorIndexOfMinBidQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "minBidQuantity");
          final int _cursorIndexOfMinPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "minPrice");
          final int _cursorIndexOfSearchId = CursorUtil.getColumnIndexOrThrow(_cursor, "searchId");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfLiked = CursorUtil.getColumnIndexOrThrow(_cursor, "liked");
          final int _cursorIndexOfAdditionalTxt = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalTxt");
          final int _cursorIndexOfRetailSubscriptionRate = CursorUtil.getColumnIndexOrThrow(_cursor, "retailSubscriptionRate");
          final int _cursorIndexOfIssuePrice = CursorUtil.getColumnIndexOrThrow(_cursor, "issuePrice");
          final int _cursorIndexOfListingGains = CursorUtil.getColumnIndexOrThrow(_cursor, "listingGains");
          final int _cursorIndexOfListingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "listingPrice");
          final int _cursorIndexOfSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "symbol");
          final List<CompanyLocalModel> _result = new ArrayList<CompanyLocalModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CompanyLocalModel _item;
            final int _tmpID;
            _tmpID = _cursor.getInt(_cursorIndexOfID);
            final Long _tmpTimeStamp;
            if (_cursor.isNull(_cursorIndexOfTimeStamp)) {
              _tmpTimeStamp = null;
            } else {
              _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
            }
            final String _tmpGrowwShortName;
            if (_cursor.isNull(_cursorIndexOfGrowwShortName)) {
              _tmpGrowwShortName = null;
            } else {
              _tmpGrowwShortName = _cursor.getString(_cursorIndexOfGrowwShortName);
            }
            final String _tmpSYMBOL;
            if (_cursor.isNull(_cursorIndexOfSYMBOL)) {
              _tmpSYMBOL = null;
            } else {
              _tmpSYMBOL = _cursor.getString(_cursorIndexOfSYMBOL);
            }
            final Company _tmpCompany;
            if (! (_cursor.isNull(_cursorIndexOfBiddingStartDate) && _cursor.isNull(_cursorIndexOfGrowwShortName_1) && _cursor.isNull(_cursorIndexOfIssueSize) && _cursor.isNull(_cursorIndexOfListingDate) && _cursor.isNull(_cursorIndexOfLogoUrl) && _cursor.isNull(_cursorIndexOfMaxPrice) && _cursor.isNull(_cursorIndexOfMinBidQuantity) && _cursor.isNull(_cursorIndexOfMinPrice) && _cursor.isNull(_cursorIndexOfSearchId) && _cursor.isNull(_cursorIndexOfStatus) && _cursor.isNull(_cursorIndexOfLiked) && _cursor.isNull(_cursorIndexOfAdditionalTxt) && _cursor.isNull(_cursorIndexOfRetailSubscriptionRate) && _cursor.isNull(_cursorIndexOfIssuePrice) && _cursor.isNull(_cursorIndexOfListingGains) && _cursor.isNull(_cursorIndexOfListingPrice) && _cursor.isNull(_cursorIndexOfSymbol))) {
              final String _tmpBiddingStartDate;
              if (_cursor.isNull(_cursorIndexOfBiddingStartDate)) {
                _tmpBiddingStartDate = null;
              } else {
                _tmpBiddingStartDate = _cursor.getString(_cursorIndexOfBiddingStartDate);
              }
              final String _tmpGrowwShortName_1;
              if (_cursor.isNull(_cursorIndexOfGrowwShortName_1)) {
                _tmpGrowwShortName_1 = null;
              } else {
                _tmpGrowwShortName_1 = _cursor.getString(_cursorIndexOfGrowwShortName_1);
              }
              final String _tmpIssueSize;
              if (_cursor.isNull(_cursorIndexOfIssueSize)) {
                _tmpIssueSize = null;
              } else {
                _tmpIssueSize = _cursor.getString(_cursorIndexOfIssueSize);
              }
              final String _tmpListingDate;
              if (_cursor.isNull(_cursorIndexOfListingDate)) {
                _tmpListingDate = null;
              } else {
                _tmpListingDate = _cursor.getString(_cursorIndexOfListingDate);
              }
              final String _tmpLogoUrl;
              if (_cursor.isNull(_cursorIndexOfLogoUrl)) {
                _tmpLogoUrl = null;
              } else {
                _tmpLogoUrl = _cursor.getString(_cursorIndexOfLogoUrl);
              }
              final String _tmpMaxPrice;
              if (_cursor.isNull(_cursorIndexOfMaxPrice)) {
                _tmpMaxPrice = null;
              } else {
                _tmpMaxPrice = _cursor.getString(_cursorIndexOfMaxPrice);
              }
              final String _tmpMinBidQuantity;
              if (_cursor.isNull(_cursorIndexOfMinBidQuantity)) {
                _tmpMinBidQuantity = null;
              } else {
                _tmpMinBidQuantity = _cursor.getString(_cursorIndexOfMinBidQuantity);
              }
              final String _tmpMinPrice;
              if (_cursor.isNull(_cursorIndexOfMinPrice)) {
                _tmpMinPrice = null;
              } else {
                _tmpMinPrice = _cursor.getString(_cursorIndexOfMinPrice);
              }
              final String _tmpSearchId;
              if (_cursor.isNull(_cursorIndexOfSearchId)) {
                _tmpSearchId = null;
              } else {
                _tmpSearchId = _cursor.getString(_cursorIndexOfSearchId);
              }
              final String _tmpStatus;
              if (_cursor.isNull(_cursorIndexOfStatus)) {
                _tmpStatus = null;
              } else {
                _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
              }
              final boolean _tmpLiked;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfLiked);
              _tmpLiked = _tmp != 0;
              final String _tmpAdditionalTxt;
              if (_cursor.isNull(_cursorIndexOfAdditionalTxt)) {
                _tmpAdditionalTxt = null;
              } else {
                _tmpAdditionalTxt = _cursor.getString(_cursorIndexOfAdditionalTxt);
              }
              final String _tmpRetailSubscriptionRate;
              if (_cursor.isNull(_cursorIndexOfRetailSubscriptionRate)) {
                _tmpRetailSubscriptionRate = null;
              } else {
                _tmpRetailSubscriptionRate = _cursor.getString(_cursorIndexOfRetailSubscriptionRate);
              }
              final String _tmpIssuePrice;
              if (_cursor.isNull(_cursorIndexOfIssuePrice)) {
                _tmpIssuePrice = null;
              } else {
                _tmpIssuePrice = _cursor.getString(_cursorIndexOfIssuePrice);
              }
              final String _tmpListingGains;
              if (_cursor.isNull(_cursorIndexOfListingGains)) {
                _tmpListingGains = null;
              } else {
                _tmpListingGains = _cursor.getString(_cursorIndexOfListingGains);
              }
              final String _tmpListingPrice;
              if (_cursor.isNull(_cursorIndexOfListingPrice)) {
                _tmpListingPrice = null;
              } else {
                _tmpListingPrice = _cursor.getString(_cursorIndexOfListingPrice);
              }
              final String _tmpSymbol;
              if (_cursor.isNull(_cursorIndexOfSymbol)) {
                _tmpSymbol = null;
              } else {
                _tmpSymbol = _cursor.getString(_cursorIndexOfSymbol);
              }
              _tmpCompany = new Company(_tmpBiddingStartDate,_tmpGrowwShortName_1,_tmpIssueSize,_tmpListingDate,_tmpLogoUrl,_tmpMaxPrice,_tmpMinBidQuantity,_tmpMinPrice,_tmpSearchId,_tmpStatus,_tmpLiked,_tmpAdditionalTxt,_tmpRetailSubscriptionRate,_tmpIssuePrice,_tmpListingGains,_tmpListingPrice,_tmpSymbol);
            }  else  {
              _tmpCompany = null;
            }
            _item = new CompanyLocalModel(_tmpID,_tmpTimeStamp,_tmpGrowwShortName,_tmpSYMBOL,_tmpCompany);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<String> getAllSymbolCompanyWishlist() {
    final String _sql = "SELECT Symbol FROM company_wishlist_table ORDER BY timeStamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public CompanyLocalModel getCompanyLocalFromGrowwShortName(final String growwShortName) {
    final String _sql = "SELECT * FROM company_wishlist_table WHERE growwShortName = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (growwShortName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, growwShortName);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfID = CursorUtil.getColumnIndexOrThrow(_cursor, "ID");
      final int _cursorIndexOfTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timeStamp");
      final int _cursorIndexOfGrowwShortName = CursorUtil.getColumnIndexOrThrow(_cursor, "ShortName");
      final int _cursorIndexOfSYMBOL = CursorUtil.getColumnIndexOrThrow(_cursor, "SYMBOLS");
      final int _cursorIndexOfBiddingStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "biddingStartDate");
      final int _cursorIndexOfGrowwShortName_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "growwShortName");
      final int _cursorIndexOfIssueSize = CursorUtil.getColumnIndexOrThrow(_cursor, "issueSize");
      final int _cursorIndexOfListingDate = CursorUtil.getColumnIndexOrThrow(_cursor, "listingDate");
      final int _cursorIndexOfLogoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "logoUrl");
      final int _cursorIndexOfMaxPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "maxPrice");
      final int _cursorIndexOfMinBidQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "minBidQuantity");
      final int _cursorIndexOfMinPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "minPrice");
      final int _cursorIndexOfSearchId = CursorUtil.getColumnIndexOrThrow(_cursor, "searchId");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfLiked = CursorUtil.getColumnIndexOrThrow(_cursor, "liked");
      final int _cursorIndexOfAdditionalTxt = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalTxt");
      final int _cursorIndexOfRetailSubscriptionRate = CursorUtil.getColumnIndexOrThrow(_cursor, "retailSubscriptionRate");
      final int _cursorIndexOfIssuePrice = CursorUtil.getColumnIndexOrThrow(_cursor, "issuePrice");
      final int _cursorIndexOfListingGains = CursorUtil.getColumnIndexOrThrow(_cursor, "listingGains");
      final int _cursorIndexOfListingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "listingPrice");
      final int _cursorIndexOfSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "symbol");
      final CompanyLocalModel _result;
      if(_cursor.moveToFirst()) {
        final int _tmpID;
        _tmpID = _cursor.getInt(_cursorIndexOfID);
        final Long _tmpTimeStamp;
        if (_cursor.isNull(_cursorIndexOfTimeStamp)) {
          _tmpTimeStamp = null;
        } else {
          _tmpTimeStamp = _cursor.getLong(_cursorIndexOfTimeStamp);
        }
        final String _tmpGrowwShortName;
        if (_cursor.isNull(_cursorIndexOfGrowwShortName)) {
          _tmpGrowwShortName = null;
        } else {
          _tmpGrowwShortName = _cursor.getString(_cursorIndexOfGrowwShortName);
        }
        final String _tmpSYMBOL;
        if (_cursor.isNull(_cursorIndexOfSYMBOL)) {
          _tmpSYMBOL = null;
        } else {
          _tmpSYMBOL = _cursor.getString(_cursorIndexOfSYMBOL);
        }
        final Company _tmpCompany;
        if (! (_cursor.isNull(_cursorIndexOfBiddingStartDate) && _cursor.isNull(_cursorIndexOfGrowwShortName_1) && _cursor.isNull(_cursorIndexOfIssueSize) && _cursor.isNull(_cursorIndexOfListingDate) && _cursor.isNull(_cursorIndexOfLogoUrl) && _cursor.isNull(_cursorIndexOfMaxPrice) && _cursor.isNull(_cursorIndexOfMinBidQuantity) && _cursor.isNull(_cursorIndexOfMinPrice) && _cursor.isNull(_cursorIndexOfSearchId) && _cursor.isNull(_cursorIndexOfStatus) && _cursor.isNull(_cursorIndexOfLiked) && _cursor.isNull(_cursorIndexOfAdditionalTxt) && _cursor.isNull(_cursorIndexOfRetailSubscriptionRate) && _cursor.isNull(_cursorIndexOfIssuePrice) && _cursor.isNull(_cursorIndexOfListingGains) && _cursor.isNull(_cursorIndexOfListingPrice) && _cursor.isNull(_cursorIndexOfSymbol))) {
          final String _tmpBiddingStartDate;
          if (_cursor.isNull(_cursorIndexOfBiddingStartDate)) {
            _tmpBiddingStartDate = null;
          } else {
            _tmpBiddingStartDate = _cursor.getString(_cursorIndexOfBiddingStartDate);
          }
          final String _tmpGrowwShortName_1;
          if (_cursor.isNull(_cursorIndexOfGrowwShortName_1)) {
            _tmpGrowwShortName_1 = null;
          } else {
            _tmpGrowwShortName_1 = _cursor.getString(_cursorIndexOfGrowwShortName_1);
          }
          final String _tmpIssueSize;
          if (_cursor.isNull(_cursorIndexOfIssueSize)) {
            _tmpIssueSize = null;
          } else {
            _tmpIssueSize = _cursor.getString(_cursorIndexOfIssueSize);
          }
          final String _tmpListingDate;
          if (_cursor.isNull(_cursorIndexOfListingDate)) {
            _tmpListingDate = null;
          } else {
            _tmpListingDate = _cursor.getString(_cursorIndexOfListingDate);
          }
          final String _tmpLogoUrl;
          if (_cursor.isNull(_cursorIndexOfLogoUrl)) {
            _tmpLogoUrl = null;
          } else {
            _tmpLogoUrl = _cursor.getString(_cursorIndexOfLogoUrl);
          }
          final String _tmpMaxPrice;
          if (_cursor.isNull(_cursorIndexOfMaxPrice)) {
            _tmpMaxPrice = null;
          } else {
            _tmpMaxPrice = _cursor.getString(_cursorIndexOfMaxPrice);
          }
          final String _tmpMinBidQuantity;
          if (_cursor.isNull(_cursorIndexOfMinBidQuantity)) {
            _tmpMinBidQuantity = null;
          } else {
            _tmpMinBidQuantity = _cursor.getString(_cursorIndexOfMinBidQuantity);
          }
          final String _tmpMinPrice;
          if (_cursor.isNull(_cursorIndexOfMinPrice)) {
            _tmpMinPrice = null;
          } else {
            _tmpMinPrice = _cursor.getString(_cursorIndexOfMinPrice);
          }
          final String _tmpSearchId;
          if (_cursor.isNull(_cursorIndexOfSearchId)) {
            _tmpSearchId = null;
          } else {
            _tmpSearchId = _cursor.getString(_cursorIndexOfSearchId);
          }
          final String _tmpStatus;
          if (_cursor.isNull(_cursorIndexOfStatus)) {
            _tmpStatus = null;
          } else {
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
          }
          final boolean _tmpLiked;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfLiked);
          _tmpLiked = _tmp != 0;
          final String _tmpAdditionalTxt;
          if (_cursor.isNull(_cursorIndexOfAdditionalTxt)) {
            _tmpAdditionalTxt = null;
          } else {
            _tmpAdditionalTxt = _cursor.getString(_cursorIndexOfAdditionalTxt);
          }
          final String _tmpRetailSubscriptionRate;
          if (_cursor.isNull(_cursorIndexOfRetailSubscriptionRate)) {
            _tmpRetailSubscriptionRate = null;
          } else {
            _tmpRetailSubscriptionRate = _cursor.getString(_cursorIndexOfRetailSubscriptionRate);
          }
          final String _tmpIssuePrice;
          if (_cursor.isNull(_cursorIndexOfIssuePrice)) {
            _tmpIssuePrice = null;
          } else {
            _tmpIssuePrice = _cursor.getString(_cursorIndexOfIssuePrice);
          }
          final String _tmpListingGains;
          if (_cursor.isNull(_cursorIndexOfListingGains)) {
            _tmpListingGains = null;
          } else {
            _tmpListingGains = _cursor.getString(_cursorIndexOfListingGains);
          }
          final String _tmpListingPrice;
          if (_cursor.isNull(_cursorIndexOfListingPrice)) {
            _tmpListingPrice = null;
          } else {
            _tmpListingPrice = _cursor.getString(_cursorIndexOfListingPrice);
          }
          final String _tmpSymbol;
          if (_cursor.isNull(_cursorIndexOfSymbol)) {
            _tmpSymbol = null;
          } else {
            _tmpSymbol = _cursor.getString(_cursorIndexOfSymbol);
          }
          _tmpCompany = new Company(_tmpBiddingStartDate,_tmpGrowwShortName_1,_tmpIssueSize,_tmpListingDate,_tmpLogoUrl,_tmpMaxPrice,_tmpMinBidQuantity,_tmpMinPrice,_tmpSearchId,_tmpStatus,_tmpLiked,_tmpAdditionalTxt,_tmpRetailSubscriptionRate,_tmpIssuePrice,_tmpListingGains,_tmpListingPrice,_tmpSymbol);
        }  else  {
          _tmpCompany = null;
        }
        _result = new CompanyLocalModel(_tmpID,_tmpTimeStamp,_tmpGrowwShortName,_tmpSYMBOL,_tmpCompany);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
