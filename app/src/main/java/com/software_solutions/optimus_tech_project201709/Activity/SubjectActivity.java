package com.software_solutions.optimus_tech_project201709.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.software_solutions.optimus_tech_project201709.Adapters.ListAdapter;
import com.software_solutions.optimus_tech_project201709.R;

public class SubjectActivity extends AppCompatActivity {

    private ListView listview_lesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        listview_lesson = (ListView) findViewById(R.id.listview_lesson);
        listview_lesson.setAdapter(new ListAdapter(this));

    }
}
