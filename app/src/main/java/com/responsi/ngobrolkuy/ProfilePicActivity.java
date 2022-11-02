package com.responsi.ngobrolkuy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class ProfilePicActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);
    }

    public void handlepindah(View view) {
        Intent clik1 = new Intent(this, ProfileFixActivity.class);
        startActivity(clik1);
    }

    public void handlelewati(View view) {
        Intent clik = new Intent(this, HomeChatActivity.class);
        startActivity(clik);
    }

}