package com.ankitpatelsandroidapplication.app.modules.successpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivitySuccesspageBinding
import com.ankitpatelsandroidapplication.app.modules.paymentpage.ui.PaymentpageActivity
import com.ankitpatelsandroidapplication.app.modules.productpage.ui.ProductpageActivity
import com.ankitpatelsandroidapplication.app.modules.successpage.`data`.model.Successpage1RowModel
import com.ankitpatelsandroidapplication.app.modules.successpage.`data`.viewmodel.SuccesspageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SuccesspageActivity :
    BaseActivity<ActivitySuccesspageBinding>(R.layout.activity_successpage) {
  private val viewModel: SuccesspageVM by viewModels<SuccesspageVM>()

  public override fun onInitialized(): Unit {
    val recyclerSuccesspagelistAdapter =
    RecyclerSuccesspagelistAdapter(viewModel.recyclerSuccesspagelistList.value?:mutableListOf())
    binding.recyclerSuccesspagelist.adapter = recyclerSuccesspagelistAdapter
    recyclerSuccesspagelistAdapter.setOnItemClickListener(
    object : RecyclerSuccesspagelistAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Successpage1RowModel) {
        onClickRecyclerSuccesspagelist(view, position, item)
      }
    }
    )
    viewModel.recyclerSuccesspagelistList.observe(this) {
      recyclerSuccesspagelistAdapter.updateData(it)
    }
    binding.successpageVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageVector36.setOnClickListener {
      val destIntent = PaymentpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameButton.setOnClickListener {
      val destIntent = ProductpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerSuccesspagelist(
    view: View,
    position: Int,
    item: Successpage1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "SUCCESSPAGE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SuccesspageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
