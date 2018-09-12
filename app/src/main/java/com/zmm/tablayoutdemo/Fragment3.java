package com.zmm.tablayoutdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/9/12
 * Email:65489469@qq.com
 */
public class Fragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        TextView textView = new TextView(getContext());
        textView.setText("标题3");
        textView.setTextColor(Color.RED);

        return textView;
    }

}
