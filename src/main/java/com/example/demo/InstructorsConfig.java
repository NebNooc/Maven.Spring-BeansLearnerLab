package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {

    @Bean(name = "usaInstructors")
    public Instructors tcUSAInstructors() {
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(100L, "Ms. Puff"      ));
        instructorList.add(new Instructor(200L, "Ms. Bitters"   ));
        instructorList.add(new Instructor(300L, "Oogway"        ));
        instructorList.add(new Instructor(400L, "Zordon"        ));
        instructorList.add(new Instructor(500L, "Aslan the Lion"));

        return new Instructors(instructorList);
    }

    @Bean(name = "ukInstructors")
    public Instructors tcUKInstructors() {
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(600L,  "Dr. Who"          ));
        instructorList.add(new Instructor(700L,  "Dr. Holmes"       ));
        instructorList.add(new Instructor(800L,  "Prof. Moriarty"   ));
        instructorList.add(new Instructor(900L,  "Mr. Bean"         ));
        instructorList.add(new Instructor(1000L, "Gordon Ramsey"    ));

        return new Instructors(instructorList);
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors zipCodeInstructors() {
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(121L,"Frolian"));
        instructorList.add(new Instructor(232L,"Roberto"));
        instructorList.add(new Instructor(343L,"Dolio"  ));
        instructorList.add(new Instructor(454L,"Nobles" ));
        instructorList.add(new Instructor(565L,"Kris"   ));

        return new Instructors(instructorList);
    }
}
