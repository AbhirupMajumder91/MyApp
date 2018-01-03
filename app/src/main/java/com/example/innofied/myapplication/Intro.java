package com.example.innofied.myapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.innofied.myapplication.databinding.IntroBinding;


public class Intro extends AppCompatActivity {
    private IntroBinding binding;
    private TextView save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.intro);
        UserDetails user = new UserDetails();
        user.setmailid("helllooooo");
        binding.setUserdetails(user);

        save=findViewById(R.id.save);



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res=binding.sample.getText().toString();
                Toast.makeText(getApplicationContext(),""+res+"helllloooooooogfhgfhgfh",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
