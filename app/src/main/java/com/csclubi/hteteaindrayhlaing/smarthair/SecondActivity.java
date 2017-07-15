package com.csclubi.hteteaindrayhlaing.smarthair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private RecyclerAdapter.OnClickHandler onClickHandler;
    int[] boys = {
            R.drawable.aa, R.drawable.bdiamond, R.drawable.bheart,
            R.drawable.boval, R.drawable.bpear, R.drawable.bround, R.drawable.bsquare,
            R.drawable.btriangular
    };

    int[] girls = {
            R.drawable.diamondg, R.drawable.heartg, R.drawable.oblongg,
            R.drawable.ovalg, R.drawable.roundg, R.drawable.squareg
    };

    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String key = getIntent().getStringExtra("key");

        if (key.equals("boy")) {
            adapter = new RecyclerAdapter(boys, this);
        } else {
            adapter = new RecyclerAdapter(girls, this);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_second);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        onClickHandler = new RecyclerAdapter.OnClickHandler() {
            @Override
            public void onClick(int id) {
                Toast.makeText(SecondActivity.this,"u Clicked"+id,Toast.LENGTH_LONG).show();
            }
        };
        adapter.
        recyclerView.setAdapter(adapter);


    }


}
