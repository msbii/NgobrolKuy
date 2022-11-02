package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView tvusername, tvpassword, buttonlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonlogin = findViewById(R.id.btn_login);
        tvusername = findViewById(R.id.tvuser);
        tvpassword = findViewById(R.id.tvpass);


        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah2 = new Intent(LoginActivity.this, ProfilePicActivity.class);
                pindah2.putExtra("username",tvusername.getText().toString());
                pindah2.putExtra("password",tvpassword.getText().toString());
                startActivity(pindah2);

            }
        });
    }

    public void handleLupa(View view){
        Intent intent1 = new Intent(this, LupaPasswordActivity.class);
        startActivity(intent1);
    }

    public void handleRegister(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}