package com.ankitpatelsandroidapplication.app.modules.otp.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class OtpModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtResetPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAresetcodeha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_reset_code_ha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEntercode: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateanaccou: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)

)
