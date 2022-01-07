package com.ankitpatelsandroidapplication.app.modules.successpage.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SuccesspageModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourorderhas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_order_has)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTime: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sit_and_relax_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateanaccou: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_go_back_to_home)
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
