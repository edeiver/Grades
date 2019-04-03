package com.example.grades;

public class Student {
    private String ID;
    private String Name;
    private String LastName;
    private String Grade1;
    private String Grade2;
    private String Grade3;

    public Student(String ID, String name, String lastName, String grade1, String grade2, String grade3) {
        this.ID = ID;
        Name = name;
        LastName = lastName;
        Grade1 = grade1;
        Grade2 = grade2;
        Grade3 = grade3;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGrade1() {
        return Grade1;
    }

    public void setGrade1(String grade1) {
        Grade1 = grade1;
    }

    public String getGrade2() {
        return Grade2;
    }

    public void setGrade2(String grade2) {
        Grade2 = grade2;
    }

    public String getGrade3() {
        return Grade3;
    }

    public void setGrade3(String grade3) {
        Grade3 = grade3;
    }

    public void SaveStudent(){Data.Save(this);}
}
