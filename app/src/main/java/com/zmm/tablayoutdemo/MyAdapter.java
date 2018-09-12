package com.zmm.tablayoutdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meng on 2016/2/29.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    private ArrayList<String> mStringArrayList;

    public MyAdapter(ArrayList<String> arrayList) {
        mStringArrayList = arrayList;
    }

    /**
     * 创建view，绑定holder
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =  View.inflate(parent.getContext(), R.layout.my_item, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.setData(mStringArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return mStringArrayList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{

        private final TextView tv_item;
        private String data;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_item = (TextView) itemView.findViewById(R.id.tv_item);
        }

        /**
         * 根据position位置获取数据填充位置
         * @param data
         */
        public void setData(String data) {
            this.data = data;
            tv_item.setText("当前位置："+data);
        }
    }
}