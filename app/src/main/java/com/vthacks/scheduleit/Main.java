package com.vthacks.scheduleit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Schedule
        Button scheduleBtn = (Button)findViewById(R.id.scheduleBtn);
        scheduleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),scheduleDisplay.class);
                startActivity(startIntent);

            }
        });
        //Add items to list
        Button tomorrowBtn = (Button) findViewById(R.id.tomorrowBtn);
        tomorrowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),thingsForTomorrow.class);
                //startIntent.putExtra("org.intracode.quicklauncher.SOMETHING","HELLO WORLD!");
                startActivity(startIntent);
            }
        });
        //Inventory
        Button inventoryBtn1 = (Button) findViewById(R.id.inventoryBtn1);
        inventoryBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Inventory.class);
                //startIntent.putExtra("org.intracode.quicklauncher.SOMETHING","HELLO WORLD!");
                startActivity(startIntent);
            }
        });
    }
}
