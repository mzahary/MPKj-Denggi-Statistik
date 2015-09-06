package com.my.mpkj.activity;

import com.my.mpkj.mpkjstatisticdenggi.R;
import com.my.mpkj.util.DateUtil;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources ressources = getResources();
        TabHost tabHost = getTabHost();

        // Android tab
        Intent intentHome = new Intent().setClass(this, HomeActivity.class);
        TabHost.TabSpec tabSpecHome = tabHost
                .newTabSpec("Home")
                .setIndicator("", ressources.getDrawable(R.drawable.home))
                .setContent(intentHome);

        // Apple tab
        Intent intentStatistic = new Intent().setClass(this, StatistikActivity.class);
        TabHost.TabSpec tabSpecStatistic = tabHost
                .newTabSpec("Statistic")
                .setIndicator("", ressources.getDrawable(R.drawable.statistic))
                .setContent(intentStatistic);

        // add all tabs
        tabHost.addTab(tabSpecHome);
        tabHost.addTab(tabSpecStatistic);

        //set Windows tab as default (zero based)
        tabHost.setCurrentTab(0);
    }
    
}
