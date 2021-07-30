package com.example.orderfood;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
public class MainActivity extends AppCompatActivity {
    Button NextINTENT;
    ImageView Image_of_del,Image_of_dorne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Image_of_del = findViewById(R.id.Image_of_del);
        Image_of_dorne = findViewById(R.id.Image_of_dorne);
        Glide.with(this).load(R.drawable.drone).into(Image_of_dorne);
        Glide.with(this).load(R.drawable.deliverboy_1).into(Image_of_del);
        NextINTENT = findViewById(R.id.NextINTENT);
        NextINTENT.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        });
    }
}