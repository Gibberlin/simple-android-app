package com.example.log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView time, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date = findViewById(R.id.date);
        time = findViewById(R.id.time);

        Date currentTime = Calendar.getInstance().getTime();
        String FormattedDate= DateFormat.getDateInstance(DateFormat.FULL).format(currentTime);
        String Formattedtm= DateFormat.getTimeInstance().format(currentTime);
        time.setText(Formattedtm);
        date.setText(FormattedDate);



    }
}