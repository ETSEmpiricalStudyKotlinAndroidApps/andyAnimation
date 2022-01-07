package com.ankitpatelsandroidapplication.app.modules.burgermenu.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.burgermenu.`data`.model.BurgermenuModel

public class BurgermenuVM : ViewModel() {
  public val burgermenuModel: MutableLiveData<BurgermenuModel> = MutableLiveData(BurgermenuModel())
}
