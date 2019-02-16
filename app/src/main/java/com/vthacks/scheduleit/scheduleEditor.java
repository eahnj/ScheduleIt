package com.vthacks.scheduleit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Button;


//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class scheduleEditor extends AppCompatActivity {


    // Write a message to the database
    //FirebaseDatabase database = FirebaseDatabase.getInstance();
    //DatabaseReference myRef = database.getReference("Schedule");

    String Name;
    String Time;
    String Date = "0/0/0";
    boolean bookmark;


    EditText eventName;
    EditText eventTime;
    EditText eventDate;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_editor);

        eventName = (EditText) findViewById(R.id.eventName);
        eventTime = (EditText) findViewById(R.id.eventTime);
        eventDate = (EditText) findViewById(R.id.eventDate);
        final CheckBox eventBookmark = (CheckBox) findViewById(R.id.eventBookmark);

        Button submitChanges = (Button) findViewById(R.id.submitChangesBtn);
        submitChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), scheduleDisplay.class);
                startActivity(startIntent);


                Name = eventName.getText().toString();
                Time = eventTime.getText().toString();
                Date = eventDate.getText().toString();
                if (eventBookmark.isChecked()) {
                    bookmark = true;
                }


            }
        });

       ArrayList<Integer> dateArrayList = new ArrayList<>();
       String[] dateArray = Date.split("/");

       for (int i = 0; i<3;i++) {

         dateArrayList.add(Integer.parseInt(dateArray[i]));

         }

         Schedule event = new Schedule(Name,Time,dateArrayList,bookmark);
    }
}