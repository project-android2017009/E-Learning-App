package com.software_solutions.optimus_tech_project201709.Adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.software_solutions.optimus_tech_project201709.R;

/**
 * Created by H.P on 07-Jul-17.
 */

public class ListAdapter extends BaseAdapter {


    private Context context;
    private String[] names={"Lesson 1: Intro","Lesson 2: Addition","Lesson 3: Subtraction","Lesson 4: Multiplication","Lesson 5: Geometry","Lesson 6: Shapes","Lesson 7: Quad","Lesson 8: Fun","Lesson 9: Problems-1","Lesson 10: Problems-2"};
    LayoutInflater layoutInflater;
    LessonVideoAdapter recyclerAdapter;

    public ListAdapter(Context context) {
        this.context = context;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        recyclerAdapter=new LessonVideoAdapter();
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1=layoutInflater.inflate(R.layout.abc_lesson_name,null,false);

         TextView tittle=(TextView)view1.findViewById(R.id.lesson_name);
         tittle.setText(names[i]);

        RecyclerView recyclerView=(RecyclerView)view1.findViewById(R.id.recyclerViewChapters);
        recyclerView.setAdapter(recyclerAdapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        return view1;

        }
}
