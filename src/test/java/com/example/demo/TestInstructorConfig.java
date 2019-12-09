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
public class TestInstructorConfig {

    @Autowired
    @Qualifier("usaInstructors")
    Instructors usaInstructors;

    @Autowired
    @Qualifier("ukInstructors")
    Instructors ukInstructors;

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;


    @Test
    public void usaInstructorsBeanClearTest() {
        usaInstructors.clear();

        Integer expected = 0;
        Integer actual = usaInstructors.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void beanAddAll() {
        usaInstructors.addAll(ukInstructors);
        usaInstructors.addAll(instructors);

        Integer expected = 15;
        Integer actual = usaInstructors.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instructorsBeanFindByID() {
        Instructor instructor = instructors.findById(454L);

        String expected = "Nobles";
        String actual = instructor.getName();

        Assert.assertEquals(expected, actual);
    }
}
