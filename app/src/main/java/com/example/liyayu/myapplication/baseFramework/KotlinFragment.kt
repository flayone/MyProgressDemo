package com.example.liyayu.myapplication.baseFramework

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.liyayu.myapplication.util.LogUtil
import com.example.liyayu.myapplication.util.MyLogger


/**
 * Created by liyayu on 2018/3/20.
 */
@SuppressLint("ValidFragment")
abstract class KotlinFragment : Fragment(), MyLogger {
    lateinit var mRootView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        LogUtil.d("onCreateView:" + toString())
        mRootView = initRootView(inflater)
        mRootView.isClickable = true
        return mRootView
    }

    abstract fun initRootView(inflater: LayoutInflater?): View

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
    }

    abstract fun initView()
}