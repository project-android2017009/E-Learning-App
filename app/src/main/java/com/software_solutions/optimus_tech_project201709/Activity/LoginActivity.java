package com.software_solutions.optimus_tech_project201709.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.software_solutions.optimus_tech_project201709.R;

public class LoginActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText phone;
    private Button button;
    String phoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_actitvity);

        spinner = (Spinner) findViewById(R.id.user_login_country);
        phone = (EditText) findViewById(R.id.user_login_phoneNumber);
        button=(Button)findViewById(R.id.loginButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Register();
            }
        });
    }

    private void Register() {
        initialize();

        if (!registerfail()) {
            Toast.makeText(getApplicationContext(), "Login failed !", Toast.LENGTH_SHORT).show();
        } else {
            registerok();
        }
    }

    private void registerok() {
        Toast.makeText(getApplicationContext(), "Welcome !", Toast.LENGTH_SHORT).show();
    }

    private boolean registerfail() {
        boolean validation = true;

        if (phoneNo.isEmpty() || phoneNo.length() != 10) {
            phone.setError("Invalid PhoneNo.");
            validation = false;
        }

        return validation;
    }

    private void initialize() {
        phoneNo = phone.getText().toString().trim();

    }

}
