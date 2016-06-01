package com.example.jonathandavidblack.androidcontactmanager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by jonathandavidblack on 6/1/16.
 */
public class ActivityTwo extends Activity {

    ArrayAdapter<Contact> contacts;
    ListView listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        Bundle extras = getIntent().getExtras();
//        if (extras != null) {
//            String value = extras.getString();
//        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        listView2 = (ListView) findViewById(R.id.listView2);
        contacts = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1 ); //initializing
        listView2.setAdapter(contacts);

    }
}
