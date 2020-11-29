package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        TextView my_test=(TextView) findViewById(R.id.back);
        Button button2 = (Button) findViewById(R.id.button_2);
        EditText username=(EditText) findViewById(R.id.username2);
        EditText password=(EditText) findViewById(R.id.password2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username2=username.getText().toString();
                String password2=password.getText().toString();
                String password0=password.getText().toString();
                String ok="注册成功";
                String fail="密码两次输入不同";
                if(password2.equals(password0)){
                    Toast.makeText(SecondActivity.this,ok,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SecondActivity.this,fail,Toast.LENGTH_SHORT).show();
                }
            }
        });
        my_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}