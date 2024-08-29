package com.example.mydemo;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.mydemo.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText courseName, courseTracks, courseDuration, courseDesc;
    private Button addcourse;
    private  DbHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseName = findViewById(R.id.coursename);
        courseTracks = findViewById(R.id.courseTracks);
        courseDuration = findViewById(R.id.courseDuration);
        courseDesc = findViewById(R.id.coursedesc);
        addcourse = findViewById(R.id.addcourse);
        dbHandler = new DbHandler(MainActivity.this);
        addcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cName = courseName.getText().toString();
                String cTracks = courseTracks.getText().toString();
                String cDesc = courseDesc.getText().toString();
                String cDuration = courseDuration.getText().toString();
                // validation
                if(cName.isEmpty() && cDesc.isEmpty() && cDuration.isEmpty() && cTracks.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Enter all the data", Toast.LENGTH_SHORT).show();
                    return;
                }
                dbHandler.addNewCourse(cName, cDuration, cDesc, cTracks);
                Toast.makeText(MainActivity.this, "Course Added Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

