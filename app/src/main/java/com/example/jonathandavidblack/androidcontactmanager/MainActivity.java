package com.example.jonathandavidblack.androidcontactmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayAdapter<Contact> contacts;
    Button addButton;
    EditText name;
    EditText phoneNumber;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = (Button) findViewById(R.id.add);
        name = (EditText) findViewById(R.id.name);
        phoneNumber = (EditText) findViewById(R.id.phoneNumber);
        listView = (ListView) findViewById(R.id.listView);

        contacts = new ArrayAdapter<Contact>(name, phoneNumber); //initializing
        listView.setAdapter(contacts);

        addButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Contact contact = new Contact(name.getText() + "(" + phoneNumber.getText() + ")");
        contacts.add(contact);
    }
}
