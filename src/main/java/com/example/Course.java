package com.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseID;
    private List<Student> students;

    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.students = new ArrayList<Student>();
        // TODO: Initialize the attributes
    }

    public String getCourseName(){
        return this.courseName;
    }

    public String getCourseID(){
        return this.courseID;
    }

    public List<Student> getStudents(){
        return this.students;
    }

    public void enrollStudent(Student student){
        this.students.add(student);
    }
    
    public List<Student> getStudentsList(){
        return this.students;
    }
    // TODO: Implement methods to enroll a student and drop a student
}
