package com.ankitpatelsandroidapplication.app.modules.forgotpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityForgotpasswordBinding
import com.ankitpatelsandroidapplication.app.modules.forgotpassword.`data`.viewmodel.ForgotpasswordVM
import kotlin.String
import kotlin.Unit

public class ForgotpasswordActivity :
    BaseActivity<ActivityForgotpasswordBinding>(R.layout.activity_forgotpassword) {
  private val viewModel: ForgotpasswordVM by viewModels<ForgotpasswordVM>()

  public override fun onInitialized(): Unit {
    binding.forgotpasswordVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "FORGOTPASSWORD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotpasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
