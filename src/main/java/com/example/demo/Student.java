package com.example.demo;

public class Student extends Person implements Learner {

    private Double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    public void learn(Double totalStudyTime) {
        this.totalStudyTime += totalStudyTime;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
