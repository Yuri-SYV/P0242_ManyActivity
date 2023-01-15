package com.example.p0242_manyactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityFour extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "States";
    Button btnActFour_to_fifth, btnActFour_to_main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        btnActFour_to_fifth = (Button) findViewById(R.id.btnActFour_to_fifth);
        btnActFour_to_main = (Button) findViewById(R.id.btnActFour_to_main);

        btnActFour_to_fifth.setOnClickListener(this);
        btnActFour_to_main.setOnClickListener(this);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Welcome in Four Activity", Toast.LENGTH_SHORT);
        toast.show();

        Log.d(TAG, "ActivityFour: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityFour: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityFour: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityFour: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityFour: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityFour: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityFour: onDestroy()");
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActFour_to_fifth:
                Intent intent = new Intent(this, ActivityFifth.class);
                startActivity(intent);
                break;
            case R.id.btnActFour_to_main:
                Intent intentmain = new Intent (this, MainActivity.class);
                startActivity(intentmain);
                break;
        }
    }
}