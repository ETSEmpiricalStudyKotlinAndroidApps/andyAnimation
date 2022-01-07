package com.ankitpatelsandroidapplication.app.modules.signup.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.signup.`data`.model.SignupModel

public class SignupVM : ViewModel() {
  public val signupModel: MutableLiveData<SignupModel> = MutableLiveData(SignupModel())
}
