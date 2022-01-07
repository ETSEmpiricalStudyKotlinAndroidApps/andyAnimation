package com.ankitpatelsandroidapplication.app.modules.successpage.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.successpage.`data`.model.Successpage1RowModel
import com.ankitpatelsandroidapplication.app.modules.successpage.`data`.model.SuccesspageModel
import kotlin.collections.MutableList

public class SuccesspageVM : ViewModel() {
  public val successpageModel: MutableLiveData<SuccesspageModel> =
      MutableLiveData(SuccesspageModel())

  public val recyclerSuccesspagelistList: MutableLiveData<MutableList<Successpage1RowModel>> =
      MutableLiveData(mutableListOf())
}
