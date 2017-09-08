package com.ptp.phamtanphat.intent0208;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnchuyenmanhinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnchuyenmanhinh = (Button) findViewById(R.id.buttonchuyenmanhinh);
        btnchuyenmanhinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
                startActivity(intent);
            }
        });
        Log.d("AAA","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAA", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAA","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAA","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAA","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAA","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA","onDestroy");
    }
}
