package com.ankitpatelsandroidapplication.app.modules.burgermenu.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class BurgermenuModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMarvisIghedosa: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_marvis_ighedosa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dosamarvis_gmai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPaymentmethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyprofile: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrivacypolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)

)
