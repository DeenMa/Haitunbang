package com.example.drma1.haitunbang;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Utilities {
    public static boolean writeEditTextIntoStorage(Activity activity, int viewId, String screeningCriteria) {
        EditText editText = activity.findViewById(viewId);
        String string = editText.getText().toString();
        if (isNullOrEmpty(string)) {
            Toast.makeText(activity, "请检查所有必选项是否已经输入", Toast.LENGTH_SHORT).show();
            return false;
        }
        if ("number".equals(screeningCriteria)) {
            for (int i = 0; i < string.length(); i++) {
                char curChar = string.charAt(i);
                if (!(curChar >= '0' && curChar <= '9')) {
                    Toast.makeText(activity, "请填入数字！", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }
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
            case R.id.text_information_cofounder_team_size_initial_edit: {
                ApplicationHaitunbang.AppData.teamSizeInitial = string;
                break;
            }
            case R.id.text_information_cofounder_team_size_current_edit: {
                ApplicationHaitunbang.AppData.teamSizeCurrent = string;
                break;
            }
            case R.id.text_information_cofounder_gender_investigate_male_edit: {
                ApplicationHaitunbang.AppData.genderInvestigateMale = string;
                break;
            }
            case R.id.text_information_cofounder_gender_investigate_female_edit: {
                ApplicationHaitunbang.AppData.genderInvestigateFemale = string;
                break;
            }
        }
        return true;
    }

    public static boolean writeCheckboxIntoStorage(Activity activity, int viewId) {
        View view = activity.findViewById(viewId);
        if (!(view instanceof CheckBox)) {
            Toast.makeText(activity, "当前视图并非Checkbox", Toast.LENGTH_SHORT).show();
            return false;
        }
        CheckBox checkBox = (CheckBox) view;
        switch (viewId) {
            case R.id.checkbox_information_cofounder_team_role_product: {
                if (checkBox.isChecked()) {
                    ApplicationHaitunbang.AppData.teamRoleProduct = "true";
                } else {
                    ApplicationHaitunbang.AppData.teamRoleProduct = "false";
                }
                break;
            }
            case R.id.checkbox_information_cofounder_team_role_finance: {
                if (checkBox.isChecked()) {
                    ApplicationHaitunbang.AppData.teamRoleFinance = "true";
                } else {
                    ApplicationHaitunbang.AppData.teamRoleFinance = "false";
                }
                break;
            }
            case R.id.checkbox_information_cofounder_team_role_operation: {
                if (checkBox.isChecked()) {
                    ApplicationHaitunbang.AppData.teamRoleOperation = "true";
                } else {
                    ApplicationHaitunbang.AppData.teamRoleOperation = "false";
                }
                break;
            }
            case R.id.checkbox_information_cofounder_team_role_marketing: {
                if (checkBox.isChecked()) {
                    ApplicationHaitunbang.AppData.teamRoleMarketing = "true";
                } else {
                    ApplicationHaitunbang.AppData.teamRoleMarketing = "false";
                }
                break;
            }
            case R.id.checkbox_information_cofounder_team_role_technology: {
                if (checkBox.isChecked()) {
                    ApplicationHaitunbang.AppData.teamRoleTechnology = "true";
                } else {
                    ApplicationHaitunbang.AppData.teamRoleTechnology = "false";
                }
                break;
            }
        }
        return true;
    }

    private static boolean isNullOrEmpty(String string) {
        return string == null || string.length() == 0;
    }
}
