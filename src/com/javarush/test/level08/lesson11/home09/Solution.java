package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws ParseException {
        String date = "JANUARY 2 2020";
        System.out.println(date + " = " + isDateOdd(date));
    }

    public static boolean isDateOdd(String date) {
        Date curDate = new Date(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
        String dayOldFormat = dateFormat.format(curDate);
       // System.out.println(dayOldFormat);
        int dayNewFormat = Integer.parseInt(dayOldFormat);
        //System.out.println(dayNewFormat % 2 != 0);
        return dayNewFormat % 2 != 0;
    }
}

