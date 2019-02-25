/**
 * Company aialias
 * Copyright (C) 2017-2019 All Rights Reserved.
 */
package com.aialias.sensorlib.sensor

import android.content.Context.SENSOR_SERVICE
import android.hardware.Sensor
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import com.aialias.sensorlib.SManager

/**
 * @author HerbLee
 * @date Created on 2019/2/26 0:05
 * @function: 光照传感器
 */
class LightSensor {
    // 全局对象
    private var mySm: SensorManager? = null
    private var myS: Sensor? = null
    init {
        mySm = SManager.instance.mContext?.getSystemService(SENSOR_SERVICE) as SensorManager
        myS = mySm?.getDefaultSensor(Sensor.TYPE_LIGHT)
    }

    /**
     * 注册监听光照变化
     * @mySel SensorEventListener 监听接口
     */
    fun registListener(mySel:SensorEventListener){
        mySm?.registerListener(mySel,myS,SensorManager.SENSOR_DELAY_NORMAL)
    }

    /**
     * 取消光照注册,这里传递接口必须和注册时一样
     * @mySel SensorEventListener 监听接口
     */
    fun unregistListener(mySel:SensorEventListener){
        mySm?.unregisterListener(mySel)
    }


}