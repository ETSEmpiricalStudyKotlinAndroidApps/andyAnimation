package com.ankitpatelsandroidapplication.app.modules.screenthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityScreenthreeBinding
import com.ankitpatelsandroidapplication.app.modules.screenthree.`data`.viewmodel.ScreenthreeVM
import kotlin.String
import kotlin.Unit

public class ScreenthreeActivity :
    BaseActivity<ActivityScreenthreeBinding>(R.layout.activity_screenthree) {
  private val viewModel: ScreenthreeVM by viewModels<ScreenthreeVM>()

  public override fun onInitialized(): Unit {
    binding.screenthreeVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "SCREENTHREE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScreenthreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
