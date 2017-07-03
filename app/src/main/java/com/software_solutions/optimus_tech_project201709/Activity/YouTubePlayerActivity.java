package com.software_solutions.optimus_tech_project201709.Activity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.software_solutions.optimus_tech_project201709.R;
import com.software_solutions.optimus_tech_project201709.StringTag;

/**
 * Created by H.P on 01-Jul-17.
 */


public class YouTubePlayerActivity extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    String urlLink;

    YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_player_activity);


        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.my_player);

        urlLink = getIntent().getStringExtra("demoVideo");
        Log.d("ashu", "link is " + urlLink);


        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(urlLink);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        youTubePlayerView.initialize(StringTag.ApiKey, onInitializedListener);


    }
}

