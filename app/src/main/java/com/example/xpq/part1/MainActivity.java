package com.example.xpq.part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  java.util.Locale;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String lan = Locale.getDefault().getLanguage();
//获取区域
        String country = Locale.getDefault().getCountry();
//设置成简体中文的时候，getLanguage()返回的是zh,getCountry()返回的是cn.
    }

}
