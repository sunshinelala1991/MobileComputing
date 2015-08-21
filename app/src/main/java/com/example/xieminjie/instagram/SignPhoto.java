package com.example.xieminjie.instagram;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SignPhoto extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_photo);
        toolbar = (Toolbar)findViewById(R.id.login_bar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        Button signPhoto = (Button)findViewById(R.id.signPhoto_Btn);
        signPhoto.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        intentToLogin();
                    }
                }
        );
    }
    private void intentToLogin(){
        Intent intent = new Intent(SignPhoto.this,Login.class);
        startActivity(intent);
    }
}
