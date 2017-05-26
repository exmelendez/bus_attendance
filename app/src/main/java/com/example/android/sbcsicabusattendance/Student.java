package com.example.android.sbcsicabusattendance;

public class Student {

    private String lastName, firstName, grade, parentName, parentPhone, legalClass;

    public Student(String lastName, String firstName, String grade, String legalClass, String parentName,
                   String parentPhone) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.grade = grade;
        this.legalClass = legalClass;
        this.parentName = parentName;
        this.parentPhone = parentPhone;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getLegalClass() {
        return legalClass;
    }

    public void setLegalClass(String legalClass) {
        this.legalClass = legalClass;
    }
}