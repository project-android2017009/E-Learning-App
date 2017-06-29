package com.software_solutions.optimus_tech_project201709;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class CourseSelectionActivity extends AppCompatActivity {

    StringBuffer stringBuffer = null;
    AdapterC adapterC;
    private RecyclerView recyclerView;
    private Button button, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_selection);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewSelectCourse);

        register = (Button) findViewById(R.id.register);
        adapterC = new AdapterC(this, getCourse());
        button = (Button) findViewById(R.id.button1);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CourseSelectionActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stringBuffer = new StringBuffer();
                for (Course course : adapterC.checkedCourse) {
                    stringBuffer.append(course.getCourseName());
                    stringBuffer.append("\n");
                }

                if (adapterC.checkedCourse.size() > 0) {
                    Toast.makeText(CourseSelectionActivity.this, stringBuffer.toString(), Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(CourseSelectionActivity.this, "galat hai", Toast.LENGTH_SHORT).show();

                }

            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapterC);

    }

    private ArrayList<Course> getCourse() {

        ArrayList<Course> courses = new ArrayList<>();
        Course course = new Course("4th Grade");
        courses.add(course);

        course = new Course("4th Grade");
        courses.add(course);
        course = new Course("6th Grade");
        courses.add(course);
        course = new Course("7th Grade");
        courses.add(course);
        course = new Course("8th Grade");
        courses.add(course);
        course = new Course("9th Grade");
        courses.add(course);
        course = new Course("10th Grade");
        courses.add(course);
        course = new Course("11th Grade");
        courses.add(course);
        course = new Course("12th Grade");
        courses.add(course);
        course = new Course("Bank PO");
        courses.add(course);
        course = new Course("CAT");
        courses.add(course);
        course = new Course("GRE");
        courses.add(course);
        course = new Course("Campus");
        courses.add(course);
        course = new Course("GMAT");
        courses.add(course);
        course = new Course("Colgate 1-2-3");
        courses.add(course);
        course = new Course("IAS");
        courses.add(course);


        return courses;
    }


}
