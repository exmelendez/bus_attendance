package com.example.android.sbcsicabusattendance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class AmAttendance extends AppCompatActivity {

    private static final String TAG = "AmAttendance";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_am_attendance);
        Log.d(TAG, "onCreate: Started.");

        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the student objects
        Student john_glenn = new Student("Glenn", "John", "3rd", "302", "Danny Tanner", "345-685-8657");
        Student rebececca_stamos = new Student("Stamos", "Rebecca", "5th", "501", "James Brown", "317-845-9871");
        Student luis_ayala = new Student("Ayala", "Luis", "4th", "403", "Carmen Hey", "646-212-9991");

        //Add the Person objects to an ArrayList
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(john_glenn);
        studentList.add(rebececca_stamos);
        studentList.add(luis_ayala);

        StudentListAdapter adapter = new StudentListAdapter(this, R.layout.student_adapter_view_layout, studentList);
        mListView.setAdapter(adapter);

    }
}
