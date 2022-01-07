package com.ankitpatelsandroidapplication.app.modules.screenone.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ScreenoneModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOrderfromyour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_from_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateanaccou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_accou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateanaccou1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_login)

)
