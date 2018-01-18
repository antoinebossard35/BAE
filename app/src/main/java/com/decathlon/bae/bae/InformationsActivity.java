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

public class InformationsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informations);

        ImageView okAreaImgView = (ImageView) findViewById(R.id.okAreaImage);

        Button timeBtn = (Button)findViewById(R.id.timeButton);
        timeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationsActivity.this, TimeInformationActivity.class);
                startActivity(intent);
            }

        Button areaBtn = (Button)findViewById(R.id.areaButton);



        Button levelBtn = (Button)findViewById(R.id.levelButton);


    });
}
}


