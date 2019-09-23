package com.applicaster.blimizziloginplugin

import android.content.Context
import android.content.Intent
import com.applicaster.blimizziloginplugin.screens.BlimIzziLoginActivity
import com.applicaster.blimizziloginplugin.utils.Utils
import com.applicaster.plugin_manager.PluginSchemeI
import com.applicaster.plugin_manager.hook.HookListener
import com.applicaster.plugin_manager.login.AsyncLoginContract
import com.applicaster.plugin_manager.login.LoginManager
import com.applicaster.plugin_manager.playersmanager.Playable

class BlimIzziLoginContract : AsyncLoginContract(), PluginSchemeI {
    override fun login(context: Context?, additionalParams: MutableMap<Any?, Any?>?) {
        // do nothing
    }

    override fun login(context: Context?, playable: Playable?, additionalParams: MutableMap<Any?, Any?>?) {
        // do nothing
    }

    override fun isItemLocked(model: Any?): Boolean {
        return true
    }

    override fun isTokenValid(): Boolean {
        return false
    }

    override fun setToken(token: String?) {
        // do nothing
    }

    override fun executeOnStartup(context: Context?, listener: HookListener?) {
        // do nothing
    }

    override fun getToken(): String? {
        // do nothing
        return null
    }

    override fun setPluginConfigurationParams(params: MutableMap<Any?, Any?>?) {
        // do nothing
    }

    override fun handlePluginScheme(context: Context?, data: MutableMap<String, String>?): Boolean {
        // do nothing
        return false
    }

    override fun executeOnApplicationReady(context: Context?, listener: HookListener?) {
        if(Utils.aDayHasPassed()) {
            context?.startActivity(Intent(context, BlimIzziLoginActivity::class.java))
        } else {
            LoginManager.notifyEvent(context, LoginManager.RequestType.LOGIN, true)
        }
    }

    override fun logout(context: Context?, additionalParams: MutableMap<Any?, Any?>?) {
        // do nothing
    }

}
