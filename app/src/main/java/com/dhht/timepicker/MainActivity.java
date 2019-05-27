package com.dhht.timepicker;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.dhht.library.CalendarDay;
import com.dhht.library.MaterialCalendarView;
import com.dhht.library.OnDateSelectedListener;

import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {


    MaterialCalendarView mCalendarView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCalendarView = findViewById(R.id.calendarView);
        mCalendarView.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                Toast.makeText(MainActivity.this, date.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
