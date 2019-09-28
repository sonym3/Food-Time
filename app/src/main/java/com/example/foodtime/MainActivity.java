package com.example.foodtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText em,pw;
    final String storedEmail="asma@gmail.com";
    final String storedPassword="09876";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        em=(EditText) findViewById(R.id.email);
        pw = (EditText) findViewById(R.id.password);
        Button login=(Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(storedEmail.equals(em.getText().toString()) && storedPassword.equals(pw.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(getApplicationContext(),Home.class);
                    startActivity(i);
                }
                else
                    Toast.makeText(getApplicationContext(),"Error.. Try again",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
