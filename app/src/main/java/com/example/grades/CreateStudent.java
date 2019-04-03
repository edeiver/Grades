package com.example.grades;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateStudent  extends AppCompatActivity{
    private EditText Name, LastName, Grade1, Grade2,Grade3, Id;
    private Resources Resources;
    private ArrayList<Student> students;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_student);

        Name = (EditText)findViewById(R.id.TxtNameCreate);
        LastName = (EditText)findViewById(R.id.TxtLastNameCreate);
        Grade1 = (EditText)findViewById(R.id.TxtGrade1Create);
        Grade2 = (EditText)findViewById(R.id.TxtGrade2Create);
        Grade3 = (EditText)findViewById(R.id.TxtGrade3Create);
        Id = (EditText)findViewById(R.id.TxtID);



            Resources = this.getResources();
            students = Data.Get();



    }
    public void Save(View view) {
        if (Name.getText().length() == 0 || LastName.getText().length() == 0 || Grade1.getText().length() == 0 || Grade2.getText().length() == 0 || Grade3.getText().length() == 0 || Id.getText().length() == 0) {
            Toast.makeText(this, R.string.error, Toast.LENGTH_LONG).show();

        } else {
            String NameV, LastNameV, Grade1V, Grade2V, Grade3V, IDV;
            IDV = Id.getText().toString();
            NameV = Name.getText().toString();
            LastNameV = LastName.getText().toString();
            Grade1V = Grade1.getText().toString();
            Grade2V = Grade2.getText().toString();
            Grade3V = Grade3.getText().toString();

            Student s = new Student(IDV, NameV, LastNameV, Grade1V, Grade2V, Grade3V);
            s.SaveStudent();
            Toast.makeText(this, R.string.done, Toast.LENGTH_LONG).show();

        }
    }


}
