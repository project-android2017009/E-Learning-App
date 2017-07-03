package com.software_solutions.optimus_tech_project201709.CourseSelect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.software_solutions.optimus_tech_project201709.Activity.Home;
import com.software_solutions.optimus_tech_project201709.Adapters.DemoVideoAdapter;
import com.software_solutions.optimus_tech_project201709.R;

import java.util.ArrayList;

public class CourseSelectionActivity extends AppCompatActivity {

    AdapterC adapterC;
    private RecyclerView recyclerView, recyclerViewDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_selection);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewSelectCourse);
        recyclerViewDemo = (RecyclerView) findViewById(R.id.recyclerViewDemoVideo);


        adapterC = new AdapterC(this, getCourse());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapterC);

        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        recyclerViewDemo.setAdapter(new DemoVideoAdapter());


        Button button=(Button)findViewById(R.id.ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CourseSelectionActivity.this, Home.class);
                startActivity(intent);
            }
        });

    }

    private ArrayList<Course> getCourse() {

        ArrayList<Course> courses = new ArrayList<>();
        Course course = new Course("4th Grade");
        courses.add(course);
        course = new Course("5th Grade");
        courses.add(course);
        course = new Course("6th Grade");
        courses.add(course);
        course = new Course("7th Grade");
        courses.add(course);

        return courses;
    }

}
