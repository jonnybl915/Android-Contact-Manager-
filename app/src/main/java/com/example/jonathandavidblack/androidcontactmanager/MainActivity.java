package com.example.jonathandavidblack.androidcontactmanager;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {

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

        contacts = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1); //initializing
        listView.setAdapter(contacts);

        addButton.setOnClickListener(this);
        listView.setOnItemLongClickListener(this);
        //listView.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = this.name.getText().toString();
        String phoneNumber = this.phoneNumber.getText().toString();

        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
        this.name.setText("");
        this.phoneNumber.setText("");
    }
    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Contact contact = contacts.getItem(position);
        contacts.remove(contact);
        return true;
    }
//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Intent intent = new Intent(this, ActivityTwo.class);
//        intent.putExtra(name.getText().toString() + phoneNumber.getText().toString(), contact);
    //need to pass only Extra(String, items.getItem(position)
//        intent.putExtra(phoneNumber.getText().toString(), true);
//        Bundle b = new Bundle();
//        b.putParcelable(name.getText().toString(), b);
//        startActivity(intent);
//    }
}
