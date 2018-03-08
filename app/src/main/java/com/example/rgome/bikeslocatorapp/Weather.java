package com.example.rgome.bikeslocatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Romulo Gomes - 15640 - on 07/03/2018.
 * Linkedin: https://www.linkedin.com/in/rgomesprofessional
 * Web Site: http://rgomes.16mb.com
 */

public class Weather extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        //Get widgets
        ListView lvWeatherStations = (ListView) findViewById(R.id.go);

        //Create list with Weather in Bike Station
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Stations.weatherInfo);

        lvWeatherStations.setAdapter(arrayAdapter);

    }
}