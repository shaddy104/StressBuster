package com.shadrach.stressbuster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class register extends AppCompatActivity {

    EditText name_et,ph_no_et,Email_et,pass_et;
    Firebase fref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Firebase.setAndroidContext(this);
        name_et = (EditText)findViewById(R.id.name_et);
        ph_no_et = (EditText)findViewById(R.id.ph_no_et);
        Email_et = (EditText)findViewById(R.id.Email_et);
        pass_et = (EditText)findViewById(R.id.pass_et);

        fref = new Firebase("https://stress-buster.firebaseio.com/");
    }



    public void submit(View v)
    {
        final String name,ph_no,Email,pass;

        name = name_et.getText().toString();
        ph_no = ph_no_et.getText().toString();
        Email = Email_et.getText().toString();
        pass = pass_et.getText().toString();

        fref.setValue(name);

    }
}
