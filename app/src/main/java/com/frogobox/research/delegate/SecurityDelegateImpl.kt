package com.frogobox.research.delegate

import android.util.Log

// Created by KoinWorks (M. Faisal Amir) on 15/06/22.


class SecurityDelegateImpl : SecurityDelegate {

    override fun setupSecurity() {
        Log.d("SecurityDelegateImpl", "setupSecurity")
    }

}