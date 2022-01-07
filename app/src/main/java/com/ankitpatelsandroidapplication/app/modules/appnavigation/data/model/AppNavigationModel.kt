package com.ankitpatelsandroidapplication.app.modules.appnavigation.`data`.model

import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMainScreen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mainscreen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtScreenTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_screentwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtScreenThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_screenthree)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgotpassword)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOtp: String? = MyApp.getInstance().resources.getString(R.string.lbl_otp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtProductPage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_productpage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDetailsPage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_detailspage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBurgerMenu: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_burgermenu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtScreenOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_screenone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPaymentPage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_paymentpage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSuccessPage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_successpage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMyOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_myorder)

)
