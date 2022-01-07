package com.ankitpatelsandroidapplication.app.modules.payment.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.payment.`data`.model.Payment1RowModel
import com.ankitpatelsandroidapplication.app.modules.payment.`data`.model.PaymentModel
import kotlin.collections.MutableList

public class PaymentVM : ViewModel() {
  public val paymentModel: MutableLiveData<PaymentModel> = MutableLiveData(PaymentModel())

  public val recyclerPaymentlistList: MutableLiveData<MutableList<Payment1RowModel>> =
      MutableLiveData(mutableListOf())
}
