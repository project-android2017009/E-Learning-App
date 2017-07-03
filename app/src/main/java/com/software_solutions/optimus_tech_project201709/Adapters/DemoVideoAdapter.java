package com.software_solutions.optimus_tech_project201709.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.software_solutions.optimus_tech_project201709.Activity.YouTubePlayerActivity;
import com.software_solutions.optimus_tech_project201709.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H.P on 03-Jul-17.
 */

public class DemoVideoAdapter extends RecyclerView.Adapter<SlipDataHolder> {

    private List<StringList> slipList;


    public DemoVideoAdapter() {
        slipList = new ArrayList<>();
        slipList.add(new StringList("Demo Video One", R.drawable.demo_one));
        slipList.add(new StringList("Demo Video Two", R.drawable.demo_two));

    }

    @Override
    public SlipDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.abc_demo_video, parent, false);
        return new SlipDataHolder(view);

    }

    @Override
    public void onBindViewHolder(SlipDataHolder holder, int position) {

        StringList s = slipList.get(position);
        holder.bindSlip(s);

    }


    @Override
    public int getItemCount() {
        return slipList.size();
    }
}

class SlipDataHolder extends RecyclerView.ViewHolder {

    private TextView nameOfSlip;
    private ImageView slipImage;
    private Context context;

    public SlipDataHolder(View itemView) {
        super(itemView);

        context=itemView.getContext();

        nameOfSlip = (TextView) itemView.findViewById(R.id.demoText);
        slipImage = (ImageView) itemView.findViewById(R.id.imageViewDemoVideo);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getAdapterPosition() == 0) {

                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
                    intent.putExtra("demoVideo", "oYaR9wyLiWs");
                    context.startActivity(intent);

                }

                if (getAdapterPosition() == 1) {

                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
                    intent.putExtra("demoVideo", "GqdJFFvsZeE");
                    context.startActivity(intent);

                }

            }
        });
    }

    public void bindSlip(StringList stringList) {
        nameOfSlip.setText(stringList.stringSlipName);
        slipImage.setImageResource(stringList.stringImage);
    }
}

class StringList {
    public String stringSlipName;
    public int stringImage;

    public StringList(String stringSlipName, int stringImage) {
        this.stringImage = stringImage;
        this.stringSlipName = stringSlipName;
    }

}
