package com.ankitpatelsandroidapplication.app.modules.myorder.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.myorder.`data`.model.Myorder1RowModel
import com.ankitpatelsandroidapplication.app.modules.myorder.`data`.model.Myorder2RowModel
import com.ankitpatelsandroidapplication.app.modules.myorder.`data`.model.MyorderModel
import kotlin.collections.MutableList

public class MyorderVM : ViewModel() {
  public val myorderModel: MutableLiveData<MyorderModel> = MutableLiveData(MyorderModel())

  public val recyclerGroup239List: MutableLiveData<MutableList<Myorder1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup240List: MutableLiveData<MutableList<Myorder2RowModel>> =
      MutableLiveData(mutableListOf())
}
