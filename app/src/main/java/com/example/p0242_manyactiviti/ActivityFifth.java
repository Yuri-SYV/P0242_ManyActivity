package com.example.p0242_manyactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityFifth extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "States";
    Button btnActFive_to_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        btnActFive_to_main = (Button) findViewById(R.id.btnActFive_to_main);
        btnActFive_to_main.setOnClickListener(this);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Welcome in Fifth Activity", Toast.LENGTH_SHORT);
        toast.show();

        Log.d(TAG, "ActivityFifth: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityFifth: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityFifth: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityFifth: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityFifth: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityFifth: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityFifth: onDestroy()");
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}