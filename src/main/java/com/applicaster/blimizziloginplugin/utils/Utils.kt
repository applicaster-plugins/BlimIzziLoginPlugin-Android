package com.applicaster.blimizziloginplugin.utils

import com.applicaster.util.PreferenceUtil

class Utils {
    companion object {
        var TIME_STAMP_LOGIN = "time_stamp_login"
        var ONE_DAY_IN_SECONDS: Long = 86400

        fun saveTimeStamp() {
            PreferenceUtil.getInstance().setLongPref(TIME_STAMP_LOGIN, System.currentTimeMillis()/1000)
        }

        fun aDayHasPassed() : Boolean {
            return PreferenceUtil.getInstance().getLongPref(TIME_STAMP_LOGIN, 0) -
                    (System.currentTimeMillis()/1000) == ONE_DAY_IN_SECONDS ||
                    PreferenceUtil.getInstance().getLongPref(TIME_STAMP_LOGIN, 0) == 0
        }
    }
}
