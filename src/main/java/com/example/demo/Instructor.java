package com.example.demo;


public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        Integer counter = 0;

        for(Learner learner : learners) {
            counter++;
        }

        for(Learner learner : learners) {
            learner.learn(numberOfHours / counter);
        }
    }
}
