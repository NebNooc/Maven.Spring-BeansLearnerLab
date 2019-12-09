package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {

    @Autowired
    @Qualifier("bestCohort")
    Classroom bestCohort;

    @Autowired
    @Qualifier("mehCohort")
    Classroom mehCohort;

    @Test
    public void checkStudentsTest() {
        Integer expected = 5;

        Integer actualBest = bestCohort.getStudents().size();
        Integer actualMeh = mehCohort.getStudents().size();

        Assert.assertEquals(expected, actualBest);
        Assert.assertEquals(expected, actualMeh);
    }

    @Test
    public void checkInstructorsTest() {
        Integer expected = 5;

        Integer actualBest = bestCohort.getInstructors().size();
        Integer actualMeh = mehCohort.getInstructors().size();

        Assert.assertEquals(expected, actualBest);
        Assert.assertEquals(expected, actualMeh);
    }
}
