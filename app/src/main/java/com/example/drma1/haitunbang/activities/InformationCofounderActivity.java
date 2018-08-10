package com.example.drma1.haitunbang.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.drma1.haitunbang.ApplicationHaitunbang;
import com.example.drma1.haitunbang.R;

public class InformationCofounderActivity extends Activity {
    private final String TAG = this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_cofounder);

        Log.d(TAG, ApplicationHaitunbang.AppData.companyName);
        Log.d(TAG, ApplicationHaitunbang.AppData.companyYear);
        Log.d(TAG, ApplicationHaitunbang.AppData.founderName);
        Log.d(TAG, ApplicationHaitunbang.AppData.founderAge);
        Log.d(TAG, ApplicationHaitunbang.AppData.founderDegreeChoices);
        Log.d(TAG, ApplicationHaitunbang.AppData.founderSchoolChoices);
        Log.d(TAG, ApplicationHaitunbang.AppData.founderEntrepreneurshipTimes);
        Log.d(TAG, ApplicationHaitunbang.AppData.founderIndustryExperiences);
    }
}
