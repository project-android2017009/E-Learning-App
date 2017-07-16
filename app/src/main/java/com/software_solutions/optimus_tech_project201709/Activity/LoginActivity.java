package com.software_solutions.optimus_tech_project201709.Activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.software_solutions.optimus_tech_project201709.R;

public class LoginActivity extends AppCompatActivity {

    String phoneNo;
    private EditText phone;
    private FloatingActionButton button;
    private String m_Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_actitvity);


        phone = (EditText) findViewById(R.id.user_login_phoneNumber);
        button = (FloatingActionButton) findViewById(R.id.loginButton);
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

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Enter OTP");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        m_Text = input.getText().toString();
        builder.setView(input);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (m_Text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter OTP !", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Welcome !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        builder.show();
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
