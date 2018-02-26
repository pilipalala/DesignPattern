package com.example.admin.myapplication.duck;

import android.util.Log;

/**
 * @author wangyujie
 *         on 2018/1/23.17:14
 *         TODO
 */

public class FlyRocketBehavior implements FlyBehavior {
    @Override
    public void fly() {
        Log.e("DUCK", "FlyRocketBehavior!!! " );
    }
}
