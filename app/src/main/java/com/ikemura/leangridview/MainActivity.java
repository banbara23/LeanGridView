package com.ikemura.leangridview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGrid();
    }

    private void initGrid() {
        GridView gridView = findViewById(R.id.grid);

        List<Integer> imageList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            imageList.add(R.mipmap.ic_launcher);
        }

        GridAdapter gridAdapter = new GridAdapter(this, R.layout.grid_item, imageList);
        gridView.setAdapter(gridAdapter);
    }
}
