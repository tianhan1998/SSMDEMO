package mapper;

import entity.Person;

import java.util.List;

public interface PersonMapper {
    void addPerson(Person a);
    void deletePerson(int id);
    void updatePerson(Person a);
    Person findById(int id);
    List<Person> selectList();
}
