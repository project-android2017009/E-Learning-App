package com.software_solutions.optimus_tech_project201709.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.software_solutions.optimus_tech_project201709.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H.P on 04-Jul-17.
 */

public class LessonAdapter extends RecyclerView.Adapter<LessonHolder> {

    private List<LessonStringList> slipList;

    public LessonAdapter() {
        slipList = new ArrayList<>();
        slipList.add(new LessonStringList("Lesson 1"));
        slipList.add(new LessonStringList("Lesson 2"));
        slipList.add(new LessonStringList("Lesson 3"));
        slipList.add(new LessonStringList("Lesson 4"));
        slipList.add(new LessonStringList("Lesson 5"));
        slipList.add(new LessonStringList("Lesson 6"));
        slipList.add(new LessonStringList("Lesson 7"));
        slipList.add(new LessonStringList("Lesson 8"));
        slipList.add(new LessonStringList("Lesson 9"));
        slipList.add(new LessonStringList("Lesson 10"));


    }

    @Override
    public LessonHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.abc_lesson_name, parent, false);
        return new LessonHolder(view);

    }

    @Override
    public void onBindViewHolder(LessonHolder holder, int position) {

        LessonStringList s = slipList.get(position);
        holder.bindSlip(s);

    }


    @Override
    public int getItemCount() {
        return slipList.size();
    }
}

class LessonHolder extends RecyclerView.ViewHolder {

    private TextView nameOfSlip;

    public LessonHolder(View itemView) {
        super(itemView);

        nameOfSlip = (TextView) itemView.findViewById(R.id.lesson_name);

    }

    public void bindSlip(LessonStringList stringList) {
        nameOfSlip.setText(stringList.stringSlipName);

    }
}

class LessonStringList {
    public String stringSlipName;

    public LessonStringList(String stringSlipName) {
        this.stringSlipName = stringSlipName;
    }

}

