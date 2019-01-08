package com.forty7.lifedmeo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TEST", "C - >>> onCreate");
        setContentView(R.layout.activity_c);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fragment, new CFragment()).commit();
        }

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TEST", "C ------ >>> onClick");
//                if(B.instance != null && !B.instance.isFinishing())B.instance.finish();
                finish();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TEST", "C - >>> onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TEST", "C - >>> onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TEST", "C - >>> onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TEST", "C - >>> onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TEST", "C - >>> onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TEST", "C - >>> onRestart");
    }
}
