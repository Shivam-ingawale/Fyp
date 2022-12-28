package com.lasteyestudios.fyp.tabs.allotment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.lasteyestudios.fyp.R
import kotlin.Int
import kotlin.String

public class AllotmentFragmentDirections private constructor() {
  private data class ActionListedFragmentToSearchAllotmentFragment(
    public val companyId: String,
    public val companyName: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_ListedFragment_to_searchAllotmentFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("companyId", this.companyId)
        result.putString("companyName", this.companyName)
        return result
      }
  }

  public companion object {
    public fun actionListedFragmentToSearchAllotmentFragment(companyId: String,
        companyName: String): NavDirections =
        ActionListedFragmentToSearchAllotmentFragment(companyId, companyName)
  }
}
