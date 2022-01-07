package com.ankitpatelsandroidapplication.app.modules.otp.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitpatelsandroidapplication.app.modules.otp.`data`.model.OtpModel

public class OtpVM : ViewModel() {
  public val otpModel: MutableLiveData<OtpModel> = MutableLiveData(OtpModel())
}
