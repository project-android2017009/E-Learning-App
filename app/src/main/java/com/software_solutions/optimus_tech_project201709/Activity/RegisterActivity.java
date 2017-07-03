package com.software_solutions.optimus_tech_project201709.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.software_solutions.optimus_tech_project201709.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText name, emailAddress, phoneno, city;
    private String Username;
    private String EmailId;
    private String PhoneNo;
    private String nearCity;
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

                Register();
            }

        });


    }

    private void Register() {
        initialize();

        if (!registerfail()) {
            Toast.makeText(getApplicationContext(), "Registration failed !", Toast.LENGTH_SHORT).show();
        } else {
            registerok();
        }
    }

    private void registerok() {
        Toast.makeText(getApplicationContext(), "Registration done !", Toast.LENGTH_SHORT).show();
    }

    private boolean registerfail() {
        boolean validation = true;
        if (Username.isEmpty() || Username.length() > 25) {
            name.setError("Invalid username");
            validation = false;
        }
        if (EmailId.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(EmailId).matches()) {
            emailAddress.setError("Invalid EmailId");
            validation = false;
        }
        if (PhoneNo.isEmpty() || PhoneNo.length() != 10) {
            phoneno.setError("Invalid PhoneNo.");
            validation = false;
        }
        if (nearCity.isEmpty() ) {
            city.setError("Invalid nearCity");
            validation = false;
        }
        return validation;
    }

    private void initialize() {
        Username = name.getText().toString().trim();
        EmailId = emailAddress.getText().toString().trim();
        PhoneNo = phoneno.getText().toString().trim();
        nearCity = city.getText().toString().trim();

    }


}
