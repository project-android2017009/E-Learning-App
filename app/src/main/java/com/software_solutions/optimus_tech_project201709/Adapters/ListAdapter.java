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
    private int lengt=4;
    private String[] names={"Lesson 1","Lesson 2","Lesson 3 ","Lesson 4","Lesson 5","Lesson 6","Lesson 7","Lesson 8","Lesson 9","Lesson 10"};
    LayoutInflater layoutInflater;
    DemoVideoAdapter recyclerAdapter;

    public ListAdapter(Context context) {
        this.context = context;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        recyclerAdapter=new DemoVideoAdapter();
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
