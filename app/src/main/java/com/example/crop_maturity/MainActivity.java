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
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

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
        Button predbtn;
        TextView predtext;

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
            predbtn = findViewById(R.id.predbtn);
            predtext =  findViewById(R.id.predtext);
            camera_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Call<urlResponse> appResponseCall = loginApi.getService().getImage();
                    appResponseCall.enqueue(new Callback<urlResponse>() {
                    @Override
                    public void onResponse(Call<urlResponse> call, Response<urlResponse> response) {
                        urlResponse eventResponse = response.body();
                        System.out.println("hhhhhhhhhh"+eventResponse.getResponse());
                        Toast.makeText(MainActivity.this, "Image clicked successfully", Toast.LENGTH_LONG).show();
                        Picasso.get().load(eventResponse.getResponse()).into(click_image);
                    }

                    @Override
                    public void onFailure(Call<urlResponse> call, Throwable t) {
                        String message = t.getLocalizedMessage();
                        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                    }
                });
                }
            });

            predbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Call<detectResponse> appResponseCall = loginApi.getService().getPrediction();
                    appResponseCall.enqueue(new Callback<detectResponse>() {
                        @Override
                        public void onResponse(Call<detectResponse> call, Response<detectResponse> response) {
                            detectResponse eventResponse = response.body();

                            System.out.println(eventResponse.getResponse().get(0).getDetections().get(0).getMyclass());
                            Toast.makeText(MainActivity.this, "Maturity predicted successfully", Toast.LENGTH_LONG).show();

                            predbtn.setVisibility(View.GONE);
                            predtext.setVisibility(View.VISIBLE);
                            predtext.setText("The fruit is: "+ eventResponse.getResponse().get(0).getDetections().get(0).getMyclass());

                        }

                        @Override
                        public void onFailure(Call<detectResponse> call, Throwable t) {
                            String message = t.getLocalizedMessage();
                            Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                        }
                    });

                }
            });
        }

    }

