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

public class InformationActivityII extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationii);

        setupSpinner(this, R.id.spinner_informationii_smoking_choices, R.array.text_informationii_smoking_choices);
        setupSpinner(this, R.id.spinner_informationii_accident_illness_choices, R.array.text_informationii_accident_illness_choices);
        setupSpinner(this, R.id.spinner_informationii_medical_treatment_choices, R.array.text_informationii_accident_illness_choices);
        setupSpinner(this, R.id.spinner_informationii_surgery_choices, R.array.text_informationii_surgery_choices);
        setupSpinner(this, R.id.spinner_informationii_pregnancy_choices, R.array.text_informationii_pregnancy_choices);
        setupSpinner(this, R.id.spinner_informationii_blood_illness_choices, R.array.text_informationii_blood_illness_choices);
        setupSpinner(this, R.id.spinner_informationii_muscle_illness_choices, R.array.text_informationii_muscle_illness_choices);
        setupSpinner(this, R.id.spinner_informationii_neural_illness_choices, R.array.text_informationii_neural_illness_choices);
        setupSpinner(this, R.id.spinner_informationii_circle_illness_choices, R.array.text_informationii_circle_illness_choices);

        final Activity activity = this;
        Button button_next = findViewById(R.id.button_informationii_next);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, CalculatingActivity.class);
                startActivity(intent);
                activity.finish();
            }
        });
    }

    public static void setupSpinner(final Activity activity, final int viewId, int spinArrayOptions) {
        Spinner spinner = activity.findViewById(viewId);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (viewId) {
                    case R.id.spinner_informationii_smoking_choices: {
                        ApplicationHaitunbang.AppData.smoking = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.spinner_informationii_accident_illness_choices: {
                        ApplicationHaitunbang.AppData.accidentIllness = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.spinner_informationii_medical_treatment_choices: {
                        ApplicationHaitunbang.AppData.medicalTreatement = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.spinner_informationii_surgery_choices: {
                        ApplicationHaitunbang.AppData.surgery = parent.getItemAtPosition(position).toString();
                        break;
                    }

                    case R.id.spinner_informationii_pregnancy_choices: {
                        ApplicationHaitunbang.AppData.pregnancy = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.spinner_informationii_blood_illness_choices: {
                        ApplicationHaitunbang.AppData.bloodIllness = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.spinner_informationii_muscle_illness_choices: {
                        ApplicationHaitunbang.AppData.muscleIllness = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.spinner_informationii_neural_illness_choices: {
                        ApplicationHaitunbang.AppData.neuralIllness = parent.getItemAtPosition(position).toString();
                        break;
                    }
                    case R.id.spinner_informationii_circle_illness_choices: {
                        ApplicationHaitunbang.AppData.circleIllness = parent.getItemAtPosition(position).toString();
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
    }}
