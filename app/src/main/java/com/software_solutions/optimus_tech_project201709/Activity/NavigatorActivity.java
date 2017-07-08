package com.software_solutions.optimus_tech_project201709.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.software_solutions.optimus_tech_project201709.StringTag;

public class NavigatorActivity extends AppCompatActivity {


    public static Intent createIntentBasedOnChoice(Context context, int choice) {
        Intent intent ;

        switch (choice) {
            case 1: {
                intent = new Intent(context, Home.class);
                break;
            }
            case 2: {
                intent = new Intent(context, Home.class);
                break;
            }
            case 3: {

                intent = new Intent(context, Home.class);
                break;
            }
            case 4: {

                intent = new Intent(context, Home.class);
                break;
            }
            default: {
                intent = new Intent(context, CourseSelectionActivity.class);
                break;
            }
        }
        return intent;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);

        int choice = preferences.getInt(StringTag.KEY_CHOICE, -1);
        Intent intent = createIntentBasedOnChoice(this, choice);

        startActivity(intent);
        finish();
    }


}

