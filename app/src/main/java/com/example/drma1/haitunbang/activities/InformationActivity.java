package com.example.drma1.haitunbang.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.drma1.haitunbang.ApplicationHaitunbang;
import com.example.drma1.haitunbang.R;

import static com.example.drma1.haitunbang.Utilities.writeEditTextIntoStorage;

public class InformationActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        setupSpinner(this, R.id.text_information_gender_choices, R.array.text_information_gender_choices);
        setupSpinner(this, R.id.text_information_province_choices, R.array.text_information_province_choices);
        setupSpinner(this, R.id.text_information_social_security_choices, R.array.text_information_social_security_choices);
        setupSpinner(this, R.id.text_information_monthly_income_choices, R.array.text_information_monthly_income_choices);
        setupSpinner(this, R.id.text_information_industry_choices, R.array.text_information_industry_choices);
        setupSpinner(this, R.id.text_information_history_choices, R.array.text_information_history_choices);
        setupSpinner(this, R.id.text_information_family_status_choices, R.array.text_information_family_status_choices);

        final Activity activity = this;
        Button button_next = findViewById(R.id.button_information_next);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (writeEditTextIntoStorage(activity, R.id.text_information_age_edit, "text")) {
                    Intent intent = new Intent(activity, CalculatingActivity.class);
                    startActivity(intent);
                    activity.finish();
                }
            }
        });
    }

    public static void setupSpinner(final Activity activity, final int viewId, int spinArrayOptions) {
        Spinner spinner = activity.findViewById(viewId);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (viewId) {
                    case R.id.text_information_gender_choices: {
                        ApplicationHaitunbang.AppData.gender = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.text_information_province_choices: {
                        ApplicationHaitunbang.AppData.province = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.text_information_social_security_choices: {
                        ApplicationHaitunbang.AppData.socialSecurity = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.text_information_monthly_income_choices: {
                        ApplicationHaitunbang.AppData.monthlyIncome = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.text_information_industry_choices: {
                        ApplicationHaitunbang.AppData.industry = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.text_information_history_choices: {
                        ApplicationHaitunbang.AppData.history = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.text_information_family_status_choices: {
                        ApplicationHaitunbang.AppData.familyStatus = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(activity, spinArrayOptions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
