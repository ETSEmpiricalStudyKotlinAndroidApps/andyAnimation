package com.ankitpatelsandroidapplication.app.modules.mainscreen.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.mainscreen.`data`.model.MainscreenModel

public class MainscreenVM : ViewModel() {
  public val mainscreenModel: MutableLiveData<MainscreenModel> = MutableLiveData(MainscreenModel())
}
