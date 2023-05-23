package com.example.ovarious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainPage extends AppCompatActivity {

    home home_frag;
    articles articles_frag;
    community community_frag;
    profile profile_frag;

    ImageView home , articles , community , profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        home = findViewById(R.id.home);
        articles = findViewById(R.id.articles);
        community = findViewById(R.id.community);
        profile = findViewById(R.id.profile);

        home_frag = new home();
        open_frag(home_frag);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_frag = new home();
                open_frag(home_frag);
            }
        });
        articles.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                articles_frag = new articles();
                open_frag(articles_frag);
            }
        }));
        community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                community_frag = new community();
                open_frag(community_frag);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profile_frag = new profile();
                open_frag(profile_frag);
            }
        });

    }

    public void open_frag(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.frag_cont , fragment)
                .setReorderingAllowed(true)
                .addToBackStack(null)
                .commit();
    }

}