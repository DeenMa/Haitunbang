package com.example.drma1.haitunbang;

import android.app.Application;

import java.lang.reflect.Field;

public class ApplicationHaitunbang extends Application {
    public static class AppData {
        // basic information
        public static String companyName;
        public static String companyYear;
        public static String founderName;
        public static String founderAge;
        public static String founderDegreeChoices;
        public static String founderSchoolChoices;
        public static String founderEntrepreneurshipTimes;
        public static String founderIndustryExperiences;

        // cofounder information
        public static String teamSizeInitial;
        public static String teamSizeCurrent;
        public static String genderInvestigateMale;
        public static String genderInvestigateFemale;
        public static String teamRoleProduct;
        public static String teamRoleFinance;
        public static String teamRoleOperation;
        public static String teamRoleMarketing;
        public static String teamRoleTechnology;
    }
}
