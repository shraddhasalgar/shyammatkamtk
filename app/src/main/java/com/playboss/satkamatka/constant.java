package com.playboss.satkamatka;

import android.content.Context;

public class constant {
    // DO NOT EDITs
    static String prefs = "codegente";

    ///// CONFIGURATION /////

    // API FOLDER URL
    static String prefix = "https://playboss777.com/api/";

    // APK DOWNLOAD LINK
    static String link = "https://playboss777.com/boss_777.apk";


      static String project_root = "https://playboss777.com/";

    // MIN AMOUNT ALLOWED IN TOTAL FOR BETTING
    static int min_total = 10;

    // MAX AMOUNT ALLOWED IN TOTAL FOR BETTING
    static int max_total = 10000;

    // MIN AMOUNT ALLOWED FOR SINGLE BET
    static int min_single = 10;

    // MAX AMOUNT ALLOWED FOR SINGLE BET
    static int max_single = 10000;

    // MIN DEPOSIT AMOUNT THROUGH PAYMENT GATEWAY
    static int min_deposit = 500;

    static public String getWhatsapp(Context context){

        String number = context.getSharedPreferences(constant.prefs,Context.MODE_PRIVATE).getString("whatsapp","");
        if (number.contains("+91")){
            return  "http://wa.me/"+context.getSharedPreferences(constant.prefs,Context.MODE_PRIVATE).getString("whatsapp","");
        } else {
            return  "http://wa.me/+91"+context.getSharedPreferences(constant.prefs,Context.MODE_PRIVATE).getString("whatsapp","");
        }

    }

}
