package com.ankitpatelsandroidapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityAppNavigationBinding
import com.ankitpatelsandroidapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.ankitpatelsandroidapplication.app.modules.burgermenu.ui.BurgermenuActivity
import com.ankitpatelsandroidapplication.app.modules.cart.ui.CartActivity
import com.ankitpatelsandroidapplication.app.modules.detailspage.ui.DetailspageActivity
import com.ankitpatelsandroidapplication.app.modules.forgotpassword.ui.ForgotpasswordActivity
import com.ankitpatelsandroidapplication.app.modules.login.ui.LoginActivity
import com.ankitpatelsandroidapplication.app.modules.mainscreen.ui.MainscreenActivity
import com.ankitpatelsandroidapplication.app.modules.myorder3.ui.Myorder3Activity
import com.ankitpatelsandroidapplication.app.modules.otp.ui.OtpActivity
import com.ankitpatelsandroidapplication.app.modules.payment.ui.PaymentActivity
import com.ankitpatelsandroidapplication.app.modules.paymentpage.ui.PaymentpageActivity
import com.ankitpatelsandroidapplication.app.modules.productpage.ui.ProductpageActivity
import com.ankitpatelsandroidapplication.app.modules.screenone.ui.ScreenoneActivity
import com.ankitpatelsandroidapplication.app.modules.screenthree.ui.ScreenthreeActivity
import com.ankitpatelsandroidapplication.app.modules.screentwo.ui.ScreentwoActivity
import com.ankitpatelsandroidapplication.app.modules.signup.ui.SignupActivity
import com.ankitpatelsandroidapplication.app.modules.successpage.ui.SuccesspageActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearMyOrder.setOnClickListener {
      val destIntent = Myorder3Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBurgerMenu.setOnClickListener {
      val destIntent = BurgermenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProductPage.setOnClickListener {
      val destIntent = ProductpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSuccessPage.setOnClickListener {
      val destIntent = SuccesspageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPayment.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearScreenTwo.setOnClickListener {
      val destIntent = ScreentwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMainScreen.setOnClickListener {
      val destIntent = MainscreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPaymentPage.setOnClickListener {
      val destIntent = PaymentpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOtp.setOnClickListener {
      val destIntent = OtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPassword.setOnClickListener {
      val destIntent = ForgotpasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearScreenOne.setOnClickListener {
      val destIntent = ScreenoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearScreenThree.setOnClickListener {
      val destIntent = ScreenthreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDetailsPage.setOnClickListener {
      val destIntent = DetailspageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
