package com.example.xieminjie.instagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button signup_confirm_Btn = (Button)findViewById(R.id.signup_confirm_Btn);
        final EditText username_regsiter = (EditText)findViewById(R.id.username_regsiter);
        final EditText password_regsiter = (EditText)findViewById(R.id.password_regsiter);
        signup_confirm_Btn.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Runnable storeDatarunner = new Runnable() {
                            @Override
                            public void run() {
                                String username = username_regsiter.getText().toString();
                                String password = password_regsiter.getText().toString();
                                boolean ifstore = storeData(username,password);
                                if(ifstore){
                                    intentToLogin();
                                }else{
                                    //do something;
                                }
                            }
                        };
                        Thread storeDataThread = new Thread(storeDatarunner);
                        storeDataThread.start();
                        //perhaps, it will have waiting animation thread.
                    }
                }
        );
    }
    private boolean storeData(String username, String password){
        boolean ifStore = true;
        return ifStore;
    }
    private void intentToLogin(){
        Intent intent = new Intent(Signup.this,Login.class);
        startActivity(intent);
    }
}
