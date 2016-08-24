package com.example.pravi.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Pravi on 8/13/2016.
 */
public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = getIntent();
     int a=   i.getIntExtra("pos",0);

        switch (a)
        {
            case 0:
                setContentView(R.layout.activity_change_email);
                break;

            case 1:
                setContentView(R.layout.activity_change_password);
                break;

            case  2:
                setContentView(R.layout.activity_change_phone);
                break;
            case  3:
                setContentView(R.layout.activity_profile_edit);
                break;
            case 4:
                setContentView(R.layout.activity_forgot_password);
                break;
            case 5:
                setContentView(R.layout.activity_login_linear);
                break;
            case 6:
                setContentView(R.layout.activity_otp);
                break;
            case 7:
                setContentView(R.layout.activity_profile);
                break;

            case 8:
                setContentView(R.layout.activity_registration_edittext_only);
                break;



        }

    }
}

