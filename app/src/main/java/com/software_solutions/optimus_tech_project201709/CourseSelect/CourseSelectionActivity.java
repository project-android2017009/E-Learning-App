package com.software_solutions.optimus_tech_project201709.CourseSelect;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
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

public class CourseSelectionActivity extends AppCompatActivity {

    AdapterC adapterC;
    private RecyclerView recyclerView, recyclerViewDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_selection);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewSelectCourse);
        recyclerViewDemo = (RecyclerView) findViewById(R.id.recyclerViewDemoVideo);


        adapterC = new AdapterC(this, getCourse());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapterC);

        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        recyclerViewDemo.setAdapter(new SlipAdapter());

    }

    private ArrayList<Course> getCourse() {

        ArrayList<Course> courses = new ArrayList<>();
        Course course = new Course("4th Grade");
        courses.add(course);
        course = new Course("5th Grade");
        courses.add(course);
        course = new Course("6th Grade");
        courses.add(course);
        course = new Course("7th Grade");
        courses.add(course);

        return courses;
    }

    public class SlipAdapter extends RecyclerView.Adapter<SlipDataHolder> {

        private List<StringList> slipList;

        public SlipAdapter(){
            slipList=new ArrayList<>();
            slipList.add(new StringList("Demo Video One",R.drawable.demo_one));
            slipList.add(new StringList("Demo Video Two",R.drawable.demo_two));

        }

        @Override
        public SlipDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Context context =parent.getContext();
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.abc_demo_video,parent,false);
            return new SlipDataHolder(view);

        }

        @Override
        public void onBindViewHolder(SlipDataHolder holder, int position) {

            StringList s=slipList.get(position);
            holder.bindSlip(s);

        }



        @Override
        public int getItemCount() {
            return slipList.size();
        }
    }

    public class SlipDataHolder extends RecyclerView.ViewHolder {

        private TextView nameOfSlip;
        private ImageView slipImage;

        public SlipDataHolder(View itemView) {
            super(itemView);

            nameOfSlip=(TextView) itemView.findViewById(R.id.demoText);
            slipImage=(ImageView) itemView.findViewById(R.id.imageViewDemoVideo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (getAdapterPosition()==0){


                        Intent intent=new Intent(CourseSelectionActivity.this, YouTubePlayerActivity.class);
                        intent.putExtra("demoVideo","oYaR9wyLiWs");
                        startActivity(intent);

                    }

                    if (getAdapterPosition()==1){

                        Intent intent=new Intent(CourseSelectionActivity.this, YouTubePlayerActivity.class);
                        intent.putExtra("demoVideo","GqdJFFvsZeE");
                        startActivity(intent);
                    }

                }
            });
        }

        public void bindSlip(StringList stringList) {
            nameOfSlip.setText(stringList.stringSlipName);
            slipImage.setImageResource(stringList.stringImage);
        }
    }

    public class StringList {
        public String stringSlipName;
        public int stringImage;

        public StringList(String stringSlipName,  int stringImage) {
            this.stringImage = stringImage;
            this.stringSlipName = stringSlipName;
        }

    }

}
