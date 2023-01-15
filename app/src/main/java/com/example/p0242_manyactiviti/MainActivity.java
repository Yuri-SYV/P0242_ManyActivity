package com.example.p0242_manyactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "States";
    Button btnActMain_to_two, btnActMain_to_three, btnActMain_to_four, btnActMain_to_fifth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActMain_to_two = (Button) findViewById(R.id.btnActMain_to_two);
        btnActMain_to_three = (Button) findViewById(R.id.btnActMain_to_three);
        btnActMain_to_four = (Button) findViewById(R.id.btnActMain_to_four);
        btnActMain_to_fifth = (Button) findViewById(R.id.btnActMain_to_fifth);

        btnActMain_to_two.setOnClickListener(this);
        btnActMain_to_three.setOnClickListener(this);
        btnActMain_to_four.setOnClickListener(this);
        btnActMain_to_fifth.setOnClickListener(this);

        Log.d(TAG, "MainActivity: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActMain_to_two:
                Intent intent2 = new Intent(this, ActivityTwo.class);
                startActivity(intent2);
                break;
            case R.id.btnActMain_to_three:
                Intent intent3 = new Intent(this, ActivityThree.class);
                startActivity(intent3);
                break;
            case R.id.btnActMain_to_four:
                Intent intent4 = new Intent(this, ActivityFour.class);
                startActivity(intent4);
                break;
            case R.id.btnActMain_to_fifth:
                Intent intent5 = new Intent(this, ActivityFifth.class);
                startActivity(intent5);
                break;
        }
    }
}