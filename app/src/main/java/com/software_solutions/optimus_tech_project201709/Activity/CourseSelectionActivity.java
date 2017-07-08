package com.software_solutions.optimus_tech_project201709.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.software_solutions.optimus_tech_project201709.Adapters.DemoVideoAdapter;
import com.software_solutions.optimus_tech_project201709.R;


public class CourseSelectionActivity extends AppCompatActivity {

    private RecyclerView recyclerView, recyclerViewDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_selection);

        recyclerViewDemo = (RecyclerView) findViewById(R.id.recyclerViewDemoVideo);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton FourthGrade = (RadioButton) findViewById(R.id.grade_4th);
        RadioButton FifthGRade = (RadioButton) findViewById(R.id.grade_5th);
        RadioButton SixthGrade = (RadioButton) findViewById(R.id.grade_6th);
        RadioButton SeventhGrade = (RadioButton) findViewById(R.id.grade_7th);


        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        recyclerViewDemo.setAdapter(new DemoVideoAdapter());


        FourthGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CourseSelectionActivity.this, Home.class);
                startActivity(intent);
            }
        });

        FifthGRade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CourseSelectionActivity.this, Home.class);
                startActivity(intent);
            }
        });

        SixthGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CourseSelectionActivity.this, Home.class);
                startActivity(intent);
            }
        });

        SeventhGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CourseSelectionActivity.this, Home.class);
                startActivity(intent);
            }
        });

    }


}
