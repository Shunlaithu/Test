package com.csclubi.hteteaindrayhlaing.smarthair;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

/**
 * Created by Dell on 6/7/2017.
 */

public class ThirdActivity extends AppCompatActivity implements RecyclerAdapter.OnClickHandler {
    int[] gdiamond = {
            R.drawable.aa, R.drawable.bdiamond, R.drawable.bheart,
            R.drawable.boval, R.drawable.bpear, R.drawable.bround, R.drawable.bsquare,
            R.drawable.btriangular
    };

    int[] gheart = {
            R.drawable.diamondg, R.drawable.heartg, R.drawable.oblongg,
            R.drawable.ovalg, R.drawable.roundg, R.drawable.squareg
    };
    int[] goblong = {
            R.drawable.gl1, R.drawable.gl2, R.drawable.gl3,
            R.drawable.gl4, R.drawable.gl5, R.drawable.gl6, R.drawable.gl7,
            R.drawable.gl8,R.drawable.gl9, R.drawable.gl10, R.drawable.gl11, R.drawable.gl12
    };

    int[] goval = {
            R.drawable.diamondg, R.drawable.heartg, R.drawable.oblongg,
            R.drawable.ovalg, R.drawable.roundg, R.drawable.squareg
    };
    int[] ground = {
            R.drawable.aa, R.drawable.bdiamond, R.drawable.bheart,
            R.drawable.boval, R.drawable.bpear, R.drawable.bround, R.drawable.bsquare,
            R.drawable.btriangular
    };

    int[] gsquare = {
            R.drawable.diamondg, R.drawable.heartg, R.drawable.oblongg,
            R.drawable.ovalg, R.drawable.roundg, R.drawable.squareg
    };

    int[] boblong = {
            R.drawable.aa, R.drawable.bdiamond, R.drawable.bheart,
            R.drawable.boval, R.drawable.bpear, R.drawable.bround, R.drawable.bsquare,
            R.drawable.btriangular
    };

    int[] bdiamond = {
            R.drawable.diamondg, R.drawable.heartg, R.drawable.oblongg,
            R.drawable.ovalg, R.drawable.roundg, R.drawable.squareg
    };
    int[] bheart = {
            R.drawable.aa, R.drawable.bdiamond, R.drawable.bheart,
            R.drawable.boval, R.drawable.bpear, R.drawable.bround, R.drawable.bsquare,
            R.drawable.btriangular
    };

    int[] boval = {
            R.drawable.diamondg, R.drawable.heartg, R.drawable.oblongg,
            R.drawable.ovalg, R.drawable.roundg, R.drawable.squareg
    };
    int[] bpear = {
            R.drawable.aa, R.drawable.bdiamond, R.drawable.bheart,
            R.drawable.boval, R.drawable.bpear, R.drawable.bround, R.drawable.bsquare,
            R.drawable.btriangular
    };

    int[] bround = {
            R.drawable.diamondg, R.drawable.heartg, R.drawable.oblongg,
            R.drawable.ovalg, R.drawable.roundg, R.drawable.squareg
    };
    int[] bsquare = {
            R.drawable.aa, R.drawable.bdiamond, R.drawable.bheart,
            R.drawable.boval, R.drawable.bpear, R.drawable.bround, R.drawable.bsquare,
            R.drawable.btriangular
    };

    int[] btriangular = {
            R.drawable.diamondg, R.drawable.heartg, R.drawable.oblongg,
            R.drawable.ovalg, R.drawable.roundg, R.drawable.squareg
    };

    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        String key = getIntent().getStringExtra("key");

        if (key.equals("gdiamond")) {
            adapter = new RecyclerAdapter(gdiamond, this);
        } else {
            adapter = new RecyclerAdapter(goblong, this);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_third);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(int id) {
        Toast.makeText(this, "U clicked: " + id, Toast.LENGTH_SHORT).show();
    }
}
