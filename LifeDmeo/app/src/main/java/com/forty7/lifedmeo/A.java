package com.forty7.lifedmeo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * ABC跳转关闭测试demo
 * 2017.7.12
 * @author Forty'7
 * xiaowangboke@vip.qq.com
 */
public class A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TEST", "A - >>> onCreate");
        setContentView(R.layout.activity_a);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TEST", "A ------ >>> onClick");
                startActivity(new Intent(A.this, B.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TEST", "A - >>> onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TEST", "A - >>> onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TEST", "A - >>> onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TEST", "A - >>> onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TEST", "A - >>> onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TEST", "A - >>> onRestart");
    }
}
