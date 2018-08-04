package com.joonheelee.smartumbrellaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

    }

    public void dry(View v){
        Intent intent=new Intent(SettingActivity.this,DryActivity.class);
        startActivity(intent);
    }

    public void alarm(View v){
        Intent intent=new Intent(SettingActivity.this,AlarmActivity.class);
        startActivity(intent);
    }

    public void dust(View v){
        Intent intent=new Intent(SettingActivity.this,DustActivity.class);
        startActivity(intent);
    }

    public void degree(View v){
        Intent intent=new Intent(SettingActivity.this,DegreeActivity.class);
        startActivity(intent);
    }

    public void back(View v){
        Intent intent=new Intent(SettingActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
