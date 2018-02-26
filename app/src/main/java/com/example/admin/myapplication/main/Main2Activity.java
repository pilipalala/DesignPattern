package com.example.admin.myapplication.main;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.myapplication.R;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /*asset raw 文件操作*/
        try {
            InputStream open = getResources().getAssets().open("");
            InputStream inputStream = getResources().openRawResource(R.raw.text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*数据区   操作*/
        try {
            /*写操作*/
            FileOutputStream outputStream = openFileOutput("sasa", MODE_PRIVATE);
            /*读操作*/
            FileInputStream inputStream = openFileInput("sasa");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /*SD卡 操作*/


        /*检查内存状态（是否安装sd卡）*/
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {

        }




        try {
            /*写操作*/
            FileOutputStream outputStream = new FileOutputStream("");
            /*读操作*/
            FileInputStream inputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
