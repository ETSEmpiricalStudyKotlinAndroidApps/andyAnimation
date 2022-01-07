package com.ankitpatelsandroidapplication.app.modules.screentwo.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.screentwo.`data`.model.ScreentwoModel

public class ScreentwoVM : ViewModel() {
  public val screentwoModel: MutableLiveData<ScreentwoModel> = MutableLiveData(ScreentwoModel())
}
