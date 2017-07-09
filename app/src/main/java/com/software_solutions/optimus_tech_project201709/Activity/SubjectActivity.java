package com.software_solutions.optimus_tech_project201709.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.software_solutions.optimus_tech_project201709.Adapters.ListAdapter;
import com.software_solutions.optimus_tech_project201709.R;

public class SubjectActivity extends AppCompatActivity {

    private ListView listview_lesson;
//    private Context mContext;
//    private BlurLayout samplelayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
//        mContext = this;

        listview_lesson = (ListView) findViewById(R.id.listview_lesson);
        listview_lesson.setAdapter(new ListAdapter(this));

//        samplelayout = (BlurLayout) findViewById(R.id.blur_layout);
//        View hover = LayoutInflater.from(mContext).inflate(R.layout.hover_card_view, null);
//        samplelayout.setHoverView(hover);
//
//        samplelayout.addChildAppearAnimator(hover, R.id.hover_play_video, Techniques.SlideInLeft);
//        samplelayout.addChildDisappearAnimator(hover, R.id.hover_play_video, Techniques.SlideInRight);
//        samplelayout.addChildAppearAnimator(hover, R.id.hover_play_quiz, Techniques.SlideInLeft);
//        samplelayout.addChildDisappearAnimator(hover, R.id.hover_play_quiz, Techniques.SlideOutRight);
//        samplelayout.addChildAppearAnimator(hover, R.id.hover_play_crossword, Techniques.SlideInLeft);
//        samplelayout.addChildDisappearAnimator(hover, R.id.hover_play_crossword, Techniques.SlideOutRight);
//
//
//        hover.findViewById(R.id.hover_play_video).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"play pressed",Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        hover.findViewById(R.id.hover_play_quiz).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"play quiz",Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        hover.findViewById(R.id.hover_play_crossword).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"play cross",Toast.LENGTH_SHORT).show();
//            }
//        });
    }

}
