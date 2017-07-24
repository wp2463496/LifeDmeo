package com.forty7.lifedmeo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class B extends AppCompatActivity {
    public static B instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TEST", "B - >>> onCreate");
        setContentView(R.layout.activity_b);
        instance = this;
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TEST", "B ------ >>> onClick");
                startActivity(new Intent(B.this, C.class));
//                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TEST", "B - >>> onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TEST", "B - >>> onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TEST", "B - >>> onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TEST", "B - >>> onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TEST", "B - >>> onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TEST", "B - >>> onRestart");
    }
}
