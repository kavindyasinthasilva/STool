package com.kavinduyasintha.sstop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
 TextView t1;
 Button b1;

 Animation atg;
    Animation stg;
    Animation lo;
 ImageView imageView ,bus;
 TextView log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b1=findViewById(R.id.b1);


        imageView=findViewById(R.id.s);

        bus=(ImageView)findViewById(R.id.bus);
        log=findViewById(R.id.log);






        atg = AnimationUtils.loadAnimation(this,R.anim.atg);
        stg = AnimationUtils.loadAnimation(this,R.anim.stg);
        lo= AnimationUtils.loadAnimation(this,R.anim.log);

        b1.startAnimation(atg);
        imageView.startAnimation(stg);
        log.startAnimation(lo);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,home.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);



            }
        });





    }
}
