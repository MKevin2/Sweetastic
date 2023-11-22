package com.example.sweetastic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SensorActivity extends AppCompatActivity implements
    SensorEventListener {
        private SensorManager sensor_m;
        private Sensor sensor;
        private TextView txt_luz;
        ImageView docinhoini;

        SensorEventListener sensorEventListener;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);

        sensor_m = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensor_m.getDefaultSensor(Sensor.TYPE_LIGHT);
        sensor_m.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
        docinhoini = findViewById(R.id.docinho_home);

        txt_luz = (TextView) findViewById(R.id.id_luz);

        if(sensor==null)
            finish();
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent){
        Sensor meuSensor = sensorEvent.sensor;
        if(meuSensor.getType() == Sensor.TYPE_LIGHT){
            float luz = sensorEvent.values[0];
            txt_luz.setText("Quantidade de Luz: " + luz);

            if (luz < 10){
                txt_luz.setBackgroundColor(Color.rgb(0,0,0));
                txt_luz.setTextColor(Color.rgb(100,205,100));
            } else if (luz >= 10 && luz <= 20) {
                txt_luz.setBackgroundColor(Color.rgb(0,0,0));
                txt_luz.setTextColor(Color.rgb(205,155,209));
            } else if (luz > 20 && luz <= 30){
                txt_luz.setBackgroundColor(Color.rgb(0,0,0));
                txt_luz.setTextColor(Color.rgb(211,155,100));
            } else if (luz > 30 && luz <= 40) {
                txt_luz.setBackgroundColor(Color.rgb(0, 0, 0));
                txt_luz.setTextColor(Color.rgb(209, 175, 200));
            }else if (luz > 40 && luz <= 60){
                txt_luz.setBackgroundColor(Color.rgb(0,0,0));
                txt_luz.setTextColor(Color.rgb(109,255,205));
            } else if (luz > 60 && luz <= 100){
                txt_luz.setBackgroundColor(Color.rgb(0,0,0));
                txt_luz.setTextColor(Color.rgb(155,205,205));
            } else if (luz > 100 && luz <= 200){
                txt_luz.setBackgroundColor(Color.rgb(0,0,0));
                txt_luz.setTextColor(Color.rgb(255,100,200));
            } else if (luz > 200 && luz <= 500){
                txt_luz.setBackgroundColor(Color.rgb(0,0,0));
                txt_luz.setTextColor(Color.rgb(155,100,255));
            } else if (luz > 500 && luz <= 1000){
                txt_luz.setBackgroundColor(Color.rgb(0,0,0));
                txt_luz.setTextColor(Color.rgb(205,110,110));
            } else if (luz > 1000 && luz <= 2000){
                txt_luz.setBackgroundColor(Color.rgb(0,0,0));
                txt_luz.setTextColor(Color.rgb(205,50,50));
            } else if (luz > 2000){
                txt_luz.setBackgroundColor(Color.rgb(0,0,0));
                txt_luz.setTextColor(Color.rgb(255,0,00));
            }
        }

    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    public void paraMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}