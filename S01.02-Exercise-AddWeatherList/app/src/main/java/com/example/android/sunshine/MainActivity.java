/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v4.util.LogWriter;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mWeatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        mWeatherDisplay = (TextView) findViewById(R.id.tv_weather_data);
        Log.wtf("wtf","weatherArray");
        Log.v("v","weatherArray");
        Log.d("d","weatherArray");
        Log.i("i","weatherArray");
        Log.w("v","weatherArray");
        Log.e("e","weatherArray");
//        assert false;

        String[] weatherArray = {"Sunny", "Rainy", "Frosty"};

        for (String s : weatherArray) {
            mWeatherDisplay.append(String.format("%s%s", s, "\n"));
        }
    }
}