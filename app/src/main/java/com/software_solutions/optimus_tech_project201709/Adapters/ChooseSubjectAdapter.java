package com.software_solutions.optimus_tech_project201709.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.software_solutions.optimus_tech_project201709.Activity.SubjectActivity;
import com.software_solutions.optimus_tech_project201709.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H.P on 03-Jul-17.
 */

public class ChooseSubjectAdapter extends RecyclerView.Adapter<GridViewHolder> {

    private List<MenItem> menItems;


    public ChooseSubjectAdapter() {
        menItems = new ArrayList<>();
        menItems.add(new MenItem("Physics"));
        menItems.add(new MenItem("Chemistry"));
        menItems.add(new MenItem("Maths"));
        menItems.add(new MenItem("Biology"));
        menItems.add(new MenItem("English"));
        menItems.add(new MenItem("Fun"));
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.abc_choose_subject, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GridViewHolder gridViewHolder, int i) {
        MenItem menItem = menItems.get(i);
        gridViewHolder.bindData(menItem);
    }

    @Override
    public int getItemCount() {
        return menItems.size();
    }

}

class MenItem {
    public String mitemName;


    public MenItem(String mitemName) {
        this.mitemName = mitemName;
    }
}


class GridViewHolder extends RecyclerView.ViewHolder {

    private Button itemName;
    private Context context;

    public GridViewHolder(View itemView) {
        super(itemView);

        context = itemView.getContext();

        itemName = (Button) itemView.findViewById(R.id.button_subject);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getAdapterPosition() == 0) {


                    Intent intent = new Intent(context, SubjectActivity.class);
                    context.startActivity(intent);
                }

                if (getAdapterPosition() == 1) {


                    Intent intent = new Intent(context, SubjectActivity.class);
                    context.startActivity(intent);
                }
                if (getAdapterPosition() == 2) {


                    Intent intent = new Intent(context, SubjectActivity.class);
                    context.startActivity(intent);
                }
                if (getAdapterPosition() == 3) {


                    Intent intent = new Intent(context, SubjectActivity.class);
                    context.startActivity(intent);
                }
                if (getAdapterPosition() == 4) {


                    Intent intent = new Intent(context, SubjectActivity.class);
                    context.startActivity(intent);
                }
                if (getAdapterPosition() == 5) {

                    Intent intent = new Intent(context, SubjectActivity.class);
                    context.startActivity(intent);
                }
            }
        });

    }

    public void bindData(MenItem menItem) {
        itemName.setText(menItem.mitemName);
    }
}