package com.example.kalmanperkel.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private Button goToSettings = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        goToSettings = (Button)findViewById(R.id.settingsButton);
        goToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent i = new Intent(View.getContext(),Settings.class);
                startActivity(i);

            }
        });



       Toast tst = Toast.makeText(this,"Activity created",Toast.LENGTH_SHORT);
       tst.show();





    }

    @Override
    protected void onStart() {

        super.onStart();

        Toast tst = Toast.makeText(this,"Activity Started",Toast.LENGTH_SHORT);
        tst.show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast tst = Toast.makeText(this,"Activity saved",Toast.LENGTH_SHORT);
        tst.show();
    }

    @Override
    protected void onResume() {

        super.onResume();

        Toast tst = Toast.makeText(this,"Activity Resumed",Toast.LENGTH_SHORT);
        tst.show();
    }

    @Override
    protected void onPause() {


        super.onPause();
        Toast tst = Toast.makeText(this,"Activity Paused",Toast.LENGTH_SHORT);
        tst.show();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast tst = Toast.makeText(this,"Saving instance",Toast.LENGTH_SHORT);
        tst.show();

    }

    @Override
    protected void onStop() {

            super.onStop();
            Toast tst = Toast.makeText(this,"Activity Stopped",Toast.LENGTH_SHORT);
            tst.show();
        }

    @Override
    protected void onDestroy() {

        super.onDestroy();
       // super.onStop();
        Toast tst = Toast.makeText(this, "Activity destroyd", Toast.LENGTH_SHORT);
        tst.show();
    }

    }
