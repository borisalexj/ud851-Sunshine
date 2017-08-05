package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        if (intent.hasExtra("weatherForDay")){
//            findViewById()
            Toast.makeText(this, intent.getStringExtra("weatherForDay"), Toast.LENGTH_SHORT).show();
            ((TextView)findViewById(R.id.detail_weather)).setText(intent.getStringExtra("weatherForDay"));
        }

        // TODO (2) Display the weather forecast that was passed from MainActivity
    }
}