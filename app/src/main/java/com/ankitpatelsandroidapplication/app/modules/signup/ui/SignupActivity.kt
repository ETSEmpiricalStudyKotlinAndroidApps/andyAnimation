package com.ankitpatelsandroidapplication.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivitySignupBinding
import com.ankitpatelsandroidapplication.app.modules.login.ui.LoginActivity
import com.ankitpatelsandroidapplication.app.modules.signup.`data`.viewmodel.SignupVM
import kotlin.String
import kotlin.Unit

public class SignupActivity : BaseActivity<ActivitySignupBinding>(R.layout.activity_signup) {
  private val viewModel: SignupVM by viewModels<SignupVM>()

  public override fun onInitialized(): Unit {
    binding.signupVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SIGNUP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
