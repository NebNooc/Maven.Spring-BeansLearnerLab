package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean(name = "bestCohort")
    @DependsOn({"students", "instructors"})
    public Classroom currentCohort(Students students, Instructors instructors) {
        return new Classroom(students, instructors);
    }

    @Bean(name = "mehCohort")
    @DependsOn({"previousStudents", "instructors"})
    public Classroom previousCohort(Students students, Instructors instructors) {
        return new Classroom(students, instructors);
    }
}
