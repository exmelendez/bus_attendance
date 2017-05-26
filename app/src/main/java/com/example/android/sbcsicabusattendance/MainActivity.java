package com.example.android.sbcsicabusattendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button amArrival, pmDeparture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amArrival = (Button) findViewById(R.id.am_attendance_btn);
        pmDeparture = (Button) findViewById(R.id.pm_attendance_btn);

        amArrival.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AmAttendance.class);
                startActivity(intent);
            }
        });

        pmDeparture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PmAttendance.class);
                startActivity(intent);
            }
        });

    }

    void toastMsg(View v, String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
