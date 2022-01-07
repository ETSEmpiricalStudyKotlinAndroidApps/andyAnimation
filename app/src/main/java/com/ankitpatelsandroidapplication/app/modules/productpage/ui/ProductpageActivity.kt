package com.ankitpatelsandroidapplication.app.modules.productpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityProductpageBinding
import com.ankitpatelsandroidapplication.app.modules.burgermenu.ui.BurgermenuActivity
import com.ankitpatelsandroidapplication.app.modules.detailspage.ui.DetailspageActivity
import com.ankitpatelsandroidapplication.app.modules.productpage.`data`.model.Productpage1RowModel
import com.ankitpatelsandroidapplication.app.modules.productpage.`data`.model.Productpage2RowModel
import com.ankitpatelsandroidapplication.app.modules.productpage.`data`.viewmodel.ProductpageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProductpageActivity :
    BaseActivity<ActivityProductpageBinding>(R.layout.activity_productpage) {
  private val viewModel: ProductpageVM by viewModels<ProductpageVM>()

  public override fun onInitialized(): Unit {
    val recyclerGroup461Adapter =
    RecyclerGroup461Adapter(viewModel.recyclerGroup461List.value?:mutableListOf())
    binding.recyclerGroup461.adapter = recyclerGroup461Adapter
    recyclerGroup461Adapter.setOnItemClickListener(
    object : RecyclerGroup461Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Productpage1RowModel) {
        onClickRecyclerGroup461(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup461List.observe(this) {
      recyclerGroup461Adapter.updateData(it)
    }
    val recyclerGroup117Adapter =
    RecyclerGroup117Adapter(viewModel.recyclerGroup117List.value?:mutableListOf())
    binding.recyclerGroup117.adapter = recyclerGroup117Adapter
    recyclerGroup117Adapter.setOnItemClickListener(
    object : RecyclerGroup117Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Productpage2RowModel) {
        onClickRecyclerGroup117(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup117List.observe(this) {
      recyclerGroup117Adapter.updateData(it)
    }
    binding.productpageVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearGroup399.setOnClickListener {
      val destIntent = BurgermenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerGroup461(
    view: View,
    position: Int,
    item: Productpage1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup117(
    view: View,
    position: Int,
    item: Productpage2RowModel
  ): Unit {
    when(view.id) {
      R.id.linearGroup -> {
        val destIntent = DetailspageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public companion object {
    public const val TAG: String = "PRODUCTPAGE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductpageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
