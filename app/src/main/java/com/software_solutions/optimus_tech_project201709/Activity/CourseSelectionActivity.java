package com.software_solutions.optimus_tech_project201709.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.software_solutions.optimus_tech_project201709.Adapters.DemoVideoAdapter;
import com.software_solutions.optimus_tech_project201709.R;
import com.software_solutions.optimus_tech_project201709.StringTag;


public class CourseSelectionActivity extends AppCompatActivity {

    private RecyclerView  recyclerViewDemo;
    int choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_selection);

        recyclerViewDemo = (RecyclerView) findViewById(R.id.recyclerViewDemoVideo);
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton FourthGrade = (RadioButton) findViewById(R.id.grade_4th);
        RadioButton FifthGRade = (RadioButton) findViewById(R.id.grade_5th);
        RadioButton SixthGrade = (RadioButton) findViewById(R.id.grade_6th);
        RadioButton SeventhGrade = (RadioButton) findViewById(R.id.grade_7th);



        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        recyclerViewDemo.setAdapter(new DemoVideoAdapter());


        FourthGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                choice = 1;
                Toast.makeText(getApplicationContext(), " 4th " , Toast.LENGTH_SHORT).show();

                PreferenceManager
                        .getDefaultSharedPreferences(CourseSelectionActivity.this)
                        .edit()
                        .putInt(StringTag.KEY_CHOICE, choice)
                        .apply();

                Intent intent = NavigatorActivity
                        .createIntentBasedOnChoice(CourseSelectionActivity.this, choice);

                startActivity(intent);
                finish();
            }
        });
        FifthGRade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                choice = 2;
                Toast.makeText(getApplicationContext(), " 5th " , Toast.LENGTH_SHORT).show();

                PreferenceManager
                        .getDefaultSharedPreferences(CourseSelectionActivity.this)
                        .edit()
                        .putInt(StringTag.KEY_CHOICE, choice)
                        .apply();

                Intent intent = NavigatorActivity
                        .createIntentBasedOnChoice(CourseSelectionActivity.this, choice);

                startActivity(intent);
                finish();
            }
        });
        SixthGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                choice = 3;
                Toast.makeText(getApplicationContext(), " 6th " , Toast.LENGTH_SHORT).show();

                PreferenceManager
                        .getDefaultSharedPreferences(CourseSelectionActivity.this)
                        .edit()
                        .putInt(StringTag.KEY_CHOICE, choice)
                        .apply();

                Intent intent = NavigatorActivity
                        .createIntentBasedOnChoice(CourseSelectionActivity.this, choice);

                startActivity(intent);
                finish();
            }
        });
        SeventhGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                choice = 4;
                Toast.makeText(getApplicationContext(), " 7th " , Toast.LENGTH_SHORT).show();

                PreferenceManager
                        .getDefaultSharedPreferences(CourseSelectionActivity.this)
                        .edit()
                        .putInt(StringTag.KEY_CHOICE, choice)
                        .apply();

                Intent intent = NavigatorActivity
                        .createIntentBasedOnChoice(CourseSelectionActivity.this, choice);

                startActivity(intent);
                finish();
            }
        });


    }


}
