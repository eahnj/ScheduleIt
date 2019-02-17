package com.vthacks.scheduleit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class thingsForTomorrow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_for_tomorrow);

        final ArrayList<String> itemsForTomorrow = new ArrayList<String>();


        Button mButton = (Button)findViewById(R.id.itemsForTomorrowBtn);
        mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText mEdit   = (EditText)findViewById(R.id.inventoryInput);
                    itemsForTomorrow.add(mEdit.toString());
                    mEdit.setText("");

                }
            });

        Button inventoryBtn2 = (Button) findViewById(R.id.inventoryBtn2);
        inventoryBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Inventory.class);
                startActivity(startIntent);
            }
        });



    }


}
