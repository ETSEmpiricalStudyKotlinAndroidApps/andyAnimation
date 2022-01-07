package com.ankitpatelsandroidapplication.app.modules.burgermenu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityBurgermenuBinding
import com.ankitpatelsandroidapplication.app.modules.burgermenu.`data`.viewmodel.BurgermenuVM
import com.ankitpatelsandroidapplication.app.modules.login.ui.LoginActivity
import com.ankitpatelsandroidapplication.app.modules.productpage.ui.ProductpageActivity
import kotlin.String
import kotlin.Unit

public class BurgermenuActivity :
    BaseActivity<ActivityBurgermenuBinding>(R.layout.activity_burgermenu) {
  private val viewModel: BurgermenuVM by viewModels<BurgermenuVM>()

  public override fun onInitialized(): Unit {
    binding.burgermenuVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnLogOut.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameRectangle12.setOnClickListener {
      val destIntent = ProductpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "BURGERMENU_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BurgermenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
