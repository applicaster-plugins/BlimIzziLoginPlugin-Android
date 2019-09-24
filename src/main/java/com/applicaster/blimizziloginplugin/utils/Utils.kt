package com.applicaster.blimizziloginplugin.utils

import com.applicaster.util.PreferenceUtil

class Utils {
    companion object {
        var TIME_STAMP_LOGIN = "time_stamp_login"
        var ONE_DAY_IN_SECONDS: Long = 86400
        var ZERO: Long = 0

        fun saveTimeStamp() {
            PreferenceUtil.getInstance().setLongPref(TIME_STAMP_LOGIN, System.currentTimeMillis()/1000)
        }

        fun aDayHasPassed() : Boolean {
            // return true if TIME_STAMP_LOGIN hasn't been saved or if the difference between the
            // saved timestamp and the current one is ONE_DAY_IN_SECONDS
            return (System.currentTimeMillis()/1000) - PreferenceUtil.getInstance().getLongPref(TIME_STAMP_LOGIN, 0) >= ONE_DAY_IN_SECONDS
                    || PreferenceUtil.getInstance().getLongPref(TIME_STAMP_LOGIN, 0) == ZERO
        }
    }
}
