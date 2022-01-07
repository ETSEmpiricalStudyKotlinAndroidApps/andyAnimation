package com.ankitpatelsandroidapplication.app.modules.cart.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class CartModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDeliveryto: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delivery_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLekkiphase1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lekki_phase_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourcart: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_cart)
  ,
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
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.lbl_345)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateanaccou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_process_to_paym)

)
