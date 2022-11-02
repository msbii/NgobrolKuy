package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private TextView cvuser, cvemail, cvpass, cvconfirm, buttonregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        cvuser = findViewById(R.id.text_user);
        cvemail = findViewById(R.id.text_email);
        cvpass = findViewById(R.id.text_pass);
        cvconfirm = findViewById(R.id.text_confirm);
        buttonregister = findViewById(R.id.btn_register);

        buttonregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent4);
            }
        });


    }

    public void handlelogin(View view) {
        Intent intent3 = new Intent(this, LoginActivity.class);
        startActivity(intent3);
    }
}