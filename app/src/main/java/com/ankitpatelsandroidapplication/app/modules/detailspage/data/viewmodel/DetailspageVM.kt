package com.ankitpatelsandroidapplication.app.modules.detailspage.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.detailspage.`data`.model.Detailspage1RowModel
import com.ankitpatelsandroidapplication.app.modules.detailspage.`data`.model.DetailspageModel
import kotlin.collections.MutableList

public class DetailspageVM : ViewModel() {
  public val detailspageModel: MutableLiveData<DetailspageModel> =
      MutableLiveData(DetailspageModel())

  public val recyclerDetailspagelistList: MutableLiveData<MutableList<Detailspage1RowModel>> =
      MutableLiveData(mutableListOf())
}
