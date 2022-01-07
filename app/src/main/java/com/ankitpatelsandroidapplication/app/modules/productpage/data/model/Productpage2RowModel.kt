package com.ankitpatelsandroidapplication.app.modules.productpage.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Productpage2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTheMacdonalds: String? =
      MyApp.getInstance().resources.getString(R.string.msg_big_cheese_burg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNo10opplekki: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_10_opp_lekki)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)

)
