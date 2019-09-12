package com.jagdeep.ds.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TestLoader {
    public static void main(String[] args) {
        System.out.println(
                getTimeOfdayFromMillis(
                        convertGivenStringFormatToDate(
                                convertFrom12to24format(
                                        "2019-08-02 02:00:00 PM"
                                )
                        ).getTime()));
//        System.out.println(convertFrom12to24format("23-12-2014 10:22:12 PM"));
//       convert();
    }

    public static Date convertGivenStringFormatToDate(String dateString) {
        String dateformat="yyyy-MM-dd HH:mm";
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateformat);
        TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        dateFormat.setTimeZone(istTimeZone);
        Date date = null;

        try {
            date = dateFormat.parse(dateString);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return date;
    }

    public static String getTimeOfdayFromMillis(long millis){
        String dateFormat = "hh:mm a";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        Calendar calendar = Calendar.getInstance();
        TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        simpleDateFormat.setTimeZone(istTimeZone);
        calendar.setTimeInMillis(millis);
        return simpleDateFormat.format(calendar.getTime()).replace("am", "AM").replace("pm","PM");
    }


    public static String convertFrom12to24format(String input){
//        String input = "2014-12-23 10:22:12 PM";
        //Format of the date defined in the input String
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
        //Desired format: 24 hour format: Change the pattern as per the need
        DateFormat outputformat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = null;
        String output = null;
        try{
            //Converting the input String to Date
            date= df.parse(input);
            //Changing the format of date and storing it in String
            output = outputformat.format(date);
            //Displaying the date
            System.out.println(output);
        }catch(ParseException pe){
            pe.printStackTrace();
        }
        return output;
    }
}


//1564691400000
//1564691400000