package com.decathlon.bae.bae;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.sql.Time;

/**
 * Created by Antoine on 18/01/2018.
 */

public class InformationsActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informations);

       // ImageView okAreaImgView = (ImageView) findViewById(R.id.okAreaImage);

        Button timeBtn = (Button)findViewById(R.id.timeButton);
        timeBtn.setOnClickListener(this); // calling onClick() method

        Button levelBtn = (Button)findViewById(R.id.levelButton);
        levelBtn.setOnClickListener(this);

        Button areaBtn = (Button)findViewById(R.id.areaButton);
        areaBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        switch (v.getId()) {

            case R.id.areaButton:
                Intent intent = new Intent(InformationsActivity.this,AreaInformationActivity.class);
                startActivity(intent);
                break;

            case R.id.levelButton:
                Intent intent2 = new Intent(InformationsActivity.this,LevelInformationActivity.class);
                startActivity(intent2);
                break;

            case R.id.timeButton:
                Intent intent3 = new Intent(InformationsActivity.this,TimeInformationActivity.class);
                startActivity(intent3);
                break;

            default:
                break;
        }
    }


}


