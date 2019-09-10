package service.impl;

import entity.Person;
import mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PersonService;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;
    @Override
    public void addPerson(Person a) {
        personMapper.addPerson(a);
    }

    @Override
    public void deletePerson(int id) {
        personMapper.deletePerson(id);
    }

    @Override
    public void updatePerson(Person a) {
        personMapper.updatePerson(a);
    }

    @Override
    public Person findById(int id) {
        return personMapper.findById(id);
    }

    @Override
    public List<Person> selectList() {
        return personMapper.selectList();
    }
}
