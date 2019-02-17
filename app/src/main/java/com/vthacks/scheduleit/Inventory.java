package com.vthacks.scheduleit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.time.LocalDate;
import java.util.*;
import java.text.*;

public class Inventory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        String tomorrow = getTomorrow();
        TextView tomorrowDate1 = (TextView) findViewById(R.id.tomorrowDate1);
        tomorrowDate1.setText(tomorrow + "");

    }
    //used for printing out tomorrow's date

    public String getTomorrow (){
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        String onlyDateTomorrow = tomorrow.toString().substring(0,11);
        return onlyDateTomorrow;
    }



    //LocalDate tomorrow = LocalDate.now().plusDays(1).now();

    //setContentView(R.layout.activity_inventory);
    //TextView textView = (TextView) findViewById(R.id.tomorrowDate1);


}
