package com.example.xieminjie.instagram;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.os.Message;
import android.os.Handler;

public class Login extends AppCompatActivity {
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            intentToMain();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button signin_Btn = (Button)findViewById(R.id.signin_Btn);
        Button signup_Btn = (Button)findViewById(R.id.signup_Btn);
        final EditText usernameInput = (EditText)findViewById(R.id.username_input);
        final EditText passwordInput = (EditText)findViewById(R.id.password_input);
        signin_Btn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        String username = usernameInput.getText().toString();
                        String password = passwordInput.getText().toString();
                        //Do we need another thread
                        boolean ifMatch = checkData(username, password);
                        if(ifMatch){
                            intentToMain();
                        }else {
                            // feedback
                        }
                    }
                }
        );
        signup_Btn.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        intentToSignup();
                    }
                }
        );

    }
    private void intentToMain(){
        Intent intent = new Intent(Login.this,Main.class);
        startActivity(intent);
    }
    private void intentToSignup(){
        Intent intent = new Intent(Login.this,Signup.class);
        startActivity(intent);
    }
    private boolean checkData(String username,String password){
        boolean ifMatch = true;
        return ifMatch;
    }
}
