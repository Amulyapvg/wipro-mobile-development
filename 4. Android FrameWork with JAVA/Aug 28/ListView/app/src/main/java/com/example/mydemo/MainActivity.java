package com.example.mydemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText courseName, courseTracks, courseDuration, courseDesc;
    private Button addCourse;
    private DbHandler dbHandler;
    private RecyclerView coursesRecyclerView;
    private CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseName = findViewById(R.id.coursename);
        courseTracks = findViewById(R.id.courseTracks);
        courseDuration = findViewById(R.id.courseDuration);
        courseDesc = findViewById(R.id.coursedesc);
        addCourse = findViewById(R.id.addcourse);
        coursesRecyclerView = findViewById(R.id.coursesRecyclerView);

        dbHandler = new DbHandler(MainActivity.this);

        addCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cName = courseName.getText().toString();
                String cTracks = courseTracks.getText().toString();
                String cDesc = courseDesc.getText().toString();
                String cDuration = courseDuration.getText().toString();

                // Validation
                if (cName.isEmpty() || cDesc.isEmpty() || cDuration.isEmpty() || cTracks.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Enter all the data", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Add course to database
                dbHandler.addNewCourse(cName, cDuration, cDesc, cTracks);
                Toast.makeText(MainActivity.this, "Course Added Successfully", Toast.LENGTH_SHORT).show();

                // Update the RecyclerView
                displayCourses();
            }
        });

        // Display courses in RecyclerView on startup
        displayCourses();
    }

    private void displayCourses() {
        ArrayList<CourseModel> courseList = dbHandler.getAllCourses();

        // Setup RecyclerView
        coursesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        courseAdapter = new CourseAdapter(courseList, this);
        coursesRecyclerView.setAdapter(courseAdapter);
    }
}