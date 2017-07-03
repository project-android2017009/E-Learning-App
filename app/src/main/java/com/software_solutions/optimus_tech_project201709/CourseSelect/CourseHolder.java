package com.software_solutions.optimus_tech_project201709.CourseSelect;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.software_solutions.optimus_tech_project201709.R;

/**
 * Created by H.P on 25-Jun-17.
 */

public class CourseHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView courseName;
    CheckBox checkBox;
    ItemClickListener listener;

    public CourseHolder(View itemView) {
        super(itemView);

        courseName = (TextView) itemView.findViewById(R.id.courseName);
        checkBox = (CheckBox) itemView.findViewById(R.id.checkbox_course_select);

        checkBox.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener clickListener) {
        this.listener = clickListener;
    }

    @Override
    public void onClick(View view) {
        this.listener.onItemClick(view,getLayoutPosition());
    }
}
