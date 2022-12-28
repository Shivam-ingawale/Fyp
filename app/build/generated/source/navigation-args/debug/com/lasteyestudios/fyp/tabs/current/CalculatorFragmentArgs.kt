package com.lasteyestudios.fyp.tabs.current

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class CalculatorFragmentArgs(
  public val medicineName: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("medicineName", this.medicineName)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("medicineName", this.medicineName)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CalculatorFragmentArgs {
      bundle.setClassLoader(CalculatorFragmentArgs::class.java.classLoader)
      val __medicineName : String?
      if (bundle.containsKey("medicineName")) {
        __medicineName = bundle.getString("medicineName")
        if (__medicineName == null) {
          throw IllegalArgumentException("Argument \"medicineName\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"medicineName\" is missing and does not have an android:defaultValue")
      }
      return CalculatorFragmentArgs(__medicineName)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CalculatorFragmentArgs {
      val __medicineName : String?
      if (savedStateHandle.contains("medicineName")) {
        __medicineName = savedStateHandle["medicineName"]
        if (__medicineName == null) {
          throw IllegalArgumentException("Argument \"medicineName\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"medicineName\" is missing and does not have an android:defaultValue")
      }
      return CalculatorFragmentArgs(__medicineName)
    }
  }
}
