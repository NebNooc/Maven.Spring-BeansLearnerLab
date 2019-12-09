package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Qualifier("previousStudents")
    @Autowired
    private Students prevCohort;

    @Autowired
    private Instructors instructors;

    @PostConstruct
    public void executeBootCamp(Students prevCohort, Instructors instructors) {
        instructors.forEach(p -> p.lecture(prevCohort, 1200.0));
    }

    public Students getPrevCohort() {
        return prevCohort;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
