package com.ankitpatelsandroidapplication.app.modules.detailspage.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class DetailspageModel(
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
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBigboysCheese: String? =
      MyApp.getInstance().resources.getString(R.string.msg_big_boys_cheese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3: String? = MyApp.getInstance().resources.getString(R.string.lbl7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt300cal: String? = MyApp.getInstance().resources.getString(R.string.lbl_300cal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt5: String? = MyApp.getInstance().resources.getString(R.string.lbl8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_10min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_our_simple_cla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtToppingsforyo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_toppings_for_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateanaccou: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_to_cart)

)
