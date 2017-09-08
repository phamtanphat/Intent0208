package com.ptp.phamtanphat.intent0208;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Manhinh2Activity extends AppCompatActivity {

    Button btnchuyenmanhinh1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        btnchuyenmanhinh1 = (Button) findViewById(R.id.buttonchuyenmanhinh1);
        btnchuyenmanhinh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             finish();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy");
    }
}
