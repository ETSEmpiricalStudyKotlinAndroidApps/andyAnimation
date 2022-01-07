package com.ankitpatelsandroidapplication.app.modules.productpage.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Productpage1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)

)
