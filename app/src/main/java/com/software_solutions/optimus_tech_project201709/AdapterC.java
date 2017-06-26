package com.software_solutions.optimus_tech_project201709;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import java.util.ArrayList;

/**
 * Created by H.P on 25-Jun-17.
 */

public class AdapterC extends RecyclerView.Adapter<CourseHolder> {

    Context context;
    ArrayList<Course> courses;
    ArrayList<Course> checkedCourse = new ArrayList<>();

    public AdapterC(Context context, ArrayList<Course> courses) {
        this.context = context;
        this.courses = courses;
    }

    @Override
    public CourseHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.abc_select_course, null);
        return new CourseHolder(view);


    }

    @Override
    public void onBindViewHolder(CourseHolder courseHolder, int i) {

        courseHolder.courseName.setText(courses.get(i).getCourseName());
        courseHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                CheckBox checkBox = (CheckBox) v;
                if (checkBox.isChecked()) {
                    checkedCourse.add(courses.get(pos));
                } else if (!checkBox.isChecked()) {
                    checkedCourse.remove(courses.get(pos));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }
}
