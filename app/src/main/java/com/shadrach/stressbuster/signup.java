package com.shadrach.stressbuster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    EditText un,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        un= (EditText)findViewById(R.id.un);
        pwd= (EditText) findViewById(R.id.pwd);
    }

    public void Register(View v){
        Intent i= new Intent(signup.this,register.class);
        startActivity(i);

    }
    public void onlogin(View v){
        if(un.getText().toString().equals("mahesh")&&pwd.getText().toString().equals("123mahesh")){
            Intent i= new Intent(signup.this,stresslevels.class);
            startActivity(i);
            //Toast.makeText(signup.this, "valid login details", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(signup.this, "invalid login details", Toast.LENGTH_SHORT).show();
        }

    }
}
