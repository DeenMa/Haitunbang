package com.example.drma1.haitunbang.views;

import android.app.Activity;
import android.support.v7.widget.AppCompatEditText;

public class LabeledEditText extends AppCompatEditText {
    public String label;
    public LabeledEditText(Activity activity, String label) {
        super(activity);
        this.label = label;
    }
}
