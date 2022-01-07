package com.ankitpatelsandroidapplication.app.modules.login.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.login.`data`.model.LoginModel

public class LoginVM : ViewModel() {
  public val loginModel: MutableLiveData<LoginModel> = MutableLiveData(LoginModel())
}
