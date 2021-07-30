package com.example.orderfood;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class MainActivity3 extends AppCompatActivity {
    Button button27,button26;
    ImageView image_change;
    int Chng_clr = 1;
    ProgressBar progressBar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        progressBar2 = findViewById(R.id.progressBar2);
        button27 = findViewById(R.id.button27);
        button26 = findViewById(R.id.button26);
        button27.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
            startActivity(intent);
        });
        button26.setOnClickListener(view -> {
            if(Chng_clr==1) {
                button26.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                Chng_clr = 2;
                Toast.makeText(this, "Added to Whishlist", Toast.LENGTH_SHORT).show();
            }else if(Chng_clr==2){
                button26.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                Toast.makeText(this, "Remove from Whishlist", Toast.LENGTH_SHORT).show();
                Chng_clr = 1;
            }
        });
        image_change = findViewById(R.id.image_change);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {  // (new CircleCrop())
            String stroreId = bundle.getString("Id");
            Glide.with(MainActivity3.this).load(stroreId).transform(new RoundedCorners(20)).listener(new RequestListener<Drawable>() {
                @Override
                public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                    progressBar2.setVisibility(View.VISIBLE);
                    return false;
                }

                @Override
                public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                    progressBar2.setVisibility(View.GONE);
                    return false;
                }
            }).into(image_change);
        }
    }
}