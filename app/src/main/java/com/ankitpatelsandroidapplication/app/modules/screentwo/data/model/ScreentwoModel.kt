package com.ankitpatelsandroidapplication.app.modules.screentwo.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ScreentwoModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_from_a_w)
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
