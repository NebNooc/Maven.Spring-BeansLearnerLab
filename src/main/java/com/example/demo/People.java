package com.example.demo;

import java.util.Iterator;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType> {

    private List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType personType) {
        personList.add(personType);
    }

    public void remove(PersonType personType) {
        personList.remove(personType);
    }

    public void remove(String name) {
        personList.removeIf(p -> (p.getName().equals(name)));
    }

    public void remove(Long id) {
        personList.removeIf(p -> (p.getId().equals(id)));
    }

    public Integer size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> iterable) {
        iterable.forEach(p -> personList.add(p));
    }

    public PersonType findById(Long id) {
        return personList.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public List<PersonType> findAll() {
        return this.personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
