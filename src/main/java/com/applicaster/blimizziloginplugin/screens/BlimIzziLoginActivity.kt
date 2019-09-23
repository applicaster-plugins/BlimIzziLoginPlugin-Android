package com.applicaster.blimizziloginplugin.screens

import android.app.Activity
import android.os.Bundle
import android.webkit.JavascriptInterface
import com.applicaster.blimizziloginplugin.R
import com.applicaster.util.ui.Toaster
import kotlinx.android.synthetic.main.activity_blim_izzi_login.*

class BlimIzziLoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        wv_blim_izzi_login.settings.javaScriptEnabled = true
        wv_blim_izzi_login.addJavascriptInterface(this, "android")
        wv_blim_izzi_login.loadUrl("https://loginblim.televisa.com/app/las-estrellas/las-estrellas-en-vivo?networkName=es.televisa.lasestrellas.video|videos|en-vivo")
    }

    @JavascriptInterface
    fun onData(value: String) {
        Toaster.makeToast(this, "data received")
    }
}