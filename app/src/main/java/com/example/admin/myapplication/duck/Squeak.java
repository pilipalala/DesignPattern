package com.example.admin.myapplication.duck;

import android.util.Log;

/**
 * @author wangyujie
 *         on 2018/1/23.16:52
 *         TODO
 */

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        Log.e("DUCK", "Squeak!!! ");
    }
}
