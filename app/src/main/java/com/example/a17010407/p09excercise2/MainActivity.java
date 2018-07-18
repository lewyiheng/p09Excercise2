package com.example.a17010407.p09excercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<employeeStuff> alEstuff;
    CustomAdapter caStaff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.ListViewStaff);

        alEstuff = new ArrayList<>();
        employeeStuff guy1 = new employeeStuff("John","Software Technical Leader","3400.0");
        employeeStuff guy2 = new employeeStuff("May","Programmer","2200.0");

        alEstuff.add(guy1);
        alEstuff.add(guy2);

        caStaff = new CustomAdapter(this, R.layout.employeeinfo, alEstuff);
        lvEmployee.setAdapter(caStaff);    }
}
