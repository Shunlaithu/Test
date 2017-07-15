package com.csclubi.hteteaindrayhlaing.smarthair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.csclubi.hteteaindrayhlaing.smarthair.R.id.boybutton;
import static com.csclubi.hteteaindrayhlaing.smarthair.R.id.girlbutton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= (Button) findViewById(R.id.girlbutton);
        b1.setOnClickListener(this);
        b2= (Button) findViewById(R.id.boybutton);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this, SecondActivity.class);
        switch (id) {
            case R.id.girlbutton:
                intent.putExtra("key", "girl");
                break;
            case R.id.boybutton:
                intent.putExtra("key", "boy");

        }
        startActivity(intent);
    }
}

