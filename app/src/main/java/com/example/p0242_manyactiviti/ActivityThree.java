package com.example.p0242_manyactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityThree extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "States";
    Button btnActThree_to_four, btnActThree_to_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        btnActThree_to_four = (Button) findViewById(R.id.btnActThree_to_four);
        btnActThree_to_main = (Button) findViewById(R.id.btnActThree_to_main);

        btnActThree_to_four.setOnClickListener(this);
        btnActThree_to_main.setOnClickListener(this);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Welcome in Three Activity", Toast.LENGTH_SHORT);
        toast.show();

        Log.d(TAG, "ActivityThree: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityThree: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityThree: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityThree: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityThree: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityThree: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityThree: onDestroy()");
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActThree_to_four:
                Intent intent = new Intent(this, ActivityFour.class);
                startActivity(intent);
                break;
            case R.id.btnActThree_to_main:
                Intent mainactivity = new Intent (this, MainActivity.class);
                startActivity(mainactivity);
                break;
        }
    }
}