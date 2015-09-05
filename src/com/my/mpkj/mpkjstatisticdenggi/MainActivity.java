package com.my.mpkj.mpkjstatisticdenggi;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        LinearLayout districtWrapper = (LinearLayout) findViewById(R.id.districtWrapper);
        String[] district = {"Gombak","Hulu Langat","Hulu Selangor","Klang","Kuala Langat","Petaling","Sabak Bernam","Sepang"};
        TextView[] districtTv = new TextView[8];
        for(int x=0;x<district.length;x++){
        	districtTv[x] = new TextView(getApplicationContext());
        	districtTv[x].setText(district[x]);
        	districtTv[x].setTextColor(Color.parseColor("#000000"));
        	districtTv[x].setTextSize(30);
        	districtTv[x].setPadding(25, 15, 15, 15);
        	districtTv[x].setBackgroundResource(R.drawable.borderbottom);
        	districtWrapper.addView(districtTv[x]);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
