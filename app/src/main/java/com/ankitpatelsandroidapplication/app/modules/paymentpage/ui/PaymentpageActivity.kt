package com.ankitpatelsandroidapplication.app.modules.paymentpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityPaymentpageBinding
import com.ankitpatelsandroidapplication.app.modules.payment.ui.PaymentActivity
import com.ankitpatelsandroidapplication.app.modules.paymentpage.`data`.model.Paymentpage1RowModel
import com.ankitpatelsandroidapplication.app.modules.paymentpage.`data`.model.Paymentpage2RowModel
import com.ankitpatelsandroidapplication.app.modules.paymentpage.`data`.viewmodel.PaymentpageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class PaymentpageActivity :
    BaseActivity<ActivityPaymentpageBinding>(R.layout.activity_paymentpage) {
  private val viewModel: PaymentpageVM by viewModels<PaymentpageVM>()

  public override fun onInitialized(): Unit {
    val recyclerGroup189Adapter =
    RecyclerGroup189Adapter(viewModel.recyclerGroup189List.value?:mutableListOf())
    binding.recyclerGroup189.adapter = recyclerGroup189Adapter
    recyclerGroup189Adapter.setOnItemClickListener(
    object : RecyclerGroup189Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Paymentpage1RowModel) {
        onClickRecyclerGroup189(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup189List.observe(this) {
      recyclerGroup189Adapter.updateData(it)
    }
    val recyclerGroup196Adapter =
    RecyclerGroup196Adapter(viewModel.recyclerGroup196List.value?:mutableListOf())
    binding.recyclerGroup196.adapter = recyclerGroup196Adapter
    recyclerGroup196Adapter.setOnItemClickListener(
    object : RecyclerGroup196Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Paymentpage2RowModel) {
        onClickRecyclerGroup196(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup196List.observe(this) {
      recyclerGroup196Adapter.updateData(it)
    }
    binding.paymentpageVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageVector36.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameButton.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerGroup189(
    view: View,
    position: Int,
    item: Paymentpage1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup196(
    view: View,
    position: Int,
    item: Paymentpage2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "PAYMENTPAGE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PaymentpageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
