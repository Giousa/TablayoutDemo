package com.zmm.tablayoutdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/9/12
 * Email:65489469@qq.com
 */
public class TabFragment extends Fragment {

    private MyAdapter mMyAdapter;
    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_fragment, container, false);

        mRecyclerView = view.findViewById(R.id.recycle_view);
        // 设置布局管理器
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        GridLayoutManager layoutManager = new GridLayoutManager(this,3);
//        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        // 设置内容适配器
        ArrayList<String> arrayList = getArguments().getStringArrayList("fragmentKey");
        mMyAdapter = new MyAdapter(arrayList);
        mRecyclerView.setAdapter(mMyAdapter);

        return view;
    }
}
