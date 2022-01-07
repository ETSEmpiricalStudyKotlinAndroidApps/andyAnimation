package com.ankitpatelsandroidapplication.app.modules.detailspage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityDetailspageBinding
import com.ankitpatelsandroidapplication.app.modules.cart.ui.CartActivity
import com.ankitpatelsandroidapplication.app.modules.detailspage.`data`.model.Detailspage1RowModel
import com.ankitpatelsandroidapplication.app.modules.detailspage.`data`.viewmodel.DetailspageVM
import com.ankitpatelsandroidapplication.app.modules.productpage.ui.ProductpageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DetailspageActivity :
    BaseActivity<ActivityDetailspageBinding>(R.layout.activity_detailspage) {
  private val viewModel: DetailspageVM by viewModels<DetailspageVM>()

  public override fun onInitialized(): Unit {
    val recyclerDetailspagelistAdapter =
    RecyclerDetailspagelistAdapter(viewModel.recyclerDetailspagelistList.value?:mutableListOf())
    binding.recyclerDetailspagelist.adapter = recyclerDetailspagelistAdapter
    recyclerDetailspagelistAdapter.setOnItemClickListener(
    object : RecyclerDetailspagelistAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Detailspage1RowModel) {
        onClickRecyclerDetailspagelist(view, position, item)
      }
    }
    )
    viewModel.recyclerDetailspagelistList.observe(this) {
      recyclerDetailspagelistAdapter.updateData(it)
    }
    binding.detailspageVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameRectangle12.setOnClickListener {
      val destIntent = ProductpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerDetailspagelist(
    view: View,
    position: Int,
    item: Detailspage1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "DETAILSPAGE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailspageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
