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

public class InformationBasicActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_basic);

        setupSpinner(this, R.id.text_information_basic_founder_degree_choices, R.array.text_information_basic_founder_degree_choices);
        setupSpinner(this, R.id.text_information_basic_founder_school_choices, R.array.text_information_basic_founder_school_choices);

        final Activity activity = this;
        Button button_next = findViewById(R.id.button_information_basic_next);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (writeEditTextIntoStorage(activity, R.id.text_information_basic_company_name_edit, "text")
                        && writeEditTextIntoStorage(activity, R.id.text_information_basic_company_year_edit, "number")
                        && writeEditTextIntoStorage(activity, R.id.text_information_basic_founder_name_edit, "text")
                        && writeEditTextIntoStorage(activity, R.id.text_information_basic_founder_age_edit, "number")
                        && writeEditTextIntoStorage(activity, R.id.text_information_basic_founder_entrepreneurship_times_edit, "number")
                        && writeEditTextIntoStorage(activity, R.id.text_information_basic_founder_industry_experiences_edit, "number")) {
                    Intent intent = new Intent(activity, InformationCofounderActivity.class);
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
                    case R.id.text_information_basic_founder_degree_choices: {
                        ApplicationHaitunbang.AppData.founderDegreeChoices = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.text_information_basic_founder_school_choices: {
                        ApplicationHaitunbang.AppData.founderSchoolChoices = parent.getItemAtPosition(position).toString();
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
