package com.isai.examen1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {

    SeekBar barOpacity;
    TextView image;
    TextView textOpacitySetting;
    ListView listViewColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (TextView)findViewById(R.id.image);
        textOpacitySetting = (TextView)findViewById(R.id.opacitysetting);
        barOpacity = (SeekBar)findViewById(R.id.opacity);

        int alpha = barOpacity.getProgress();
        textOpacitySetting.setText(String.valueOf(alpha));
        image.setAlpha(alpha);

        barOpacity.setOnSeekBarChangeListener(barOpacityOnSeekBarChangeListener);
    }

    OnSeekBarChangeListener barOpacityOnSeekBarChangeListener =
            new OnSeekBarChangeListener(){

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress,
                                              boolean fromUser) {
                    int alpha = barOpacity.getProgress();
                    textOpacitySetting.setText(String.valueOf(alpha));

                    image.setAlpha(alpha/100f);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {}

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {}

            };



}