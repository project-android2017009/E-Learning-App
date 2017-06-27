package com.software_solutions.optimus_tech_project201709;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Spinner;

public class LoginActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_actitvity);

        spinner = (Spinner) findViewById(R.id.user_login_country);
        phone = (EditText) findViewById(R.id.user_login_phoneNumber);
    }
}
