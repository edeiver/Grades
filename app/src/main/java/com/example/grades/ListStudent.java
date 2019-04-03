package com.example.grades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListStudent extends AppCompatActivity {
    private ListView LV;
    private ArrayList<Student> Students;
    private ArrayList<String> StudentNames;
    private Intent In;
    private TextView TxtNoResults;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_list);

        LV=(ListView)findViewById(R.id.LVStudent);
        TxtNoResults = (TextView)findViewById(R.id.TxtNoResults);
        Students = Data.Get();
        StudentNames= new ArrayList<String>();
        TxtNoResults.setVisibility(View.VISIBLE);
        LV.setVisibility(View.INVISIBLE);

        if (Students.size()>0){
            LV.setVisibility(View.VISIBLE);
            TxtNoResults.setVisibility(View.INVISIBLE);
            for (int i = 0; i < Students.size() ; i++){
                StudentNames.add(Students.get(i).getID()+" "+Students.get(i).getName()+" "+Students.get(i).getLastName()+" "
                +Students.get(i).getGrade1()+" "+ Students.get(i).getGrade2()+" "+Students.get(i).getGrade3());
            }

        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, StudentNames);
        LV.setAdapter(adapter);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                In = new Intent(ListStudent.this, StudentDetail.class);
                In.putExtra("position", position);
                startActivity(In);
            }
        });
    }


}
