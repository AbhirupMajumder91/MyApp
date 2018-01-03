package com.example.innofied.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText name,password;
    public TextView login;
    boolean b= false;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        password=findViewById(R.id.password);

        login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String _name=name.getText().toString();
                String _password=password.getText().toString();
                if(_name.matches("") || _password.matches(""))
                {
                    Toast.makeText(getApplicationContext(),"All fields are required!",Toast.LENGTH_SHORT).show();
                }else{
                    check(_name);

                    if(b){

                        Intent intent= new Intent(MainActivity.this,Intro.class);
                        startActivity(intent);
                        MainActivity.this.finish();
                        Toast.makeText(getApplicationContext(),"welcome",Toast.LENGTH_SHORT).show();

                    }else{
                        Toast.makeText(getApplicationContext(),"Input correct emailid!",Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

    }


    public boolean check(String mail){

        if(mail.matches(emailPattern)){
            b=true;
        }else{
            b=false;
        }

        return b;
    }


}
