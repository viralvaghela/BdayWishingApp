package com.viral.payal;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;


public class Cat extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        final int r = new Random().nextInt(17);
        final int images[]={R.drawable.cat1,R.drawable.cat2,R.drawable.cat3,R.drawable.cat4,R.drawable.cat5,R.drawable.cat6
                ,R.drawable.cat7,R.drawable.cat8,R.drawable.cat9,R.drawable.cat10,R.drawable.cat11,R.drawable.cat12
                ,R.drawable.cat10,R.drawable.cat14,R.drawable.cat15,R.drawable.cat16,R.drawable.cat17
        };

        if(r!=0){
            imageView=(ImageView)findViewById(R.id.img);
            imageView.setBackgroundResource(images[r]);

        }
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Cat.this, "img clicked", Toast.LENGTH_SHORT).show();

                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                try{
                    wallpaperManager.setResource(R.raw.);
                }
                catch (Exception e)
                {
                   // Toast.makeText(MainActivity.this, "E:"+e.toString(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(Cat.this, "E :"+e.toString(), Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
