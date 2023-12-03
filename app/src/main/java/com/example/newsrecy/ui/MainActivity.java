package com.example.newsrecy.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.newsrecy.R;
import com.example.newsrecy.db.DBManager;

public class MainActivity extends AppCompatActivity {
    EditText edtemailobj,edtpassobj;
    Button btnstartobj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtemailobj=findViewById(R.id.edtemail);
        edtpassobj=findViewById(R.id.edtpass);
        btnstartobj=findViewById(R.id.btnstart);
        btnstartobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startdpapp();
                Intent i = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });


    }


    public void startdpapp()
    {
        new DBManager(this);
        DBManager db = new DBManager(this);
        db.addRecord(edtemailobj.getText().toString(),edtpassobj.getText().toString());
        edtemailobj.setText("");
        edtpassobj.setText("");

        //new DBManager(this);
       // DBManager db = new DBManager(this);
      //  db.addRecord(edtemailobj.getText().toString(),edtpassobj.getText().toString());

       // edtemailobj.setText("");
       // edtpassobj.setText("");

    }




}
