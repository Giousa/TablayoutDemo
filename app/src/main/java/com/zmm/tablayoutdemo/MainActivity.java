package com.zmm.tablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到viewpager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        if (viewPager != null) {
            //设置viewpager 的数据
            setupViewPager(viewPager);
        }

        //找到了tabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        //给viewpager 关联一共tablayotu
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {

        //创建了一个viewpager的数据适配器
        Adapter adapter = new Adapter(getSupportFragmentManager());
        //Fragment作为viewpager 要展示的内容
        adapter.addFragment(new Fragment1(), "tab1");
        adapter.addFragment(new Fragment2(), "tab2");
        adapter.addFragment(new Fragment3(), "tab3");
        adapter.addFragment(new Fragment4(), "tab4");

        //给viewpager设置数据适配器  viewpager的内容就显示出来 了
        viewPager.setAdapter(adapter);
    }

    //viewpager 要展示的数据适配器
    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragments = new ArrayList<>();
        private final List<String> mFragmentTitles = new ArrayList<>();

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(Fragment fragment, String title) {
            //添加Fragment
            mFragments.add(fragment);
            //添加标题
            mFragmentTitles.add(title);
        }

        //返回viewpager 中每个条目展示的内容
        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        //返回viewpager中一共要展示的条目
        @Override
        public int getCount() {
            //集合的大小
            return mFragments.size();

        }

        //返回内容对应的标题  标题的内容来自于mFragmentTitles 集合
        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitles.get(position);
        }
    }
}
