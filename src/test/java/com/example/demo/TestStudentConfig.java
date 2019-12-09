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
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    Students prevStudents;


    @Test
    public void prevStudentsBeanClearTest() {
        prevStudents.clear();

        Integer expected = 0;
        Integer actual = prevStudents.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void studentsBeanAddAll() {
        students.addAll(prevStudents);

        Integer expected = 10;
        Integer actual = students.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void prevStudentsBeanFindByID() {
        Student student = prevStudents.findById(444L);

        String expected = "Red";
        String actual = student.getName();

        Assert.assertEquals(expected, actual);
    }
}
