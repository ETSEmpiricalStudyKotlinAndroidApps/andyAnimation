package com.ankitpatelsandroidapplication.app.modules.cart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityCartBinding
import com.ankitpatelsandroidapplication.app.modules.cart.`data`.model.Cart1RowModel
import com.ankitpatelsandroidapplication.app.modules.cart.`data`.viewmodel.CartVM
import com.ankitpatelsandroidapplication.app.modules.detailspage.ui.DetailspageActivity
import com.ankitpatelsandroidapplication.app.modules.paymentpage.ui.PaymentpageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CartActivity : BaseActivity<ActivityCartBinding>(R.layout.activity_cart) {
  private val viewModel: CartVM by viewModels<CartVM>()

  public override fun onInitialized(): Unit {
    val recyclerCartlistAdapter =
    RecyclerCartlistAdapter(viewModel.recyclerCartlistList.value?:mutableListOf())
    binding.recyclerCartlist.adapter = recyclerCartlistAdapter
    recyclerCartlistAdapter.setOnItemClickListener(
    object : RecyclerCartlistAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Cart1RowModel) {
        onClickRecyclerCartlist(view, position, item)
      }
    }
    )
    viewModel.recyclerCartlistList.observe(this) {
      recyclerCartlistAdapter.updateData(it)
    }
    binding.cartVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageVector3.setOnClickListener {
      val destIntent = DetailspageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameButton.setOnClickListener {
      val destIntent = PaymentpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerCartlist(
    view: View,
    position: Int,
    item: Cart1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "CART_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
