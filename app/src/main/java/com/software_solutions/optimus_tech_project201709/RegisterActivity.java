package com.software_solutions.optimus_tech_project201709;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {

    private EditText userName;
    private EditText emailAddress;
    private EditText phoneno;
    private Spinner spinner;
    private FloatingActionButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userName=(EditText)findViewById(R.id.userName);
        emailAddress=(EditText)findViewById(R.id.userEmailAddress);
        phoneno=(EditText)findViewById(R.id.userPhoneNumber);
        spinner=(Spinner)findViewById(R.id.spinnerCountry);
        button=(FloatingActionButton)findViewById(R.id.registerButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitEntry();
            }
        });



    }

    private void submitEntry() {

    }
}
