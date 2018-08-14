package com.example.drma1.haitunbang.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.drma1.haitunbang.R;

import static com.example.drma1.haitunbang.Utilities.writeCheckboxIntoStorage;
import static com.example.drma1.haitunbang.Utilities.writeEditTextIntoStorage;

public class InformationUniquenessActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_uniqueness);

        final Activity activity = this;
        Button buttonNext = findViewById(R.id.button_information_uniqueness_next);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (writeEditTextIntoStorage(activity, R.id.text_information_uniqueness_patents_and_logo_registration_edit, "number")) {
                    writeCheckboxIntoStorage(activity, R.id.checkbox_information_uniqueness_technology_innovation);
                    writeCheckboxIntoStorage(activity, R.id.checkbox_information_uniqueness_business_mode_innovation);
                    writeCheckboxIntoStorage(activity, R.id.checkbox_information_uniqueness_marketing_recognition);
                    writeCheckboxIntoStorage(activity, R.id.checkbox_information_uniqueness_government_support);
                    writeCheckboxIntoStorage(activity, R.id.checkbox_information_uniqueness_community_campus_support);

                    Intent intent = new Intent(activity, CalculatingActivity.class);
                    startActivity(intent);
                    activity.finish();
                }
            }
        });
    }
}
