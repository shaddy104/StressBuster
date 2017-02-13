package com.shadrach.stressbuster;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {

    @Override
       protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread d= new Thread(){
            public void run(){
                try {
                    sleep(1000);
                    Intent intent = new Intent(getBaseContext(),signup.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    //kill the app
                    finish();
                }
            }
        };

        d.start();

    }


}
