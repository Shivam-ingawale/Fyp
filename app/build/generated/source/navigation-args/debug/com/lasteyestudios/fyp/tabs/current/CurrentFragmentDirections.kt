package com.lasteyestudios.fyp.tabs.current

import android.os.Bundle
import androidx.navigation.NavDirections
import com.lasteyestudios.fyp.R
import kotlin.Int
import kotlin.String

public class CurrentFragmentDirections private constructor() {
  private data class ActionRecyclerFragmentToCalculatorFragment(
    public val medicineName: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_RecyclerFragment_to_calculatorFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("medicineName", this.medicineName)
        return result
      }
  }

  public companion object {
    public fun actionRecyclerFragmentToCalculatorFragment(medicineName: String): NavDirections =
        ActionRecyclerFragmentToCalculatorFragment(medicineName)
  }
}
