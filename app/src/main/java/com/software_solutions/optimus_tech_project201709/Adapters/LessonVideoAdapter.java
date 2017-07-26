package com.software_solutions.optimus_tech_project201709.Adapters;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.software_solutions.optimus_tech_project201709.Activity.CrosswordActivity;
import com.software_solutions.optimus_tech_project201709.Activity.QuizActivity;
import com.software_solutions.optimus_tech_project201709.Activity.YouTubePlayerActivity;
import com.software_solutions.optimus_tech_project201709.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H.P on 08-Jul-17.
 */
public class LessonVideoAdapter extends RecyclerView.Adapter<LessonVideoAdapter.LessonDataHolder> {

    private List<VideoList> slipList;


    public LessonVideoAdapter() {
        slipList = new ArrayList<>();
        slipList.add(new VideoList("Chapter 1", R.drawable.demo_one));
        slipList.add(new VideoList("Chapter 2", R.drawable.demo_two));
        slipList.add(new VideoList("Chapter 3", R.drawable.demo_one));
        slipList.add(new VideoList("Chapter 4", R.drawable.demo_two));
        slipList.add(new VideoList("Chapter 5", R.drawable.demo_one));
        slipList.add(new VideoList("Chapter 6", R.drawable.demo_two));
        slipList.add(new VideoList("Chapter 7", R.drawable.demo_one));
        slipList.add(new VideoList("Chapter 8", R.drawable.demo_two));
        slipList.add(new VideoList("Chapter 9", R.drawable.demo_one));
        slipList.add(new VideoList("Chapter 10", R.drawable.demo_two));

    }

    @Override
    public LessonDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.abc_card_view_video, parent, false);

        return new LessonDataHolder(view);

    }

    @Override
    public void onBindViewHolder(LessonDataHolder holder, int position) {

        VideoList s = slipList.get(position);
        holder.bindSlip(s);

    }

    @Override
    public int getItemCount() {
        return slipList.size();
    }


    class LessonDataHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        private TextView nameOfSlip;
        private ImageView slipImage;
        private Context context;


        public LessonDataHolder(View itemView) {
            super(itemView);


            context = itemView.getContext();
            nameOfSlip = (TextView) itemView.findViewById(R.id.demoText);
            slipImage = (ImageView) itemView.findViewById(R.id.imageViewDemoVideo);

            slipImage.setOnClickListener(this);
        }

        public void bindSlip(VideoList videoList) {
            nameOfSlip.setText(videoList.stringSlipName);
            slipImage.setImageResource(videoList.stringImage);
        }

        @Override
        public void onClick(final View view) {


            if (view.getId() == slipImage.getId()) {

//                String s = String.valueOf(getAdapterPosition()+1);
                String s1 = ((nameOfSlip).getText().toString());

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.abc_dialog_option_chapter);
                dialog.setTitle("What Do You Want?");

//                TextView text = (TextView) dialog.findViewById(R.id.dialogLessonName);
//                text.setText("Lesson Name");

                TextView text1 = (TextView) dialog.findViewById(R.id.dialogChapterName);
                text1.setText(s1);

                Button b1 = (Button) dialog.findViewById(R.id.dialogPlayVideo);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context, YouTubePlayerActivity.class);
                        intent.putExtra("demoVideo", "oYaR9wyLiWs");
                        context.startActivity(intent);
                    }
                });
                Button b2 = (Button) dialog.findViewById(R.id.dialogPlayQuiz);
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context, QuizActivity.class);
                        context.startActivity(intent);
                    }
                });
                Button b3 = (Button) dialog.findViewById(R.id.dialogPlayCrossword);
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(context, CrosswordActivity.class);
                        context.startActivity(intent);
                    }
                });

                dialog.show();

            }
        }
    }
}

class VideoList {
    public String stringSlipName;
    public int stringImage;

    public VideoList(String stringSlipName, int stringImage) {
        this.stringImage = stringImage;
        this.stringSlipName = stringSlipName;
    }

}



