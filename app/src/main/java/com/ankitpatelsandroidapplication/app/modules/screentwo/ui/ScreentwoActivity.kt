package com.ankitpatelsandroidapplication.app.modules.screentwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityScreentwoBinding
import com.ankitpatelsandroidapplication.app.modules.login.ui.LoginActivity
import com.ankitpatelsandroidapplication.app.modules.screentwo.`data`.viewmodel.ScreentwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ScreentwoActivity : BaseActivity<ActivityScreentwoBinding>(R.layout.activity_screentwo)
    {
  private val viewModel: ScreentwoVM by viewModels<ScreentwoVM>()

  private val REQUEST_CODE_LOGIN_ACTIVITY: Int = 599

  public override fun onInitialized(): Unit {
    binding.screentwoVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LOGIN_ACTIVITY)
      this.overridePendingTransition(R.anim.fade_in ,R.anim.fade_out )
    }
  }

  public companion object {
    public const val TAG: String = "SCREENTWO_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScreentwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
