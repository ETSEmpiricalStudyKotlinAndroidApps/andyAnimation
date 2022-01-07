package com.ankitpatelsandroidapplication.app.modules.screenone.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.screenone.`data`.model.ScreenoneModel

public class ScreenoneVM : ViewModel() {
  public val screenoneModel: MutableLiveData<ScreenoneModel> = MutableLiveData(ScreenoneModel())
}
