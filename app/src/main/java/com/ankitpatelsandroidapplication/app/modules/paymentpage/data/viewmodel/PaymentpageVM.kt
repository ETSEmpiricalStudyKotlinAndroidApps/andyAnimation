package com.ankitpatelsandroidapplication.app.modules.paymentpage.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.paymentpage.`data`.model.Paymentpage1RowModel
import com.ankitpatelsandroidapplication.app.modules.paymentpage.`data`.model.Paymentpage2RowModel
import com.ankitpatelsandroidapplication.app.modules.paymentpage.`data`.model.PaymentpageModel
import kotlin.collections.MutableList

public class PaymentpageVM : ViewModel() {
  public val paymentpageModel: MutableLiveData<PaymentpageModel> =
      MutableLiveData(PaymentpageModel())

  public val recyclerGroup189List: MutableLiveData<MutableList<Paymentpage1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup196List: MutableLiveData<MutableList<Paymentpage2RowModel>> =
      MutableLiveData(mutableListOf())
}
