package com.ankitpatelsandroidapplication.app.modules.signup.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SignupModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
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
  public var txtWelcomefriend: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_friend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmailTitle: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTitle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)
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
  public var txtCreateanaccou1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_accou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateanaccou2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_to_my_acc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEmailTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPassTextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etFormValue: String? = null
)
