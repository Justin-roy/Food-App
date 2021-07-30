package com.example.orderfood;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity2 extends AppCompatActivity {
    String ImageUrl,TextUrl,Description_Url;
    int HideMenu = 0;
    String copy_image_url1,copy_image_url2,copy_image_url3,copy_image_url4,copy_image_url5,copy_image_url6,copy_image_url7,copy_image_url8,
            copy_image_url9,copy_image_url10,copy_image_url11,copy_image_url12,copy_image_url13,copy_image_url14;
    int chk_img1 = 0,chk_img2 = 0,chk_img3 = 0,chk_img4 = 0,chk_img5 = 0,chk_img6 = 0,chk_img7 = 0,chk_img8 = 0,chk_img9 = 0,chk_img10 = 0,
            chk_img11 = 0,chk_img12 = 0,chk_img13 = 0,chk_img14 = 0;
    int changeClr1 = 0,changeClr2 = 0,changeClr3 = 0,changeClr4 = 0,changeClr5 = 0,changeClr6 = 0,changeClr7 = 0,
            changeClr8 = 0,changeClr9 = 0,changeClr10 = 0,changeClr11 = 0,changeClr12 = 0,changeClr13 = 0,changeClr14 = 0;
    ImageView image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12,image13,image14;
    TextView Details,Details1,Details2,Details3,Details4,Details5,Details6,Details7,Details8,Details9,Details10,Details11,Details12,Details13;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14;
    ProgressBar progressBar;
    ImageView MenuBar,imageView;
    RelativeLayout relative_layout;
    ScrollView Scroll_Menu;
    SearchView Search_Bar;
    EditText Search_Box;
    public void NextIntentIMG1(View v) {
        if(chk_img1==0) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url1);
            startActivity(intent);
        }
    }
    public void NextIntentIMG2(View v) {
        if(chk_img2==1) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url2);
            startActivity(intent);
        }
    }public void NextIntentIMG3(View v) {
        if(chk_img3==2) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url3);
            startActivity(intent);
        }
    }public void NextIntentIMG4(View v) {
       if(chk_img4==3) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url4);
            startActivity(intent);
        }
    }public void NextIntentIMG5(View v) {
        if(chk_img5==4) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url5);
            startActivity(intent);
        }
    }public void NextIntentIMG6(View v) {
       if(chk_img6==5) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url6);
            startActivity(intent);
        }
    }public void NextIntentIMG7(View v) {
         if(chk_img7==6) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url7);
            startActivity(intent);
        }
    }public void NextIntentIMG8(View v) {
        if(chk_img8==7) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url8);
            startActivity(intent);
        }
    }public void NextIntentIMG9(View v) {
       if(chk_img9==8) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url9);
            startActivity(intent);
        }
    }public void NextIntentIMG10(View v) {
        if(chk_img10==9) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url10);
            startActivity(intent);
        }
    }public void NextIntentIMG11(View v) {
        if(chk_img11==10) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url11);
            startActivity(intent);
        }
    }public void NextIntentIMG12(View v) {
        if(chk_img12==11) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url12);
            startActivity(intent);
        }
    }public void NextIntentIMG13(View v) {
        if(chk_img13==12) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url13);
            startActivity(intent);
        }
    }public void NextIntentIMG14(View v) {
        if(chk_img14==13) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("Id", copy_image_url14);
            startActivity(intent);
        }
    }
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = findViewById(R.id.imageView);
        Search_Box = findViewById(R.id.Search_Box);
        Search_Bar = findViewById(R.id.Search_Bar);
        relative_layout = findViewById(R.id.relative_layout);
        Scroll_Menu = findViewById(R.id.Scroll_Menu);
        progressBar = findViewById(R.id.progressBar);
        MenuBar = findViewById(R.id.MenuBar);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        Details = findViewById(R.id.Details);
        Details1 = findViewById(R.id.Details1);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        Details2 = findViewById(R.id.Details2);
        Details3 = findViewById(R.id.Details3);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        Details4 = findViewById(R.id.Details4);
        Details5 = findViewById(R.id.Details5);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        Details6 = findViewById(R.id.Details6);
        Details7 = findViewById(R.id.Details7);
        image9 = findViewById(R.id.image9);
        image10 = findViewById(R.id.image10);
        Details8 = findViewById(R.id.Details8);
        Details9 = findViewById(R.id.Details9);
        image11 = findViewById(R.id.image11);
        image12 = findViewById(R.id.image12);
        Details10 = findViewById(R.id.Details10);
        Details11 = findViewById(R.id.Details11);
        image13 = findViewById(R.id.image13);
        image14 = findViewById(R.id.image14);
        Details12 = findViewById(R.id.Details12);
        Details13 = findViewById(R.id.Details13);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        LoadNewFOODS("burger");//First Time Showing Api
        Search_Bar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Search_Bar.setVisibility(View.INVISIBLE);
                Scroll_Menu.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.VISIBLE);
                Search_Box.setVisibility(View.VISIBLE);
                MenuBar.setVisibility(View.VISIBLE);
                LoadNewFOODS(query);
                Search_Bar.setQuery("",false);
                Search_Bar.clearFocus();
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });
        Search_Box.setOnTouchListener((v, event) -> {
            Search_Bar.setVisibility(View.VISIBLE);
            relative_layout.setVisibility(View.INVISIBLE);
            Scroll_Menu.setVisibility(View.INVISIBLE);
            MenuBar.setVisibility(View.INVISIBLE);
            imageView.setVisibility(View.INVISIBLE);
            Search_Box.setVisibility(View.INVISIBLE);
            return false;
        });
        MenuBar.setOnClickListener(v -> {
            if(HideMenu == 0) {
                Scroll_Menu.setVisibility(View.INVISIBLE);
                relative_layout.setVisibility(View.VISIBLE);
                HideMenu = 1;
            }
            else if(HideMenu == 1) {
                Scroll_Menu.setVisibility(View.VISIBLE);
                relative_layout.setVisibility(View.INVISIBLE);
                HideMenu = 0;
            }
        });

        button1.setOnClickListener(v -> {
            if(changeClr1==0)
            {
               button1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr1 = 1;
            }
            else if(changeClr1==1)
            {
                button1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr1 = 0;
            }
        });
        button2.setOnClickListener(v -> {
            if(changeClr2==0)
            {
               button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr2 = 1;
            }
            else if(changeClr2==1)
            {
                button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr2 = 0;
            }
        });
        button3.setOnClickListener(v -> {
            if(changeClr3==0)
            {
               button3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr3 = 1;
            }
            else if(changeClr3==1)
            {
                button3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr3 = 0;
            }
        });
        button4.setOnClickListener(v -> {
            if(changeClr4==0)
            {
               button4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr4 = 1;
            }
            else if(changeClr4==1)
            {
                button4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr4 = 0;
            }
        });
        button5.setOnClickListener(v -> {
            if(changeClr5==0)
            {
               button5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr5 = 1;
            }
            else if(changeClr5==1)
            {
                button5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr5 = 0;
            }
        });
        button6.setOnClickListener(v -> {
            if(changeClr6==0)
            {
               button6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr6 = 1;
            }
            else if(changeClr6==1)
            {
                button6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr6 = 0;
            }
        });
        button7.setOnClickListener(v -> {
            if(changeClr7==0)
            {
               button7.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr7 = 1;
            }
            else if(changeClr7==1)
            {
                button7.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr7 = 0;
            }
        });
        button8.setOnClickListener(v -> {
            if(changeClr8==0)
            {
               button8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr8 = 1;
            }
            else if(changeClr8==1)
            {
                button8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr8 = 0;
            }
        });
        button9.setOnClickListener(v -> {
            if(changeClr9==0)
            {
               button9.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr9 = 1;
            }
            else if(changeClr9==1)
            {
                button9.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr9 = 0;
            }
        });
        button10.setOnClickListener(v -> {
            if(changeClr10==0)
            {
               button10.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr10 = 1;
            }
            else if(changeClr10==1)
            {
                button10.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr10 = 0;
            }
        });
        button11.setOnClickListener(v -> {
            if(changeClr11==0)
            {
               button11.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr11 = 1;
            }
            else if(changeClr11==1)
            {
                button11.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr11 = 0;
            }
        });
        button12.setOnClickListener(v -> {
            if(changeClr12==0)
            {
               button12.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr12 = 1;
            }
            else if(changeClr12==1)
            {
                button12.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr12 = 0;
            }
        });
        button13.setOnClickListener(v -> {
            if(changeClr13==0)
            {
               button13.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr13 = 1;
            }
            else if(changeClr13==1)
            {
                button13.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr13 = 0;
            }
        });
        button14.setOnClickListener(v -> {
            if(changeClr14==0)
            {
               button14.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
               changeClr14 = 1;
            }
            else if(changeClr14==1)
            {
                button14.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                changeClr14 = 0;
            }
        });

    }
    public void LoadNewFOODS(String query) {
        progressBar.setVisibility(View.VISIBLE);
        RequestQueue queue = Volley.newRequestQueue(this);
        //String url = "https://www.themealdb.com/api/json/v1/1/categories.php";
        // chicken%20fried
       String url = "https://pixabay.com/api/?key=9234694-700e23a8d397eb1cda392e74c&q="+query+"&image_type=photo&pretty=true";
      // String url = "https://api.unsplash.com/search/photos/?client_id=uhiqiqH5npZ-cPW6dI9WNjrrJWbf3FF8fbN8h-RK1qw&query="+query;
        // Request a string response from the provided URL.
        JsonObjectRequest stringRequest = new JsonObjectRequest(
                Request.Method.GET, url,null,
                response -> {
                    try {
                        //JSONArray jsonArray = response.getJSONArray("categories");
                        //JSONArray obj2 = response.getJSONArray("results");
                        JSONArray obj2 = response.getJSONArray("hits");
                        for (int i = 0; i < obj2.length(); i++) {
                            JSONObject obj = obj2.getJSONObject(i);
                          // ImageUrl = obj.getString("regular");
                           ImageUrl = obj.getString("webformatURL");
                            //TextUrl = obj.getString("alt_description");
                           TextUrl = obj.getString("tags");
                           // Description_Url = obj.getString("description");
                            if(i==0) {
                                chk_img1 = 0;
                                copy_image_url1 = ImageUrl;
                                Details.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image1);
                            }
                            else if(i==1) {
                                chk_img2 = 1;
                                copy_image_url2 = ImageUrl;
                                Details1.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image2);
                            }
                            else if(i==2) {
                                chk_img3 = 2;
                                copy_image_url3 = ImageUrl;
                                Details2.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image3);
                            }
                            else if(i==3) {
                                chk_img4 = 3;
                                copy_image_url4 = ImageUrl;
                                Details3.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image4);
                            }
                            else if(i==4) {
                                chk_img5 = 4;
                                copy_image_url5 = ImageUrl;
                                Details4.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image5);
                            }
                            else if(i==5) {
                                chk_img6 = 5;
                                copy_image_url6 = ImageUrl;
                                Details5.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image6);
                            }
                            else if(i==6) {
                                chk_img7 = 6;
                                copy_image_url7 = ImageUrl;
                                Details6.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image7);
                            }
                            else if(i==7) {
                                chk_img8 = 7;
                                copy_image_url8 = ImageUrl;
                                Details7.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image8);
                            }
                            else if(i==8) {
                                chk_img9 = 8;
                                copy_image_url9 = ImageUrl;
                                Details8.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image9);
                            }
                            else if(i==9) {
                                chk_img10 = 9;
                                copy_image_url10 = ImageUrl;
                                Details9.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image10);
                            }
                            else if(i==10) {
                                chk_img11 = 10;
                                copy_image_url11 = ImageUrl;
                                Details10.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image11);
                            }
                            else if(i==11) {
                                chk_img12 = 11;
                                copy_image_url12 = ImageUrl;
                                Details11.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image12);
                            }
                            else if(i==12) {
                                chk_img13 = 12;
                                copy_image_url13 = ImageUrl;
                                Details12.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image13);
                            }
                            else if(i==13) {
                                chk_img14 = 13;
                                copy_image_url14 = ImageUrl;
                                Details13.setText(TextUrl);
                                Glide.with(MainActivity2.this).load(ImageUrl).transform(new CircleCrop()).listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        progressBar.setVisibility(View.VISIBLE);
                                        return false;
                                    }

                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        progressBar.setVisibility(View.GONE);
                                        return false;
                                    }
                                }).into(image14);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }, error -> Toast.makeText(this, "No Internet Connection!!", Toast.LENGTH_SHORT).show());
        //Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
    //String url = "https://pixabay.com/api/?key=9234694-700e23a8d397eb1cda392e74c&q=burger&image_type=photo&pretty=true";
    //LoadBurger()
}