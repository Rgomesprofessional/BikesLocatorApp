package com.example.rgome.bikeslocatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Romulo Gomes - 15640 - on 07/03/2018.
 * Linkedin: https://www.linkedin.com/in/rgomesprofessional
 * Web Site: http://rgomes.16mb.com
 */

public class About extends AppCompatActivity {
    //Variables
    TextView txtAbout1;
    TextView txtAbout2;
    TextView txtAbout3;
    TextView txtAbout4;
    TextView txtAbout5;
    TextView txtAbout6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Get widgets
        txtAbout1 = (TextView) findViewById(R.id.txtAbout1);
        txtAbout2 = (TextView) findViewById(R.id.txtAbout2);
        txtAbout3 = (TextView) findViewById(R.id.txtAbout3);
        txtAbout4 = (TextView) findViewById(R.id.txtAbout4);
        txtAbout5 = (TextView) findViewById(R.id.txtAbout5);
        txtAbout6 = (TextView) findViewById(R.id.txtAbout6);
    }
}
