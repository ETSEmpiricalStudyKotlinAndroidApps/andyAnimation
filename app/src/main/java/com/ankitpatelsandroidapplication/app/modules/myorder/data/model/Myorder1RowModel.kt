package com.ankitpatelsandroidapplication.app.modules.myorder.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Myorder1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_macdonalds)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtClassiccheesbu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_classic_cheesbu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOrderagain: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_order_again)

)
