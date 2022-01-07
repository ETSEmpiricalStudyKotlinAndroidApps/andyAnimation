package com.ankitpatelsandroidapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityLoginBinding
import com.ankitpatelsandroidapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.ankitpatelsandroidapplication.app.modules.otp.ui.OtpActivity
import kotlin.String
import kotlin.Unit

public class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  public override fun onInitialized(): Unit {
    binding.loginVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton.setOnClickListener {
      val destIntent = OtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "LOGIN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
