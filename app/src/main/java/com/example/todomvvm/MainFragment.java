package com.example.todomvvm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.todomvvm.adapter.ReminderFragment;
import com.example.todomvvm.adapter.RemindersFragment;
import com.example.todomvvm.adapter.TabAdapter;
import com.example.todomvvm.adapter.TodolistFragment;
import com.google.android.material.tabs.TabLayout;

public class MainFragment extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private int[] tabIcons = {
            R.drawable.home,
            R.drawable.todo,
            R.drawable.reminder
    };
    private void setTabIcons(){
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new TodolistFragment(), "Tab 1");
        adapter.addFragment(new ReminderFragment(), "Tab 2");
        adapter.addFragment(new RemindersFragment(),"tab3");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }


}
