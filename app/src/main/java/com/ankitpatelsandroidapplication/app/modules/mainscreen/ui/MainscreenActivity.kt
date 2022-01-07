package com.ankitpatelsandroidapplication.app.modules.mainscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityMainscreenBinding
import com.ankitpatelsandroidapplication.app.modules.mainscreen.`data`.viewmodel.MainscreenVM
import com.ankitpatelsandroidapplication.app.modules.screentwo.ui.ScreentwoActivity
import kotlin.String
import kotlin.Unit

public class MainscreenActivity :
    BaseActivity<ActivityMainscreenBinding>(R.layout.activity_mainscreen) {
  private val viewModel: MainscreenVM by viewModels<MainscreenVM>()

  public override fun onInitialized(): Unit {
    binding.mainscreenVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageIcon.setOnClickListener {
      val destIntent = ScreentwoActivity.getIntent(this, null)
      startActivity(destIntent)
      this.overridePendingTransition(R.anim.zoom_in ,R.anim.zoom_out )
    }
  }

  public companion object {
    public const val TAG: String = "MAINSCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MainscreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
