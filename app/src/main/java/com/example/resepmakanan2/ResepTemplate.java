package com.example.resepmakanan2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class ResepTemplate extends AppCompatActivity {

    private Bundle bundle;

    private ImageView imageView;
    private TextView judulResepTextView, bahanResepTextView, tahapanResepTextView;
    private YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep);

        bundle = getIntent().getExtras();

        imageView = findViewById(R.id.); imageView.setImageResource(bundle.getInt("gambarResep"));
        judulResepTextView = findViewById(R.id.); judulResepTextView.setText(bundle.getString("judulResep"));
        bahanResepTextView = findViewById(R.id.); bahanResepTextView.setText(bundle.getString("bahanResep"));
        tahapanResepTextView = findViewById(R.id.); tahapanResepTextView.setText(bundle.getString("tahapanResep"));

        youTubePlayerView = findViewById(R.id.);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                youTubePlayer.loadVideo(bundle.getString("idResepVideo"),0);
            }
        });

    }
}