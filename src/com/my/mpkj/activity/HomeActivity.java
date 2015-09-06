package com.my.mpkj.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.my.mpkj.mpkjstatisticdenggi.R;
import com.my.mpkj.util.DateUtil;

/**
 * Created by Mohamad Zahary on 9/6/15.
 */
public class HomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        LinearLayout districtWrapper = (LinearLayout) findViewById(R.id.districtWrapper);

        TextView deathHeaderTxt = (TextView) findViewById(R.id.dead_header_txt);
        String year = DateUtil.getCurrentYear();
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("Kes Kematian ");
        strBuff.append(year);
        deathHeaderTxt.setText(strBuff.toString());

        String[] district = {"Gombak","Hulu Langat","Hulu Selangor","Klang","Kuala Langat","Petaling","Sabak Bernam","Sepang"};
        Integer[] numberByDistrict = {10,0,0,0,20,23,25,0};
        TextView[] districtTv = new TextView[8];
        TextView[] staticticTv = new TextView[8];
        int totalDeath = 0;
        for(int x=0;x<district.length;x++){

            districtTv[x] = new TextView(getApplicationContext());
            districtTv[x].setText(district[x]);
            districtTv[x].setTextColor(Color.parseColor("#000000"));
            districtTv[x].setTextSize(20);
            districtTv[x].setPadding(25, 15, 25, 0);
            districtTv[x].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            strBuff = new StringBuffer();
            strBuff.append("Kes Dilaporkan : ");
            strBuff.append(numberByDistrict[x]);
            strBuff.append(", ");
            strBuff.append("Kes Kematian : ");
            strBuff.append(numberByDistrict[x]);
            staticticTv[x] = new TextView(getApplicationContext());
            staticticTv[x].setText(strBuff.toString());
            staticticTv[x].setTextColor(Color.parseColor("#000000"));
            staticticTv[x].setTextSize(12);
            staticticTv[x].setPadding(25, 15, 15, 15);
            staticticTv[x].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

            totalDeath+=numberByDistrict[x];

            LinearLayout innerDistrictWrapper = new LinearLayout(getApplicationContext());
            innerDistrictWrapper.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            innerDistrictWrapper.addView(districtTv[x]);
            districtWrapper.addView(innerDistrictWrapper);

            innerDistrictWrapper = new LinearLayout(getApplicationContext());
            innerDistrictWrapper.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            innerDistrictWrapper.addView(staticticTv[x]);

            districtWrapper.addView(innerDistrictWrapper);
        }

        TextView totalDeathTxt = (TextView) findViewById(R.id.total_death_txt);
        strBuff = new StringBuffer();
        strBuff.append("Jumlah Kes Kematian :");
        strBuff.append(totalDeath);
        strBuff.append(" orang");
        totalDeathTxt.setText(strBuff.toString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}