package com.example.mobileapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView heading;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle data = getIntent().getExtras();
        String desc = data.getString("names");
        int imageData=data.getInt("images");

        heading = (TextView) findViewById(R.id.textView3);
        imageView = (ImageView) findViewById(R.id.imageView);

        heading.setText(desc);
        imageView.setImageResource(imageData);


    }
}
