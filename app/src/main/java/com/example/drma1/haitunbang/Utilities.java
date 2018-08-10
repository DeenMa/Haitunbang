package com.example.drma1.haitunbang;

import android.app.Activity;
import android.widget.EditText;
import android.widget.Toast;

public class Utilities {
    public static boolean writeEditTextIntoStorage(Activity activity, int viewId) {
        EditText editText = activity.findViewById(viewId);
        String string = editText.getText().toString();
        if (isNullOrEmpty(string)) {
            Toast.makeText(activity, "请检查所有必选项是否已经输入", Toast.LENGTH_SHORT).show();
            return false;
        }
        switch (viewId) {
            case R.id.text_information_basic_company_name_edit: {
                ApplicationHaitunbang.AppData.companyName = string;
                break;
            }
            case R.id.text_information_basic_company_year_edit: {
                ApplicationHaitunbang.AppData.companyYear = string;
                break;
            }
            case R.id.text_information_basic_founder_name_edit: {
                ApplicationHaitunbang.AppData.founderName = string;
                break;
            }
            case R.id.text_information_basic_founder_age_edit: {
                ApplicationHaitunbang.AppData.founderAge = string;
                break;
            }
            case R.id.text_information_basic_founder_entrepreneurship_times_edit: {
                ApplicationHaitunbang.AppData.founderEntrepreneurshipTimes = string;
                break;
            }
            case R.id.text_information_basic_founder_industry_experiences_edit: {
                ApplicationHaitunbang.AppData.founderIndustryExperiences = string;
                break;
            }
        }
        return true;
}

    private static boolean isNullOrEmpty(String string) {
        return string == null || string.length() == 0;
    }
}
