package com.example.activitytest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        TextView my_test=(TextView) findViewById(R.id.my_test);
        Button button=(Button) findViewById(R.id.button_1);
        EditText username=(EditText) findViewById(R.id.username1);
        EditText password=(EditText) findViewById(R.id.password1);

        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          String username1=username.getText().toString();
                                          String password1=password.getText().toString();
                                          String ok="登录成功";
                                          String fail="登录失败";
                                          if (username1.equals("123")&&password1.equals("123456")){
                                              Toast.makeText(FirstActivity.this,ok,Toast.LENGTH_SHORT).show();
                                          }else{
                                              Toast.makeText(FirstActivity.this,fail,Toast.LENGTH_SHORT).show();
                                          }

                                      }
                                  });
                my_test.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.activitytest.ACTION_START");
                        startActivity(intent);
                    }
                });
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "点了没用", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "点了真的没用", Toast.LENGTH_SHORT).show();
                break;
            default:}
        return true;
    }
}