package com.example.drma1.haitunbang.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.drma1.haitunbang.R;

import static com.example.drma1.haitunbang.Utilities.writeCheckboxIntoStorage;
import static com.example.drma1.haitunbang.Utilities.writeEditTextIntoStorage;

public class InformationCofounderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_cofounder);

        final Activity activity = this;
        Button buttonNext = findViewById(R.id.button_information_cofounder_next);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (writeEditTextIntoStorage(activity, R.id.text_information_cofounder_team_size_initial_edit, "number")
                    && writeEditTextIntoStorage(activity, R.id.text_information_cofounder_team_size_current_edit, "number")
                    && writeEditTextIntoStorage(activity, R.id.text_information_cofounder_gender_investigate_male_edit, "number")
                    && writeEditTextIntoStorage(activity, R.id.text_information_cofounder_gender_investigate_female_edit, "number")) {
                    writeCheckboxIntoStorage(activity, R.id.checkbox_information_cofounder_team_role_product);
                    writeCheckboxIntoStorage(activity, R.id.checkbox_information_cofounder_team_role_product);
                    writeCheckboxIntoStorage(activity, R.id.checkbox_information_cofounder_team_role_product);
                    writeCheckboxIntoStorage(activity, R.id.checkbox_information_cofounder_team_role_product);
                    writeCheckboxIntoStorage(activity, R.id.checkbox_information_cofounder_team_role_product);

                    Intent intent = new Intent(activity, InformationMarketingAndFundingActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
