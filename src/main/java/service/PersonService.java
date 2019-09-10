package service;

import entity.Person;

import java.util.List;

public interface PersonService {
    void addPerson(Person a);
    void deletePerson(int id);
    void updatePerson(Person a);
    Person findById(int id);
    List<Person> selectList();
}
