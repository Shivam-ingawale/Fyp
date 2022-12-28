package com.lasteyestudios.fyp.tabs.allotment.searchallotment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SearchAllotmentFragmentArgs(
  public val companyId: String,
  public val companyName: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("companyId", this.companyId)
    result.putString("companyName", this.companyName)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("companyId", this.companyId)
    result.set("companyName", this.companyName)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SearchAllotmentFragmentArgs {
      bundle.setClassLoader(SearchAllotmentFragmentArgs::class.java.classLoader)
      val __companyId : String?
      if (bundle.containsKey("companyId")) {
        __companyId = bundle.getString("companyId")
        if (__companyId == null) {
          throw IllegalArgumentException("Argument \"companyId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"companyId\" is missing and does not have an android:defaultValue")
      }
      val __companyName : String?
      if (bundle.containsKey("companyName")) {
        __companyName = bundle.getString("companyName")
        if (__companyName == null) {
          throw IllegalArgumentException("Argument \"companyName\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"companyName\" is missing and does not have an android:defaultValue")
      }
      return SearchAllotmentFragmentArgs(__companyId, __companyName)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        SearchAllotmentFragmentArgs {
      val __companyId : String?
      if (savedStateHandle.contains("companyId")) {
        __companyId = savedStateHandle["companyId"]
        if (__companyId == null) {
          throw IllegalArgumentException("Argument \"companyId\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"companyId\" is missing and does not have an android:defaultValue")
      }
      val __companyName : String?
      if (savedStateHandle.contains("companyName")) {
        __companyName = savedStateHandle["companyName"]
        if (__companyName == null) {
          throw IllegalArgumentException("Argument \"companyName\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"companyName\" is missing and does not have an android:defaultValue")
      }
      return SearchAllotmentFragmentArgs(__companyId, __companyName)
    }
  }
}
