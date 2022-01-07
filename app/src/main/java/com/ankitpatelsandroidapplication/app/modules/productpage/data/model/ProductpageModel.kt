package com.ankitpatelsandroidapplication.app.modules.productpage.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ProductpageModel(
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
  public var txtEnjoyDelicious: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_delicious)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPopularrestaur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_popular_restaur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtViewall29: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_view_all_29)

)
