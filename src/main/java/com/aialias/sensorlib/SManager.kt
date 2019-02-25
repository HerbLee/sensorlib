/**
 * Company aialias
 * Copyright (C) 2017-2019 All Rights Reserved.
 */
package com.aialias.sensorlib

import android.app.Application
import android.content.Context

/**
 * @author HerbLee
 * @date Created on 2019/2/25 23:48
 * @function:
 */

// sersorlib 全局控制类
class SManager private constructor(){
    //全局上下文
    var mContext: Context? = null
    //全局application
    var application: Application? = null

    companion object {
        val instance: SManager by lazy { SManager() }
    }

    //初始化context 和application 在其他的application里边初始化.
    fun init(context: Context, application: Application) {
        mContext = context
        this.application = application
    }


}