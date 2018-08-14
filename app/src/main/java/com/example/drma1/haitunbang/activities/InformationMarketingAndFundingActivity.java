package com.example.drma1.haitunbang.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.MarketingAndFundingAnnuallyInfo;
import com.example.drma1.haitunbang.R;
import com.example.drma1.haitunbang.views.LabeledCheckBox;
import com.example.drma1.haitunbang.views.LabeledEditText;

import java.util.ArrayList;

import static com.example.drma1.haitunbang.ApplicationHaitunbang.AppData.marketingAndFundingAnnuallyInfoList;
import static com.example.drma1.haitunbang.Utilities.checkLabeledEditText;

public class InformationMarketingAndFundingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (marketingAndFundingAnnuallyInfoList == null) {
            marketingAndFundingAnnuallyInfoList = new ArrayList<>();
        }
        marketingAndFundingAnnuallyInfoList.clear();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_marketing_and_funding);

        final LinearLayout layoutsCofounder = findViewById(R.id.linear_layout_information_marketing_and_funding);
        Button buttonAdd = findViewById(R.id.button_information_marketing_and_funding_add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addAnnualInformationMarketingAndFundingLayout(layoutsCofounder);
            }
        });

        final Activity activity = this;
        Button buttonNext = findViewById(R.id.button_information_marketing_and_funding_next);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean writeSucceed = true;
                for (int i = 0; i < layoutsCofounder.getChildCount(); i++) {
                    View view1 = layoutsCofounder.getChildAt(i);
                    if (view1 instanceof LinearLayout) {
                        LinearLayout linearLayout = (LinearLayout) view1;
                        MarketingAndFundingAnnuallyInfo marketingAndFundingAnnuallyInfo = new MarketingAndFundingAnnuallyInfo();
                        // get all the data inside this layout (all the elements inside a specific year)
                        for (int j = 0; j < linearLayout.getChildCount(); j++) {
                            View view2 = linearLayout.getChildAt(j);
                            if (view2 instanceof LabeledEditText) {
                                String string = ((LabeledEditText) view2).getText().toString();
                                switch (((LabeledEditText) view2).label) {
                                    case ("CurrentYear"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "number")) {
                                            marketingAndFundingAnnuallyInfo.currentYear = string;
                                        }
                                        break;
                                    }
                                    case ("MarketScale"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "decimals")) {
                                            marketingAndFundingAnnuallyInfo.marketScale = string;
                                        }
                                        break;
                                    }
                                    case ("IncreaseRate"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "percentage")) {
                                            marketingAndFundingAnnuallyInfo.increaseRate = string;
                                        }
                                        break;
                                    }
                                    case ("RegisteredUsers"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "decimals")) {
                                            marketingAndFundingAnnuallyInfo.registeredUsers = string;
                                        }
                                        break;
                                    }
                                    case ("MarketRate"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "percentage")) {
                                            marketingAndFundingAnnuallyInfo.marketRate = string;
                                        }
                                        break;
                                    }
                                    case ("BikePopulationRate"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "percentage")) {
                                            marketingAndFundingAnnuallyInfo.bikePopulationRate = string;
                                        }
                                        break;
                                    }
                                    case ("RegisteredFund"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "decimals")) {
                                            marketingAndFundingAnnuallyInfo.registeredFund = string;
                                        }
                                        break;
                                    }
                                    case ("InvestedCompanies"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "number")) {
                                            marketingAndFundingAnnuallyInfo.investedCompanies = string;
                                        }
                                        break;
                                    }
                                    case ("InvestedAmount"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "decimals")) {
                                            marketingAndFundingAnnuallyInfo.investedAmount = string;
                                        }
                                        break;
                                    }
                                    case ("FounderStockShare"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "percentage")) {
                                            marketingAndFundingAnnuallyInfo.founderStockShare = string;
                                        }
                                        break;
                                    }
                                    case ("MonthlyProfit"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "decimals")) {
                                            marketingAndFundingAnnuallyInfo.monthlyProfit = string;
                                        }
                                        break;
                                    }
                                    case ("FinancingRounds"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "number")) {
                                            marketingAndFundingAnnuallyInfo.financingRounds = string;
                                        }
                                        break;
                                    }
                                    case ("FinancingAmount"): {
                                        if (writeSucceed = writeSucceed && checkLabeledEditText(activity, string, "decimals")) {
                                            marketingAndFundingAnnuallyInfo.financingAmount = string;
                                        }
                                        break;
                                    }
                                }
                            }
                            if (view2 instanceof LabeledCheckBox) {
                                boolean isChecked = ((LabeledCheckBox) view2).isChecked();
                                switch (((LabeledCheckBox) view2).label) {
                                    case ("CityTopTier"): {
                                        marketingAndFundingAnnuallyInfo.cityTopTier = isChecked ? "true" : "false";
                                        break;
                                    }
                                    case ("CitySecondTier"): {
                                        marketingAndFundingAnnuallyInfo.citySecondTier = isChecked ? "true" : "false";
                                        break;
                                    }
                                    case ("InvestedByBAT"): {
                                        marketingAndFundingAnnuallyInfo.investedByBAT = isChecked ? "true" : "false";
                                        break;
                                    }
                                    case ("InvestedByLargeAgencies"): {
                                        marketingAndFundingAnnuallyInfo.investedByLargeAgencies = isChecked ? "true" : "false";
                                        break;
                                    }
                                    case ("InvestedBySmallAgencies"): {
                                        marketingAndFundingAnnuallyInfo.investedBySmallAgencies = isChecked ? "true" : "false";
                                        break;
                                    }
                                }
                            }
                        }
                        if (!writeSucceed) {
                            break;
                        }
                        marketingAndFundingAnnuallyInfoList.add(marketingAndFundingAnnuallyInfo);
                    }
                }
                if (writeSucceed) {
                    Intent intent = new Intent(activity, InformationUniquenessActivity.class);
                    startActivity(intent);
                    activity.finish();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        if (marketingAndFundingAnnuallyInfoList == null) {
            marketingAndFundingAnnuallyInfoList = new ArrayList<>();
        }
        marketingAndFundingAnnuallyInfoList.clear();
        super.onStart();
    }

    @Override
    protected void onRestart() {
        if (marketingAndFundingAnnuallyInfoList == null) {
            marketingAndFundingAnnuallyInfoList = new ArrayList<>();
        }
        marketingAndFundingAnnuallyInfoList.clear();
        super.onRestart();
    }

    private void addAnnualInformationMarketingAndFundingLayout(LinearLayout parent) {
        LinearLayout child = new LinearLayout(this);
        child.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        Button buttonDelete = new Button(this);
        buttonDelete.setLayoutParams(layoutParams);
        buttonDelete.setText(R.string.button_delete);
        final LinearLayout finalParent = parent;
        final LinearLayout finalChild = child;
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalParent.removeView(finalChild);
                // TODO: not only need to delete the view, but also need to delete the data stored in AppData;
            }
        });

        LabeledEditText labeledEditTextCurrentYear = new LabeledEditText(this, "CurrentYear");
        labeledEditTextCurrentYear.setHint(R.string.text_information_marketing_and_funding_current_year);

        LabeledEditText labeledEditTextMarketScale = new LabeledEditText(this, "MarketScale");
        labeledEditTextMarketScale.setHint(R.string.text_information_marketing_and_funding_market_scale_hint);

        LabeledEditText labeledEditTextIncreaseRate = new LabeledEditText(this, "IncreaseRate");
        labeledEditTextIncreaseRate.setHint(R.string.text_information_marketing_and_funding_increase_rate_hint);

        LabeledEditText labeledEditTextRegisteredUsers = new LabeledEditText(this, "RegisteredUsers");
        labeledEditTextRegisteredUsers.setHint(R.string.text_information_marketing_and_funding_registered_users_hint);

        LabeledEditText labeledEditTextMarketRate = new LabeledEditText(this, "MarketRate");
        labeledEditTextMarketRate.setHint(R.string.text_information_marketing_and_funding_market_rate_hint);

        LabeledCheckBox labeledCheckBoxCityTopTier = new LabeledCheckBox(this, "CityTopTier");
        labeledCheckBoxCityTopTier.setText(R.string.text_information_marketing_and_funding_city_top_tier);

        LabeledCheckBox checkBoxCitySecondTier = new LabeledCheckBox(this, "CitySecondTier");
        checkBoxCitySecondTier.setText(R.string.text_information_marketing_and_funding_city_second_tier);

        LabeledEditText labeledEditTextBikePopulationRate = new LabeledEditText(this, "BikePopulationRate");
        labeledEditTextBikePopulationRate.setHint(R.string.text_information_marketing_and_funding_bike_population_rate_hint);

        LabeledEditText labeledEditTextRegisteredFund = new LabeledEditText(this, "RegisteredFund");
        labeledEditTextRegisteredFund.setHint(R.string.text_information_marketing_and_funding_registered_fund);

        LabeledEditText labeledEditTextInvestedCompanies = new LabeledEditText(this, "InvestedCompanies");
        labeledEditTextInvestedCompanies.setHint(R.string.text_information_marketing_and_funding_invested_companies);

        LabeledEditText labeledEditTextInvestedAmount = new LabeledEditText(this, "InvestedAmount");
        labeledEditTextInvestedAmount.setHint(R.string.text_information_marketing_and_funding_invested_amount);

        LabeledEditText labeledEditTextFounderStockShare = new LabeledEditText(this, "FounderStockShare");
        labeledEditTextFounderStockShare.setHint(R.string.text_information_marketing_and_funding_founder_stock_share);

        LabeledEditText labeledEditTextMonthlyProfit = new LabeledEditText(this, "MonthlyProfit");
        labeledEditTextMonthlyProfit.setHint(R.string.text_information_marketing_and_funding_monthly_profit);

        LabeledCheckBox labeledCheckBoxInvestedByBAT = new LabeledCheckBox(this, "InvestedByBAT");
        labeledCheckBoxInvestedByBAT.setText(R.string.text_information_marketing_and_funding_invested_by_bat);

        LabeledCheckBox labeledCheckBoxInvestedByLargeAgencies = new LabeledCheckBox(this, "InvestedByLargeAgencies");
        labeledCheckBoxInvestedByLargeAgencies.setText(R.string.text_information_marketing_and_funding_invested_by_large_agencies);

        LabeledCheckBox labeledCheckBoxInvestedBySmallAgencies = new LabeledCheckBox(this, "InvestedBySmallAgencies");
        labeledCheckBoxInvestedBySmallAgencies.setText(R.string.text_information_marketing_and_funding_invested_by_small_agencies);

        LabeledEditText labeledEditTextFinancingRounds = new LabeledEditText(this, "FinancingRounds");
        labeledEditTextFinancingRounds.setHint(R.string.text_information_marketing_and_funding_financing_rounds);

        LabeledEditText labeledEditTextFinancingAmount = new LabeledEditText(this, "FinancingAmount");
        labeledEditTextFinancingAmount.setHint(R.string.text_information_marketing_and_funding_financing_amount);

        child.addView(buttonDelete);
        child.addView(labeledEditTextCurrentYear);
        child.addView(labeledEditTextMarketScale);
        child.addView(labeledEditTextIncreaseRate);
        child.addView(labeledEditTextRegisteredUsers);
        child.addView(labeledEditTextMarketRate);
        child.addView(labeledCheckBoxCityTopTier);
        child.addView(checkBoxCitySecondTier);
        child.addView(labeledEditTextBikePopulationRate);
        child.addView(labeledEditTextRegisteredFund);
        child.addView(labeledEditTextInvestedCompanies);
        child.addView(labeledEditTextInvestedAmount);
        child.addView(labeledEditTextFounderStockShare);
        child.addView(labeledEditTextMonthlyProfit);
        child.addView(labeledCheckBoxInvestedByBAT);
        child.addView(labeledCheckBoxInvestedByLargeAgencies);
        child.addView(labeledCheckBoxInvestedBySmallAgencies);
        child.addView(labeledEditTextFinancingRounds);
        child.addView(labeledEditTextFinancingAmount);

        parent.addView(child);
    }
}
