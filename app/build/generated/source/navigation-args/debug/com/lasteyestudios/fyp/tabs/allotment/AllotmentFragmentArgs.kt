package com.lasteyestudios.fyp.tabs.allotment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AllotmentFragmentArgs(
  public val searchId: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("searchId", this.searchId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("searchId", this.searchId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AllotmentFragmentArgs {
      bundle.setClassLoader(AllotmentFragmentArgs::class.java.classLoader)
      val __searchId : String?
      if (bundle.containsKey("searchId")) {
        __searchId = bundle.getString("searchId")
        if (__searchId == null) {
          throw IllegalArgumentException("Argument \"searchId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"searchId\" is missing and does not have an android:defaultValue")
      }
      return AllotmentFragmentArgs(__searchId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AllotmentFragmentArgs {
      val __searchId : String?
      if (savedStateHandle.contains("searchId")) {
        __searchId = savedStateHandle["searchId"]
        if (__searchId == null) {
          throw IllegalArgumentException("Argument \"searchId\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"searchId\" is missing and does not have an android:defaultValue")
      }
      return AllotmentFragmentArgs(__searchId)
    }
  }
}
