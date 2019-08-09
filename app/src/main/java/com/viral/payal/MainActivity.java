package com.viral.payal;

import android.app.WallpaperManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView btn2;
    ImageView btn;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(ImageView) findViewById(R.id.btn);
        btn2=(ImageView) findViewById(R.id.btn2);
        button=(Button)findViewById(R.id.setWall);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                try{
                    wallpaperManager.setResource(R.raw.cat10);
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "E:"+e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });


        final MediaPlayer mp = MediaPlayer.create(this, R.raw.cat);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Vid.class);
                startActivity(i);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),Cat.class);
                mp.start();
                startActivity(i);
            }
        });
    }
}
