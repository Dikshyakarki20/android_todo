package com.example.todomvvm;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.todomvvm.adapter.ProfileFragment;
import com.example.todomvvm.adapter.TabAdapter;
import com.example.todomvvm.adapter.TodolistFragment;
import com.example.todomvvm.database.UserEntry;
import com.google.android.material.tabs.TabLayout;
public class MainFragment extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    UserEntry userentry;
    TextView texter;
    private int[] tabIcons = {
            R.drawable.ic_home_black_24dp,
            R.drawable.ic_person_black_24dp
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getSupportFragmentManager(), this);
        adapter.addFragment(new TodolistFragment(),"Todo List", tabIcons[0]);
        adapter.addFragment(new ProfileFragment(),"Profile",tabIcons[1]);
        viewPager.setAdapter(adapter);
           tabLayout.setupWithViewPager(viewPager);
           highLightCurrentTab(0);
           viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
               @Override
               public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
               }
               @Override
               public void onPageSelected(int position) {
                   highLightCurrentTab(position);
               }
               @Override
               public void onPageScrollStateChanged(int state) {
               }
           });

       }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void highLightCurrentTab(int position) {
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            assert tab != null;
            tab.setCustomView(null);
            tab.setCustomView(adapter.getTabView(i));
        }
        TabLayout.Tab tab = tabLayout.getTabAt(position);
        assert tab != null;
        tab.setCustomView(null);
        tab.setCustomView(adapter.getSelectedTabView(position));

    }

}

