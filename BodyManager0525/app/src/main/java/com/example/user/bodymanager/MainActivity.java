package com.example.user.bodymanager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Environment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static android.R.attr.bitmap;
import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, SplashActivity.class));
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_body:
                Toast.makeText(this, "몸입니다", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ExerciseActivity.class));
                break;
            case R.id.btn_leftarm:
                Toast.makeText(this, "팔입니다", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ExerciseActivity.class));
                break;
            case R.id.btn_rightarm:
                Toast.makeText(this, "팔입니다", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ExerciseActivity.class));
                break;
            case R.id.btn_lowerbody:
                Toast.makeText(this, "다리입니다", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, ExerciseActivity.class));
                break;
            case R.id.btn_calendar:
                Toast.makeText(this, "운동 계획표", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, CalenderActivity.class));
                break;
            case R.id.btn_custom:
                Toast.makeText(this, "나만의 운동", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, CustomActivity.class));
                break;
            case R.id.btn_settings:
                Toast.makeText(this, "설정", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_reverse:
                RelativeLayout sLayout = (RelativeLayout) findViewById(R.id.screenLayout);
                for (int i = R.id.bodygraph_body; i != R.id.bodygraph_end; i++) {
                    ImageView image = (ImageView) findViewById(i);
                    if (image.getVisibility() == View.VISIBLE) image.setVisibility(View.INVISIBLE);
                    else image.setVisibility(View.VISIBLE);
                }
                break;
        }
    }

    public void onClickExercise(View view) {
        int id = view.getId();
        Toast.makeText(this, "운동!", Toast.LENGTH_SHORT).show();

    }
}

