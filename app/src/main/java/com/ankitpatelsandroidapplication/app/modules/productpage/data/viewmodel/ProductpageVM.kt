package com.ankitpatelsandroidapplication.app.modules.productpage.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.productpage.`data`.model.Productpage1RowModel
import com.ankitpatelsandroidapplication.app.modules.productpage.`data`.model.Productpage2RowModel
import com.ankitpatelsandroidapplication.app.modules.productpage.`data`.model.ProductpageModel
import kotlin.collections.MutableList

public class ProductpageVM : ViewModel() {
  public val productpageModel: MutableLiveData<ProductpageModel> =
      MutableLiveData(ProductpageModel())

  public val recyclerGroup461List: MutableLiveData<MutableList<Productpage1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup117List: MutableLiveData<MutableList<Productpage2RowModel>> =
      MutableLiveData(mutableListOf())
}
