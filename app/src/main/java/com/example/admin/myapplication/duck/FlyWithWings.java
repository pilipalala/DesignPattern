package com.example.admin.myapplication.duck;

import android.util.Log;

/**
 * @author wangyujie
 *         on 2018/1/23.16:49
 *         TODO 会飞的鸭子
 */

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        Log.e("DUCK", "flying!!! " );
    }
}
