package com.ankitpatelsandroidapplication.app.modules.otp.ui

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.ankitpatelsandroidapplication.app.R
import com.ankitpatelsandroidapplication.app.appcomponents.base.BaseActivity
import com.ankitpatelsandroidapplication.app.databinding.ActivityOtpBinding
import com.ankitpatelsandroidapplication.app.modules.otp.`data`.viewmodel.OtpVM
import com.ankitpatelsandroidapplication.app.modules.productpage.ui.ProductpageActivity
import com.google.android.gms.auth.api.phone.SmsRetriever
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.String
import kotlin.Unit

public class OtpActivity : BaseActivity<ActivityOtpBinding>(R.layout.activity_otp) {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null

  public val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
                               ActivityResultCallback{ 
                               val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
          
                               getOtpFromMessage(message!!) 
                               })

  private val viewModel: OtpVM by viewModels<OtpVM>()

  public override fun onInitialized(): Unit {
    startSmartUserConsent()
    binding.otpVM = viewModel
  }

  public override fun onStop(): Unit {
    super.onStop()
    unregisterReceiver(otpViewOtpviewBroadcastReceiver)
  }

  public override fun onStart(): Unit {
    super.onStart()
    registerBroadcastReceiver()
  }

  public override fun setUpClicks(): Unit {
    binding.frameButton.setOnClickListener {
      val destIntent = ProductpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtCancel.setOnClickListener {
      finish()
    }
  }

  private fun startSmartUserConsent(): Unit {
    val client = SmsRetriever.getClient(this)
    client.startSmsUserConsent(null)
  }

  private fun registerBroadcastReceiver(): Unit {
    otpViewOtpviewBroadcastReceiver = OtpViewOtpviewBroadcastReceiver()
    otpViewOtpviewBroadcastReceiver?.otpBroadcastReceiverListener =
    object : OtpViewOtpviewBroadcastReceiver.OtpBroadcastListener {
      override fun onSuccess(intent: Intent?) {
        getActivityResult.launch(intent)
      }
      override fun onFailure() {

      }
    }
    val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
    registerReceiver(otpViewOtpviewBroadcastReceiver, intentFilter)
  }

  private fun getOtpFromMessage(message: String): Unit {
    val otpPattern: Pattern = Pattern.compile("(|^)\\d{4}")
    val matcher: Matcher = otpPattern.matcher(message)
    if (matcher.find()) {
      binding.otpViewOtpview?.setText(matcher.group(0))
    }
  }

  public companion object {
    public const val TAG: String = "OTP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OtpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
