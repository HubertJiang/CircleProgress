package com.hubert.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hubert.circlelibrary.CircleProgress;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private CircleProgress progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress= (CircleProgress) findViewById(R.id.progress);
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if(progress.getProgress()<100){
                            progress.setProgress(progress.getProgress()+1);
                        }else {
                            progress.setProgress(0);
                        }
                    }
                });

            }
        },0,100);
    }
}
