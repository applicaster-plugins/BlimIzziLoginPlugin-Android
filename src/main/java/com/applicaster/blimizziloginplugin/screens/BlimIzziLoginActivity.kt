package com.applicaster.blimizziloginplugin.screens

import android.app.Activity
import android.content.Context
import android.os.Bundle
import com.applicaster.blimizziloginplugin.R
import com.applicaster.blimizziloginplugin.utils.Utils
import com.applicaster.plugin_manager.login.LoginManager
import kotlinx.android.synthetic.main.activity_blim_izzi_login.*
import android.R.id.message
import android.webkit.*


class BlimIzziLoginActivity : Activity() {

    var LOGIN_URL = "https://loginblim.televisa.com/app/las-estrellas/las-estrellas-en-vivo?networkName=es.televisa.lasestrellas.video|videos|en-vivo"
    var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blim_izzi_login)

        wv_blim_izzi_login.settings.javaScriptEnabled = true
        // to avoid opening another browser
        wv_blim_izzi_login.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                return false
            }
        }

        wv_blim_izzi_login.webChromeClient = object : WebChromeClient() {
            override fun onConsoleMessage(consoleMessage: ConsoleMessage): Boolean {
                android.util.Log.d("WebView", consoleMessage.message())
                if (consoleMessage.message().startsWith("logged:true")) {
                    LoginManager.notifyEvent(context, LoginManager.RequestType.LOGIN, true)
                    Utils.saveTimeStamp()
                    finish()
                }
                return true
            }
        }
        wv_blim_izzi_login.loadUrl(LOGIN_URL)
    }
}
