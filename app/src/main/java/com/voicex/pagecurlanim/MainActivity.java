package com.voicex.pagecurlanim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class MainActivity extends AppCompatActivity {


    PageCurlView pageCurlView;
    List<Integer> images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pageCurlView = findViewById(R.id.pagecurlView);
        images= new ArrayList<>();

        images.add(R.drawable.img1); //First Image
        images.add(R.drawable.img2); //Second Image
        images.add(R.drawable.img3); //Third Image

        pageCurlView.setCurlView(images);
        pageCurlView.setCurlSpeed(600); //Set the speed in ms
    }
}