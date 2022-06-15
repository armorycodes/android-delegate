package com.frogobox.research.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.frogobox.research.delegate.ChainViewDelegate
import com.frogobox.research.delegate.ChainViewDelegateImpl
import com.frogobox.research.delegate.SecurityDelegate
import com.frogobox.research.delegate.SecurityDelegateImpl

// Created by KoinWorks (M. Faisal Amir) on 15/06/22.


abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity(),
    SecurityDelegate by SecurityDelegateImpl(),
    ChainViewDelegate by ChainViewDelegateImpl() {

    protected val binding: VB by lazy {
        setupViewBinding()
    }

    abstract fun setupViewBinding(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}