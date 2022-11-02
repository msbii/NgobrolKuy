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

public class ProfileFixActivity extends AppCompatActivity {

    private ImageView ivview, ivedit;

    private static final String TAG = ProfilePicActivity.class.getCanonicalName();
    private static final int GALLERY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);

        ivview = findViewById(R.id.profilePic);
        ivedit = findViewById(R.id.pinkCircle);

        ivedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI),GALLERY_REQUEST_CODE);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_CANCELED){
            Toast.makeText(this,"Cancel input image",Toast.LENGTH_SHORT).show();
            return;
        }
        else if(requestCode == GALLERY_REQUEST_CODE){
            if(data != null){
                try{
                    Uri imageUri = data.getData();
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(),imageUri);
                    ivview.setImageBitmap(bitmap);
                }
                catch (IOException e){
                    Toast.makeText(this, "Cant load image", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, e.getMessage());
                }
            }
        }
    }

    public void handlelanjut(View view) {
        Intent clik = new Intent(this, HomeChatActivity.class);
        startActivity(clik);
    }

}