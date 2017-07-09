package com.software_solutions.optimus_tech_project201709.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidviewhover.BlurLayout;
import com.software_solutions.optimus_tech_project201709.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H.P on 08-Jul-17.
 */
public class LessonVideoAdapter extends RecyclerView.Adapter<LessonDataHolder> {

    public BlurLayout samplelayout;
    private List<VideoList> slipList;
    private Context mContext;


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

        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.abc_card_view_video, parent, false);
        View hover = inflater.inflate(R.layout.hover_card_view, null);
        samplelayout = (BlurLayout) parent.findViewById(R.id.blur_layout);
        samplelayout.setHoverView(hover);
//
//        samplelayout.addChildAppearAnimator(view, R.id.hover_play_video, Techniques.SlideInLeft);
//        samplelayout.addChildDisappearAnimator(view, R.id.hover_play_video, Techniques.SlideInRight);
//        samplelayout.addChildAppearAnimator(view, R.id.hover_play_quiz, Techniques.SlideInLeft);
//        samplelayout.addChildDisappearAnimator(view, R.id.hover_play_quiz, Techniques.SlideOutRight);
//        samplelayout.addChildAppearAnimator(view, R.id.hover_play_crossword, Techniques.SlideInLeft);
//        samplelayout.addChildDisappearAnimator(view, R.id.hover_play_crossword, Techniques.SlideOutRight);
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
}

class LessonDataHolder extends RecyclerView.ViewHolder {

    private TextView nameOfSlip;
    private ImageView slipImage;
    private Context context;


    public LessonDataHolder(View itemView) {
        super(itemView);

        context = itemView.getContext();
        nameOfSlip = (TextView) itemView.findViewById(R.id.demoText);
        slipImage = (ImageView) itemView.findViewById(R.id.imageViewDemoVideo);

//        itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (getAdapterPosition() == 0) {
//
//                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
//                    intent.putExtra("demoVideo", "oYaR9wyLiWs");
//                    context.startActivity(intent);
//
//                }
//
//                if (getAdapterPosition() == 1) {
//
//                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
//                    intent.putExtra("demoVideo", "GqdJFFvsZeE");
//                    context.startActivity(intent);
//
//                }
//                if (getAdapterPosition() == 2) {
//
//                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
//                    intent.putExtra("demoVideo", "igfHfyMPpzk");
//                    context.startActivity(intent);
//
//                }
//                if (getAdapterPosition() == 3) {
//
//                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
//                    intent.putExtra("demoVideo", "EEjyQ50Q6pc");
//                    context.startActivity(intent);
//
//                }
//                if (getAdapterPosition() == 4) {
//
//                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
//                    intent.putExtra("demoVideo", "oYaR9wyLiWs");
//                    context.startActivity(intent);
//
//                }if (getAdapterPosition() == 5) {
//
//                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
//                    intent.putExtra("demoVideo", "GqdJFFvsZeE");
//                    context.startActivity(intent);
//
//                }if (getAdapterPosition() == 6) {
//
//                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
//                    intent.putExtra("demoVideo", "igfHfyMPpzk");
//                    context.startActivity(intent);
//
//                }if (getAdapterPosition() == 7) {
//
//                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
//                    intent.putExtra("demoVideo", "EEjyQ50Q6pc");
//                    context.startActivity(intent);
//
//                }
//                if (getAdapterPosition() == 1) {
//
//                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
//                    intent.putExtra("demoVideo", "GqdJFFvsZeE");
//                    context.startActivity(intent);
//
//                }
//                if (getAdapterPosition() == 8) {
//
//                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
//                    intent.putExtra("demoVideo", "GqdJFFvsZeE");
//                    context.startActivity(intent);
//
//                }
//                if (getAdapterPosition() == 9) {
//
//                    Intent intent = new Intent(context, YouTubePlayerActivity.class);
//                    intent.putExtra("demoVideo", "GqdJFFvsZeE");
//                    context.startActivity(intent);
//
//                }
//            }
//        });
    }

    public void bindSlip(VideoList videoList) {
        nameOfSlip.setText(videoList.stringSlipName);
        slipImage.setImageResource(videoList.stringImage);
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
