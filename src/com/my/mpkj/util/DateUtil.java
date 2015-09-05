package com.my.mpkj.util;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Mohamad Zahary on 9/5/15.
 */
public class DateUtil {

    public static String getCurrentYear(){

        Calendar cal = Calendar.getInstance();
        String year = String.valueOf(cal.get(Calendar.YEAR));

        return year;
    }
}
