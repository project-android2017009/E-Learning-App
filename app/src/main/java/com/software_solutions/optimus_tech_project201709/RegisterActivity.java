package com.software_solutions.optimus_tech_project201709;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {

    private EditText name;
    private EditText emailAddress;
    private EditText phoneno;
    private EditText city;
    private Spinner spinner;
    private FloatingActionButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = (EditText) findViewById(R.id.register_userName);
        emailAddress = (EditText) findViewById(R.id.register_userEmailAddress);
        phoneno = (EditText) findViewById(R.id.register_userPhoneNumber);
        spinner = (Spinner) findViewById(R.id.register_spinnerCountry);
        city = (EditText) findViewById(R.id.register_userCity);
        button = (FloatingActionButton) findViewById(R.id.registerButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });


    }

}
