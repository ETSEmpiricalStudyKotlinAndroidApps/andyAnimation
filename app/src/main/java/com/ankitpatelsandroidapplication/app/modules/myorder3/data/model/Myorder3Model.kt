package com.ankitpatelsandroidapplication.app.modules.myorder3.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Myorder3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourorders: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_orders)

)
