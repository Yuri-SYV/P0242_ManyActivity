package com.example.p0242_manyactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "States";
    Button btnActTwo_to_three, btnActTwo_to_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btnActTwo_to_three = (Button) findViewById(R.id.btnActTwo_to_three);
        btnActTwo_to_main = (Button) findViewById(R.id.btnActTwo_to_main);

        btnActTwo_to_three.setOnClickListener(this);
        btnActTwo_to_main.setOnClickListener(this);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Welcome in Second Activity", Toast.LENGTH_SHORT);
        toast.show();

        Log.d(TAG, "ActivityTwo: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityTwo: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityTwo: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityTwo: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityTwo: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityTwo: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityTwo: onDestroy()");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActTwo_to_three:
                Intent activitythree = new Intent(this, ActivityThree.class);
                startActivity(activitythree);
                break;
            case R.id.btnActTwo_to_main:
                Intent mainactivity = new Intent(this, MainActivity.class);
                startActivity(mainactivity);
                break;
        }
    }
}