package com.ankitpatelsandroidapplication.app.modules.forgotpassword.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ForgotpasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEnteryouremai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_emai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSigninwithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_go)
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
      MyApp.getInstance().resources.getString(R.string.msg_login_to_my_acc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etFormValue: String? = null
)
