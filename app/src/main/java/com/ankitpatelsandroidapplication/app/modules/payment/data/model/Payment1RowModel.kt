package com.ankitpatelsandroidapplication.app.modules.payment.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Payment1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtConferenceroom: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_conference_room)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNight: String? = MyApp.getInstance().resources.getString(R.string.lbl_night)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtN77000: String? = MyApp.getInstance().resources.getString(R.string.lbl_n77_000)

)
