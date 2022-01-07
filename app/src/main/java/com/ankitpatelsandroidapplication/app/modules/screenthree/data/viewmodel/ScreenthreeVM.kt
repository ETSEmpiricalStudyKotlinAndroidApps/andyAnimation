package com.ankitpatelsandroidapplication.app.modules.screenthree.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.screenthree.`data`.model.ScreenthreeModel

public class ScreenthreeVM : ViewModel() {
  public val screenthreeModel: MutableLiveData<ScreenthreeModel> =
      MutableLiveData(ScreenthreeModel())
}
