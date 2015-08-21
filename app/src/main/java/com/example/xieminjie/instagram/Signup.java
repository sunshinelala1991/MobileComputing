package com.example.xieminjie.instagram;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        //toolbar initialize
        toolbar = (Toolbar)findViewById(R.id.login_bar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        //content UI initialize
        Button signup_confirm_Btn = (Button)findViewById(R.id.signup_confirm_Btn);
        final EditText username_regsiter = (EditText)findViewById(R.id.username_regsiter);
        final EditText password_regsiter = (EditText)findViewById(R.id.password_regsiter);
        signup_confirm_Btn.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        String username = username_regsiter.getText().toString();
                        String password = password_regsiter.getText().toString();
                      //  storeData(username,password);
                        intentToPhoto();
                    }
                }
        );
    }
    private boolean storeData(String username, String password){
        boolean ifStore = true;
        return ifStore;
    }
    private void intentToPhoto(){
        Intent intent = new Intent(Signup.this,SignPhoto.class);
        startActivity(intent);
    }
}
