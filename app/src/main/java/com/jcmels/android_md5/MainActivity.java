package com.jcmels.android_md5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jcmels.md5library.MD5;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MD5 md5=new MD5();
       Log.i("MD5",MD5.MD5("d").toLowerCase());
    }
}
