package com.ankitpatelsandroidapplication.app.modules.forgotpassword.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.forgotpassword.`data`.model.ForgotpasswordModel

public class ForgotpasswordVM : ViewModel() {
  public val forgotpasswordModel: MutableLiveData<ForgotpasswordModel> =
      MutableLiveData(ForgotpasswordModel())
}
