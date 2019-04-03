package com.example.grades;

import java.util.ArrayList;

public class Data {
private static ArrayList<Student> Students = new ArrayList<>();
public static void Save(Student s){Students.add(s);}
public static ArrayList<Student> Get(){return Students;}
}
