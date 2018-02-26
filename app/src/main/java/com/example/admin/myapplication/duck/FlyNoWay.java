package com.example.admin.myapplication.duck;

import android.util.Log;

/**
 * @author wangyujie
 *         on 2018/1/23.16:50
 *         TODO
 */

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        Log.e("DUCK", "can't fly!!! " );
    }
}
