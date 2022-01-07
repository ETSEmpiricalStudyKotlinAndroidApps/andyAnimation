package com.ankitpatelsandroidapplication.app.modules.myorder.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class MyorderModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGotoHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_go_to_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSuperdeluxedr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_super_deluxed_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNight: String? = MyApp.getInstance().resources.getString(R.string.lbl_night)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtN55000: String? = MyApp.getInstance().resources.getString(R.string.lbl_n55_000)

)
