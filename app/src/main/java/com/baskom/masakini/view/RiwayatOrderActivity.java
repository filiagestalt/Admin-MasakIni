package com.baskom.masakini.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.baskom.masakini.R;
import com.baskom.masakini.controller.RiwayatViewPagerAdapter;

/**
 * Created by akmalmuhamad on 20/11/17.
 */

public class RiwayatOrderActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private String[] pageTitle = {"Dalam Proses", "Order Selesai"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_order);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Status Pemesanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = findViewById(R.id.view_pager_riwayat);
        tabLayout = findViewById(R.id.tab_layout_riwayat);
        for(int i=0 ; i<2 ;i++){
            tabLayout.addTab(tabLayout.newTab().setText(pageTitle[i]));
        }tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        RiwayatViewPagerAdapter pagerAdapter = new RiwayatViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            /*Intent back = new Intent(RiwayatOrderActivity.this, MainActivity.class);
            startActivity(back);*/
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
