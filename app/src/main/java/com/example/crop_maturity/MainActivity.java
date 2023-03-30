package com.example.crop_maturity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
        Button camera_button;
        Button forward;
        Button backward;
        Button left;
        Button right;
        ImageView click_image;

//        public static final int RequestPermissionCode = 1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            camera_button = findViewById(R.id.camera_button);
            click_image = findViewById(R.id.click_image);
            forward = findViewById(R.id.forward);
            backward = findViewById(R.id.back);
            left = findViewById(R.id.left);
            right = findViewById(R.id.right);

//            EnableRuntimePermission();

            camera_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Call<urlResponse> appResponseCall = loginApi.getService().getImage();
                appResponseCall.enqueue(new Callback<urlResponse>() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onResponse(Call<urlResponse> call, Response<urlResponse> response) {

                        urlResponse eventResponse = response.body();
                        System.out.println(eventResponse);
                        Toast.makeText(MainActivity.this, "Coin Transferred successfully", Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onFailure(Call<urlResponse> call, Throwable t) {
                        String message = t.getLocalizedMessage();
                        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                    }
                });
                }
            });
        }

//        @Override
//        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//            super.onActivityResult(requestCode, resultCode, data);
//            if (requestCode == 7 && resultCode == RESULT_OK) {
//                Bitmap bitmap = (Bitmap) data.getExtras().get("data");
//                click_image.setImageBitmap(bitmap);
//
//            }
//        }
//        public void EnableRuntimePermission(){
//            if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,
//                    Manifest.permission.CAMERA)) {
//                Toast.makeText(MainActivity.this,"CAMERA permission allows us to Access CAMERA app",     Toast.LENGTH_LONG).show();
//            } else {
//                ActivityCompat.requestPermissions(MainActivity.this,new String[]{
//                        Manifest.permission.CAMERA}, RequestPermissionCode);
//            }
//        }
//        @Override
//        public void onRequestPermissionsResult(int requestCode, String permissions[], int[] result) {
//            super.onRequestPermissionsResult(requestCode, permissions, result);
//            switch (requestCode) {
//                case RequestPermissionCode:
//                    if (result.length > 0 && result[0] == PackageManager.PERMISSION_GRANTED) {
//                        Toast.makeText(MainActivity.this, "Permission Granted, Now your application can access CAMERA.", Toast.LENGTH_LONG).show();
//                    } else {
//                        Toast.makeText(MainActivity.this, "Permission Canceled, Now your application cannot access CAMERA.", Toast.LENGTH_LONG).show();
//                    }
//                    break;
//            }
//}
    }

