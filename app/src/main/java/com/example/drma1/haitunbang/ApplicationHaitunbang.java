package com.example.drma1.haitunbang;

import android.app.Application;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ApplicationHaitunbang extends Application {
    public static class AppData {
        public static class MarketingAndFundingAnnuallyInfo {
            public static String currentYear;
            public static String marketScale;
            public static String increaseRate;
            public static String registeredUsers;
            public static String marketRate;
            public static String cityTopTier;
            public static String citySecondTier;
            public static String bikePopulationRate;
            public static String registeredFund;
            public static String investedCompanies;
            public static String investedAmount;
            public static String founderStockShare;
            public static String monthlyProfit;
            public static String investedByBAT;
            public static String investedByLargeAgencies;
            public static String investedBySmallAgencies;
            public static String financingRounds;
            public static String financingAmount;
        }

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

        // marketing and funding information
        public static List<MarketingAndFundingAnnuallyInfo> marketingAndFundingAnnuallyInfoList = new ArrayList<>();

        public static void print() {
            System.out.println("companyName: " + companyName);
            System.out.println("companyYear: " + companyYear);
            System.out.println("founderName: " + founderName);
            System.out.println("founderAge: " + founderAge);
            System.out.println("founderDegreeChoices: " + founderDegreeChoices);
            System.out.println("founderSchoolChoices: " + founderSchoolChoices);
            System.out.println("founderEntrepreneurshipTimes: " + founderEntrepreneurshipTimes);
            System.out.println("founderIndustryExperiences: " + founderIndustryExperiences);

            System.out.println("teamSizeInitial: " + teamSizeInitial);
            System.out.println("teamSizeCurrent: " + teamSizeCurrent);
            System.out.println("genderInvestigateMale: " + genderInvestigateMale);
            System.out.println("genderInvestigateFemale: " + genderInvestigateFemale);
            System.out.println("teamRoleProduct: " + teamRoleProduct);
            System.out.println("teamRoleFinance: " + teamRoleFinance);
            System.out.println("teamRoleOperation: " + teamRoleOperation);
            System.out.println("teamRoleMarketing: " + teamRoleMarketing);
            System.out.println("teamRoleTechnology: " + teamRoleTechnology);

            for (int i = 0; i < marketingAndFundingAnnuallyInfoList.size(); i++) {
                System.out.println("currentYear: " + MarketingAndFundingAnnuallyInfo.currentYear);
                System.out.println("marketScale: " + MarketingAndFundingAnnuallyInfo.marketScale);
                System.out.println("increaseRate: " + MarketingAndFundingAnnuallyInfo.increaseRate);
                System.out.println("registeredUsers: " + MarketingAndFundingAnnuallyInfo.registeredUsers);
                System.out.println("marketRate: " + MarketingAndFundingAnnuallyInfo.marketRate);
                System.out.println("cityTopTier: " + MarketingAndFundingAnnuallyInfo.cityTopTier);
                System.out.println("citySecondTier: " + MarketingAndFundingAnnuallyInfo.citySecondTier);
                System.out.println("bikePopulationRate: " + MarketingAndFundingAnnuallyInfo.bikePopulationRate);
                System.out.println("registeredFund: " + MarketingAndFundingAnnuallyInfo.registeredFund);
                System.out.println("investedCompanies: " + MarketingAndFundingAnnuallyInfo.investedCompanies);
                System.out.println("investedAmount: " + MarketingAndFundingAnnuallyInfo.investedAmount);
                System.out.println("founderStockShare: " + MarketingAndFundingAnnuallyInfo.founderStockShare);
                System.out.println("monthlyProfit: " + MarketingAndFundingAnnuallyInfo.monthlyProfit);
                System.out.println("investedByBAT: " + MarketingAndFundingAnnuallyInfo.investedByBAT);
                System.out.println("investedByLargeAgencies: " + MarketingAndFundingAnnuallyInfo.investedByLargeAgencies);
                System.out.println("investedBySmallAgencies: " + MarketingAndFundingAnnuallyInfo.investedBySmallAgencies);
                System.out.println("financingRounds: " + MarketingAndFundingAnnuallyInfo.financingRounds);
                System.out.println("financingAmount: " + MarketingAndFundingAnnuallyInfo.financingAmount);
            }
        }
    }
}