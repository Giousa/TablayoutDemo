package com.zmm.tablayoutdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

public class SingleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);

        //找到了tabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        RecyclerView recyclerView = findViewById(R.id.recycle_view);

        tabLayout.addTab(tabLayout.newTab().setText("标题A"));
        tabLayout.addTab(tabLayout.newTab().setText("标题B"));
        tabLayout.addTab(tabLayout.newTab().setText("标题C"));
        tabLayout.addTab(tabLayout.newTab().setText("标题D"));
        tabLayout.addTab(tabLayout.newTab().setText("标题E"));

    }

}
