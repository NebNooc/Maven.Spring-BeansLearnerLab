package com.example.demo;

public class Classroom {

    private Students students;
    private Instructor instructor;

    public Classroom(Students students, Instructor instructor) {
        this.students = students;
        this.instructor = instructor;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture(students, numberOfHours);
    }
}
