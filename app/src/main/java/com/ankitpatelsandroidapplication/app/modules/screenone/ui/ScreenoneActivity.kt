package com.ankitpatelsandroidapplication.app.modules.screenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityScreenoneBinding
import com.ankitpatelsandroidapplication.app.modules.login.ui.LoginActivity
import com.ankitpatelsandroidapplication.app.modules.screenone.`data`.viewmodel.ScreenoneVM
import com.ankitpatelsandroidapplication.app.modules.signup.ui.SignupActivity
import kotlin.String
import kotlin.Unit

public class ScreenoneActivity : BaseActivity<ActivityScreenoneBinding>(R.layout.activity_screenone)
    {
  private val viewModel: ScreenoneVM by viewModels<ScreenoneVM>()

  public override fun onInitialized(): Unit {
    binding.screenoneVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton1.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameButton.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SCREENONE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScreenoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
