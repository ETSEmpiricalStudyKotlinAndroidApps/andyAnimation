package com.ankitpatelsandroidapplication.app.modules.myorder3.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.myorder3.`data`.model.Myorder3Model

public class Myorder3VM : ViewModel() {
  public val myorder3Model: MutableLiveData<Myorder3Model> = MutableLiveData(Myorder3Model())
}
