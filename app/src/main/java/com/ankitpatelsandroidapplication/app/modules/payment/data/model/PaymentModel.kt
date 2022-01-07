package com.ankitpatelsandroidapplication.app.modules.payment.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class PaymentModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDeliverymethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delivery_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTimeZone: String? =
      MyApp.getInstance().resources.getString(R.string.msg_137_teaticket_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMobileNo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_234_9011039271)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtChange1: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pay_with_cash_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDeliveryFee: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delivery_fee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubtotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_subtotal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.lbl_520)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice2: String? = MyApp.getInstance().resources.getString(R.string.lbl_540)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateanaccou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_proceed_to_paym)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup443Value: String? = null
)
