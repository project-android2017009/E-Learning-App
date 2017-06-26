package com.software_solutions.optimus_tech_project201709;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

public class CourseSelectionActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_selection);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewSelectCourse);



    }

}
