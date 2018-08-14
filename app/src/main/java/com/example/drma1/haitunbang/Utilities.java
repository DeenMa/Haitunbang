package com.example.drma1.haitunbang;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Utilities {
    public static final Integer DELAY_ACTIVITY = 3000;

    public static boolean writeEditTextIntoStorage(Activity activity, int viewId, String screeningCriteria) {
        EditText editText = activity.findViewById(viewId);
        String string = editText.getText().toString();
        if (isNullOrEmpty(string)) {
            Toast.makeText(activity, "请检查所有必选项是否已经输入", Toast.LENGTH_SHORT).show();
            return false;
        }
        if ("number".equals(screeningCriteria)) {
            if (!checkNumeric(string)) {
                Toast.makeText(activity, "请填入数字！", Toast.LENGTH_SHORT).show();
                return false;
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
            case R.id.text_information_uniqueness_patents_and_logo_registration_edit: {
                ApplicationHaitunbang.AppData.patentsAndLogoRegistration = string;
                break;
            }
        }
        return true;
    }


    public static boolean checkLabeledEditText(Activity activity, String string, String screeningCriteria) {
        if (isNullOrEmpty(string)) {
            Toast.makeText(activity, "请检查所有必选项是否已经输入", Toast.LENGTH_SHORT).show();
            return false;
        }

        switch (screeningCriteria) {
            case ("number"): {
                if (!checkNumeric(string)) {
                    Toast.makeText(activity, "请填入数字！", Toast.LENGTH_SHORT).show();
                    return false;
                }
                break;
            }
            // allow number, and also allow a dot and some numbers behind
            case ("decimals"): {
                if (!checkDecimals(string)) {
                    Toast.makeText(activity, "请填入实数！", Toast.LENGTH_SHORT).show();
                    return false;
                }
                break;
            }
            case ("percentage") : {
                if (!checkPercentage(string)) {
                    Toast.makeText(activity, "请填入百分比！", Toast.LENGTH_SHORT).show();
                    return false;
                }
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
                ApplicationHaitunbang.AppData.teamRoleProduct = checkBox.isChecked() ? "true" : "false";
                break;
            }
            case R.id.checkbox_information_cofounder_team_role_finance: {
                ApplicationHaitunbang.AppData.teamRoleFinance = checkBox.isChecked() ? "true" : "false";
                break;
            }
            case R.id.checkbox_information_cofounder_team_role_operation: {
                ApplicationHaitunbang.AppData.teamRoleOperation = checkBox.isChecked() ? "true" : "false";
                break;
            }
            case R.id.checkbox_information_cofounder_team_role_marketing: {
                ApplicationHaitunbang.AppData.teamRoleMarketing = checkBox.isChecked() ? "true" : "false";
                break;
            }
            case R.id.checkbox_information_cofounder_team_role_technology: {
                ApplicationHaitunbang.AppData.teamRoleTechnology = checkBox.isChecked() ? "true" : "false";
                break;
            }
            case R.id.checkbox_information_uniqueness_technology_innovation: {
                ApplicationHaitunbang.AppData.technologyInnovation = checkBox.isChecked() ? "true" : "false";
                break;
            }
            case R.id.checkbox_information_uniqueness_business_mode_innovation: {
                ApplicationHaitunbang.AppData.businessModeInnovation = checkBox.isChecked() ? "true" : "false";
                break;
            }
            case R.id.checkbox_information_uniqueness_marketing_recognition: {
                ApplicationHaitunbang.AppData.marketingRecognition = checkBox.isChecked() ? "true" : "false";
                break;
            }
            case R.id.checkbox_information_uniqueness_government_support: {
                ApplicationHaitunbang.AppData.governmentSupport = checkBox.isChecked() ? "true" : "false";
                break;
            }
            case R.id.checkbox_information_uniqueness_community_campus_support: {
                ApplicationHaitunbang.AppData.communityCampusSupport = checkBox.isChecked() ? "true" : "false";
                break;
            }
        }
        return true;
    }

    private static boolean checkPercentage(String input) {
        if (input.charAt(input.length() - 1) == '%') {
            return input.length() != 1 && checkDecimals(input.substring(0, input.length() - 1));
        }
        return checkDecimals(input);
    }

    private static boolean checkDecimals(String input) {
        int dotPosition = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                dotPosition = i;
                break;
            }
        }
        // dotPosition cannot be at the last index
        if (dotPosition == input.length() - 1) {
            return false;
        }
        // if there is no dot, make sure whole string is a number
        if (dotPosition == -1) {
            if (!checkNumeric(input)) {
                return false;
            }
            return true;
        }
        // if there is a dot, make sure the front and back part are all numbers
        if (!checkNumeric(input.substring(0, dotPosition)) || checkNumeric(input.substring(dotPosition + 1))) {
            return false;
        }
        return true;
    }

    private static boolean checkNumeric(String input) {
        for (int i = 0; i < input.length(); i++) {
            char curChar = input.charAt(i);
            if (!(curChar >= '0' && curChar <= '9')) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNullOrEmpty(String string) {
        return string == null || string.length() == 0;
    }
}
