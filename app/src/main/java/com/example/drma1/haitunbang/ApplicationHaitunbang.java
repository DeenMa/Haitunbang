package com.example.drma1.haitunbang;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.businessModeInnovation;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.communityCampusSupport;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.companyName;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.companyYear;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.founderAge;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.founderDegreeChoices;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.founderEntrepreneurshipTimes;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.founderIndustryExperiences;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.founderName;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.founderSchoolChoices;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.genderInvestigateFemale;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.genderInvestigateMale;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.governmentSupport;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.marketingAndFundingAnnuallyInfoList;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.marketingRecognition;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.patentsAndLogoRegistration;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.teamRoleFinance;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.teamRoleMarketing;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.teamRoleOperation;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.teamRoleProduct;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.teamRoleTechnology;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.teamSizeCurrent;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.teamSizeInitial;
import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.technologyInnovation;

public class ApplicationHaitunbang extends Application {
    public static class AppData {
        public static class MarketingAndFundingAnnuallyInfo {
            public String currentYear;
            public String marketScale;
            public String increaseRate;
            public String registeredUsers;
            public String marketRate;
            public String cityTopTier;
            public String citySecondTier;
            public String bikePopulationRate;
            public String registeredFund;
            public String investedCompanies;
            public String investedAmount;
            public String founderStockShare;
            public String monthlyProfit;
            public String investedByBAT;
            public String investedByLargeAgencies;
            public String investedBySmallAgencies;
            public String financingRounds;
            public String financingAmount;
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

        public static String technologyInnovation;
        public static String patentsAndLogoRegistration;
        public static String businessModeInnovation;
        public static String marketingRecognition;
        public static String governmentSupport;
        public static String communityCampusSupport;
    }

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
            System.out.println("currentYear: " + marketingAndFundingAnnuallyInfoList.get(i).currentYear);
            System.out.println("marketScale: " + marketingAndFundingAnnuallyInfoList.get(i).marketScale);
            System.out.println("increaseRate: " + marketingAndFundingAnnuallyInfoList.get(i).increaseRate);
            System.out.println("registeredUsers: " + marketingAndFundingAnnuallyInfoList.get(i).registeredUsers);
            System.out.println("marketRate: " + marketingAndFundingAnnuallyInfoList.get(i).marketRate);
            System.out.println("cityTopTier: " + marketingAndFundingAnnuallyInfoList.get(i).cityTopTier);
            System.out.println("citySecondTier: " + marketingAndFundingAnnuallyInfoList.get(i).citySecondTier);
            System.out.println("bikePopulationRate: " + marketingAndFundingAnnuallyInfoList.get(i).bikePopulationRate);
            System.out.println("registeredFund: " + marketingAndFundingAnnuallyInfoList.get(i).registeredFund);
            System.out.println("investedCompanies: " + marketingAndFundingAnnuallyInfoList.get(i).investedCompanies);
            System.out.println("investedAmount: " + marketingAndFundingAnnuallyInfoList.get(i).investedAmount);
            System.out.println("founderStockShare: " + marketingAndFundingAnnuallyInfoList.get(i).founderStockShare);
            System.out.println("monthlyProfit: " + marketingAndFundingAnnuallyInfoList.get(i).monthlyProfit);
            System.out.println("investedByBAT: " + marketingAndFundingAnnuallyInfoList.get(i).investedByBAT);
            System.out.println("investedByLargeAgencies: " + marketingAndFundingAnnuallyInfoList.get(i).investedByLargeAgencies);
            System.out.println("investedBySmallAgencies: " + marketingAndFundingAnnuallyInfoList.get(i).investedBySmallAgencies);
            System.out.println("financingRounds: " + marketingAndFundingAnnuallyInfoList.get(i).financingRounds);
            System.out.println("financingAmount: " + marketingAndFundingAnnuallyInfoList.get(i).financingAmount);
        }

        System.out.println("technologyInnovation: " + technologyInnovation);
        System.out.println("patentsAndLogoRegistration: " + patentsAndLogoRegistration);
        System.out.println("businessModeInnovation: " + businessModeInnovation);
        System.out.println("marketingRecognition: " + marketingRecognition);
        System.out.println("governmentSupport: " + governmentSupport);
        System.out.println("communityCampusSupport: " + communityCampusSupport);
    }
}