package com.ankitpatelsandroidapplication.app.modules.paymentpage.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Paymentpage1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_exp_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForm: String? = MyApp.getInstance().resources.getString(R.string.lbl_dd_mm)

)
