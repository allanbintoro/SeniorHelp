package com.allan.seniorhelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mServiceProvider, mSenior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mServiceProvider = (Button)findViewById(R.id.serviceProvider);
        mSenior = (Button)findViewById(R.id.senior);

        //Click Listener
        mServiceProvider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ServiceLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        mSenior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SeniorLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
