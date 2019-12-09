package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(117L,"John" ));
        studentList.add(new Student(999L,"Peach"));
        studentList.add(new Student(222L,"Mario"));
        studentList.add(new Student(333L,"Link" ));
        studentList.add(new Student(111L,"Grimm"));

        return new Students(studentList);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        List<Student> previousList = new ArrayList<>();
        previousList.add(new Student(444L,"Red"     ));
        previousList.add(new Student(555L,"Grandma" ));
        previousList.add(new Student(666L,"Wolf"    ));
        previousList.add(new Student(777L,"Goldie"  ));
        previousList.add(new Student(888L,"Jack"    ));

        return new Students(previousList);
    }


}
