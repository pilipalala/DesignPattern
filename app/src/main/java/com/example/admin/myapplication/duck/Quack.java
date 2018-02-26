package com.example.admin.myapplication.duck;

import android.util.Log;

/**
 * @author wangyujie
 *         on 2018/1/23.16:51
 *         TODO
 */

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        Log.e("DUCK", "Quack!!! " );
    }
}
