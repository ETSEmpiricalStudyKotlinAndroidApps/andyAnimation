package com.ankitpatelsandroidapplication.app.modules.login.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogintoyoura: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_to_your_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGoodtoseeyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_good_to_see_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTitle1: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
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
  public var etFormValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etForm1Value: String? = null
)
