package com.example.resepmakanan2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

        ImageView buttonBack = findViewById(R.id.butttonBackResep); buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        bundle = getIntent().getExtras();

        imageView = findViewById(R.id.gambarMakanan); imageView.setImageResource(bundle.getInt("gambarResep"));
        judulResepTextView = findViewById(R.id.judulResep); judulResepTextView.setText(bundle.getString("judulResep"));
        bahanResepTextView = findViewById(R.id.bahanResep); bahanResepTextView.setText(bundle.getString("bahanResep"));
        tahapanResepTextView = findViewById(R.id.tahapResep); tahapanResepTextView.setText(bundle.getString("tahapanResep"));

        youTubePlayerView = findViewById(R.id.idResepVideo);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                youTubePlayer.loadVideo(bundle.getString("idResepVideo"),0);
            }
        });

    }
}