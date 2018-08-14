package com.example.drma1.haitunbang.views;

import android.app.Activity;
import android.support.v7.widget.AppCompatCheckBox;

public class LabeledCheckBox extends AppCompatCheckBox {
    public String label;
    public LabeledCheckBox(Activity activity, String label) {
        super(activity);
        this.label = label;
    }
}
