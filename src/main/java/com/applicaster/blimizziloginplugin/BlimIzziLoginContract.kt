package com.applicaster.blimizziloginplugin

import android.content.Context
import android.content.Intent
import com.applicaster.blimizziloginplugin.screens.BlimIzziLoginActivity
import com.applicaster.plugin_manager.PluginSchemeI
import com.applicaster.plugin_manager.hook.HookListener
import com.applicaster.plugin_manager.login.AsyncLoginContract
import com.applicaster.plugin_manager.playersmanager.Playable

class BlimIzziLoginContract : AsyncLoginContract(), PluginSchemeI {
    override fun login(context: Context?, additionalParams: MutableMap<Any?, Any?>?) {
        // todo: implement
    }

    override fun login(context: Context?, playable: Playable?, additionalParams: MutableMap<Any?, Any?>?) {
        // todo: implement
    }

    override fun isItemLocked(model: Any?): Boolean {
        // todo: implement
        return true
    }

    override fun isTokenValid(): Boolean {
        // todo: implement
        return false
    }

    override fun setToken(token: String?) {
        // todo: implement
    }

    override fun executeOnStartup(context: Context?, listener: HookListener?) {
        // todo: implement
    }

    override fun getToken(): String? {
        // todo: implement
        return null
    }

    override fun setPluginConfigurationParams(params: MutableMap<Any?, Any?>?) {
        // todo: implement
    }

    override fun handlePluginScheme(context: Context?, data: MutableMap<String, String>?): Boolean {
        // todo: implement
        return false
    }

    override fun executeOnApplicationReady(context: Context?, listener: HookListener?) {
        // todo: implement
        context?.startActivity(Intent(context, BlimIzziLoginActivity::class.java))
    }

    override fun logout(context: Context?, additionalParams: MutableMap<Any?, Any?>?) {
        // todo: implement
    }

}