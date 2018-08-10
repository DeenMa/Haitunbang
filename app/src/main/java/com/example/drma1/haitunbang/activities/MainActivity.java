package com.example.drma1.haitunbang.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.drma1.haitunbang.Constants;
import com.example.drma1.haitunbang.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        proceedToInformationBasicActivity();
    }

    private void proceedToInformationBasicActivity() {
        Handler handler = new Handler();
        final Activity ctx = this;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ctx, InformationBasicActivity.class);
                startActivity(intent);
                ctx.finish();
            }
        }, Constants.DELAY_ACTIVITY);
    }
}
