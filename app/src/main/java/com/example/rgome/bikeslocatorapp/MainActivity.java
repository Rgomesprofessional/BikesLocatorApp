 package com.example.rgome.bikeslocatorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

 /**
  * Created by Romulo Gomes - 15640 - on 07/03/2018.
  * Linkedin: https://www.linkedin.com/in/rgomesprofessional
  * Web Site: http://rgomes.16mb.com
  */

public class MainActivity extends AppCompatActivity {
    //Variables
    public static Spinner selectCity;
    public static ArrayList<String> locations = new ArrayList<String>();
    public static ArrayList<String> moreInfo = new ArrayList<String>();
    public static ArrayList<Double> posLatitude = new ArrayList<Double>();
    public static ArrayList<Double> posLongitude = new ArrayList<Double>();
    Button btnStations;
    Button btnMap;
    Button btnAbout;

    String[] cities = {"Select City...", "Brisbane", "Bruxelles-Capitale", "Namur", "Santander", "Seville", "Valence", "Amiens", "Besancon", "Cergy-Pontoise", "Creteil", "Lyon", "Marseille", "Mulhouse", "Nancy", "Nantes", "Rouen", "Toulouse", "Dublin", "Toyama", "Vilnius", "Luxembourg", "Lillestrom", "Kazan", "Goteborg", "Lund", "Stockholm", "Ljubljana"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get widgets
        selectCity = (Spinner) findViewById(R.id.selectCity);
        btnStations = (Button) findViewById(R.id.btnStations);
        btnMap = (Button) findViewById(R.id.btnMap);
        btnAbout = (Button) findViewById(R.id.btnAbout);

        //Set cities in the spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, cities);
        selectCity.setAdapter(dataAdapter);

        //Get data from website with about the bikes (Fecth data in background)
        selectCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0) {
                    if(locations.size() > 0){
                        locations.clear();
                        moreInfo.clear();
                        posLatitude.clear();
                        posLongitude.clear();
                    }

                    FetchData process = new FetchData();
                    process.execute();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        //Show list of bike
        btnStations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Stations.class);
                startActivity(intent);
            }
        });

        //Show map of bike locations
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        //Show about
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this, About.class);
                 startActivity(intent);
            }
        });
    }
}
