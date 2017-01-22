package com.example.pvs.snownote;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //load image resource from drawable
        Bitmap bmap = BitmapFactory.decodeResource(getResources(), R.drawable.titletop);
        //Bitmap bMapScaled = Bitmap.createScaledBitmap(bmap, 800, 400, true);

        ImageView image = (ImageView) findViewById(R.id.startlogo);
        image.setImageBitmap(bmap);
    }
}
