package com.ankitpatelsandroidapplication.app.modules.paymentpage.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class PaymentpageModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateanaccou: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pay_now)
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
  public var etFormValue: String? = null
)
