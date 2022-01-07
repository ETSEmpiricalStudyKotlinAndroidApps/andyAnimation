package com.ankitpatelsandroidapplication.app.modules.myorder3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityMyorder3Binding
import com.ankitpatelsandroidapplication.app.modules.myorder3.`data`.viewmodel.Myorder3VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

public class Myorder3Activity : BaseActivity<ActivityMyorder3Binding>(R.layout.activity_myorder3) {
  private val viewModel: Myorder3VM by viewModels<Myorder3VM>()

  public override fun onInitialized(): Unit {
    binding.myorder3VM = viewModel
    val adapter = Myorder3ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTablayout,binding.viewPagerViewpager) { tab, position ->
      tab.text = Myorder3ActivityPagerAdapter.title[position]
      }.attach()
    }

    public override fun setUpClicks(): Unit {
    }

    public companion object {
      public const val TAG: String = "MYORDER3ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Myorder3Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
