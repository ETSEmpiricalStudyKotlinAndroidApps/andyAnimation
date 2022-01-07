package com.ankitpatelsandroidapplication.app.modules.detailspage.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Detailspage1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRegularBun: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_regular_bun)

)
