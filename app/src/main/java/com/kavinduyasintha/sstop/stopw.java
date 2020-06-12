package com.kavinduyasintha.sstop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import static android.graphics.Color.alpha;
import static com.kavinduyasintha.sstop.R.layout.activity_stopw;

public class stopw extends AppCompatActivity {
    private AdView mAdView1;

    Button b2,b3,b4;
    ImageView d;
    Animation round;
    Chronometer  timer;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopw);






        b2=findViewById(R.id.b2);
        d=findViewById(R.id.d);
        b3=findViewById(R.id.b3);



        b4=findViewById(R.id.b4);
        timer=findViewById(R.id.timer);
        b3.setAlpha(0);
        b4.setAlpha(0);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        ImageView imgview1 = (ImageView) findViewById(R.id.imageView9);
        imgview1.bringToFront();
        imgview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent1;
                myIntent1 = new Intent(stopw.this,home.class);
                startActivity(myIntent1);


            }
        });




        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-4219956547028494/5243092089");


        mAdView1 = findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);



        mAdView1.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });





        round = AnimationUtils.loadAnimation(this,R.anim.round);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                d.startAnimation(round);
                b4.animate().alpha(1).translationY(-80).setDuration(300).start();
                b3.animate().alpha(1).translationY(-80).setDuration(300).start();
                b2.animate().alpha(0).setDuration(300).start();


                timer.setBase(SystemClock.elapsedRealtime());
                timer.start();

            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                timer.stop();


            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a = new Intent(stopw.this,home.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);




            }
        });
    }
}
