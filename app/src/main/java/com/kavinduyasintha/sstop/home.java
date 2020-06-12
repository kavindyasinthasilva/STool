package com.kavinduyasintha.sstop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import com.budiyev.android.circularprogressbar.CircularProgressBar;
import com.google.android.gms.ads.InterstitialAd;

public class home extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    Button s1,s2,s3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        s1=findViewById(R.id.s1);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(home.this,step.class);
                k.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(k);



            }
        });

        s2=findViewById(R.id.s2);

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(home.this,stopw.class);
                l.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(l);



            }
        });




        Button button4 = (Button) findViewById(R.id.s3);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), qr.class);
                view.getContext().startActivity(intent);}
        });




        Button button5 = (Button) findViewById(R.id.s4);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), web.class);
                view.getContext().startActivity(intent);}
        });

        Button button6 = (Button) findViewById(R.id.s5);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(home.this,
                        "Coomeing soon ", Toast.LENGTH_LONG).show();
                }
        });




        Toast.makeText(home.this,
                "Welocme STool Click Only Images", Toast.LENGTH_LONG).show();








        ImageView imgview = (ImageView) findViewById(R.id.bus);
        imgview.bringToFront();
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent;
                myIntent = new Intent(home.this,step.class);
                startActivity(myIntent);

                Toast.makeText(home.this,
                        "Welcome Steps", Toast.LENGTH_LONG).show();
            }
        });

        ImageView imgview1 = (ImageView) findViewById(R.id.imageView3);
        imgview1.bringToFront();
        imgview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent1;
                myIntent1 = new Intent(home.this,stopw.class);
                startActivity(myIntent1);

                Toast.makeText(home.this,
                        "Welocme Stop Watch", Toast.LENGTH_LONG).show();
            }
        });


        ImageView imgview2 = (ImageView) findViewById(R.id.bus1);
        imgview2.bringToFront();
        imgview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent2;
                myIntent2 = new Intent(home.this,qr.class);
                startActivity(myIntent2);

                Toast.makeText(home.this,
                        "Welocme Sky QR", Toast.LENGTH_LONG).show();
            }
        });

        ImageView imgview3 = (ImageView) findViewById(R.id.train);
        imgview3.bringToFront();
        imgview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent3;
                myIntent3 = new Intent(home.this,web.class);
                startActivity(myIntent3);

                Toast.makeText(home.this,
                        "Welocme Compass", Toast.LENGTH_LONG).show();
            }
        });


        ImageView imgview4 = (ImageView) findViewById(R.id.airplane);
        imgview4.bringToFront();
        imgview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(home.this,
                        "This is not Updat", Toast.LENGTH_LONG).show();

            }
        });

        ImageView imgview5 = (ImageView) findViewById(R.id.st);
        imgview5.bringToFront();
        imgview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(home.this,
                        "Comeing soon Next Updat", Toast.LENGTH_LONG).show();
            }
        });










    }
}
