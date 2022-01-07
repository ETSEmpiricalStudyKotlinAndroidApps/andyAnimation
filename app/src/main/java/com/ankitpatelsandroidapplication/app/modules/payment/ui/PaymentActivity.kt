package com.ankitpatelsandroidapplication.app.modules.payment.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityPaymentBinding
import com.ankitpatelsandroidapplication.app.modules.cart.ui.CartActivity
import com.ankitpatelsandroidapplication.app.modules.payment.`data`.model.Payment1RowModel
import com.ankitpatelsandroidapplication.app.modules.payment.`data`.viewmodel.PaymentVM
import com.ankitpatelsandroidapplication.app.modules.successpage.ui.SuccesspageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class PaymentActivity : BaseActivity<ActivityPaymentBinding>(R.layout.activity_payment) {
  private val viewModel: PaymentVM by viewModels<PaymentVM>()

  public override fun onInitialized(): Unit {
    val recyclerPaymentlistAdapter =
    RecyclerPaymentlistAdapter(viewModel.recyclerPaymentlistList.value?:mutableListOf())
    binding.recyclerPaymentlist.adapter = recyclerPaymentlistAdapter
    recyclerPaymentlistAdapter.setOnItemClickListener(
    object : RecyclerPaymentlistAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Payment1RowModel) {
        onClickRecyclerPaymentlist(view, position, item)
      }
    }
    )
    viewModel.recyclerPaymentlistList.observe(this) {
      recyclerPaymentlistAdapter.updateData(it)
    }
    binding.paymentVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton.setOnClickListener {
      val destIntent = SuccesspageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVector36.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerPaymentlist(
    view: View,
    position: Int,
    item: Payment1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "PAYMENT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PaymentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
