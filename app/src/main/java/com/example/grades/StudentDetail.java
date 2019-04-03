package com.example.grades;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentDetail extends AppCompatActivity {
    private Intent In;
    private ArrayList<Student> Students;
    private TextView Name, Grade1, Grade2, Grade3, Total, LastName, Id;
    Double g1, g2,g3, total =0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_detail);

        In = getIntent();
        Students=Data.Get();

        int Position = In.getIntExtra("position", 0);
        Id = (TextView)findViewById(R.id.txtID);
        Name = (TextView)findViewById(R.id.TxtStudentName);
        LastName = (TextView)findViewById(R.id.TxtLastName);
        Grade1 = (TextView)findViewById(R.id.TxTGrade1);
        Grade2 = (TextView)findViewById(R.id.TxtGrade2);
        Grade3 = (TextView)findViewById(R.id.TxtGrade3);
        Total = (TextView)findViewById(R.id.TxtTotal);


        loadData(Students.get(Position));

    }
    public Double def(){
        String  Grade1V, Grade2V, Grade3V;
        Grade1V = Grade1.getText().toString();
        Grade2V = Grade2.getText().toString();
        Grade3V= Grade3.getText().toString();

        g1=Double.parseDouble(Grade1V);
        g2=Double.parseDouble(Grade2V);
        g3=Double.parseDouble(Grade3V);
        total=((g1+g2+g3)/3);
       return total;

    }

    private void loadData(Student Student){
        Id.setText(Student.getID());
        Name.setText(Student.getName());
        LastName.setText(Student.getLastName());
        Grade1.setText(Student.getGrade1());
        Grade2.setText(Student.getGrade2());
        Grade3.setText(Student.getGrade3());
        Total.setText(def().toString());

    }
}
