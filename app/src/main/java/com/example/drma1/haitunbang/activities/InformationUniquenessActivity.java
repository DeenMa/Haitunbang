package com.example.drma1.haitunbang.activities;

import android.app.Activity;
import android.os.Bundle;

import com.example.drma1.haitunbang.ApplicationHaitunbang;
import com.example.drma1.haitunbang.R;

public class InformationUniquenessActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uniqueness);
        ApplicationHaitunbang.AppData.print();
    }
}
