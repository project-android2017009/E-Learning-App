package com.software_solutions.optimus_tech_project201709;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SliderWalkthroughActivity extends AppCompatActivity {

    Button next, skip;
    private ViewPagerAdapter adapter;
    private ViewPager viewPager;
    private SliderWalkthrough sliderWalkthrough;
    private int[] layouts;
    private TextView[] dots;
    private LinearLayout dotsLayout;

    ViewPager.OnPageChangeListener listener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            addButtonDots(position);
            if (position == layouts.length - 1) {

                next.setText("GET STARTED");
                skip.setVisibility(View.GONE);
                sliderWalkthrough.setFirst(false);
            } else {
                next.setText("NEXT");
                skip.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sliderWalkthrough = new SliderWalkthrough(this);
        if (!sliderWalkthrough.Check()) {
            Intent intent = new Intent(SliderWalkthroughActivity.this, CourseSelectionActivity.class);
            startActivity(intent);
            finish();
        }
        if (Build.VERSION.SDK_INT >= 21) {

            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        }

        setContentView(R.layout.activity_main2);

        viewPager = (ViewPager) findViewById(R.id.id_WalkThroughViewPager);
        dotsLayout = (LinearLayout) findViewById(R.id.layout_dots);
        skip = (Button) findViewById(R.id.id_WalkThroughSkip);
        next = (Button) findViewById(R.id.id_WalkThroughNext);

        layouts = new int[]{R.layout.slider_walkthrough_screen1, R.layout.slider_walkthrough_screen2, R.layout.slider_walkthrough_screen3};
        addButtonDots(0);
//        changeStatusBarColor();
        adapter = new ViewPagerAdapter();
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(listener);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SliderWalkthroughActivity.this, CourseSelectionActivity.class);
                startActivity(intent);
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int current = getItem(+1);
                if (current < layouts.length) {
                    viewPager.setCurrentItem(current);
                } else {
                    Intent intent = new Intent(SliderWalkthroughActivity.this, CourseSelectionActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }

    private void addButtonDots(int position) {

        dots = new TextView[layouts.length];
        int[] colorActive = getResources().getIntArray(R.array.active_dot);
        int[] colorInactive = getResources().getIntArray(R.array.inactive_dot);
        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(colorInactive[position]);
            dotsLayout.addView(dots[i]);

        }
        if (dots.length > 0) {
            dots[position].setTextColor(colorActive[position]);
        }

    }

    private int getItem(int i) {
        return viewPager.getCurrentItem() + 1;
    }

//    private void changeStatusBarColor() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window window = getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
//
//        }
//    }

    public class ViewPagerAdapter extends PagerAdapter {

        private LayoutInflater inflater;

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v = inflater.inflate(layouts[position], container, false);
            container.addView(v);
            return v;
        }

        @Override
        public int getCount() {
            return layouts.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }
}
