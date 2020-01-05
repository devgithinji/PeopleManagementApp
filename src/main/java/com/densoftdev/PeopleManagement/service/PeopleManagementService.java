package com.densoftdev.PeopleManagement.service;

import com.densoftdev.PeopleManagement.dao.PeopleManagementDao;
import com.densoftdev.PeopleManagement.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleManagementService {

    @Autowired
    private PeopleManagementDao peopleManagementDao;
    public Person createPerson(Person person1) {
        return  peopleManagementDao.save(person1);
    }

    public Iterable<Person> createPersons(List<Person> personList) {

        Iterable<Person> list =  peopleManagementDao.saveAll(personList);

        return list;
    }

    public Iterable<Person> getPersonsByIds(List<Integer> ids) {

        return peopleManagementDao.findAllById(ids);
    }

    public void deletePersonEntity(Person person) {
        peopleManagementDao.delete(person);
    }

    public void updatePersonEmailById(int id, String newEmail) {
        Optional<Person> person = peopleManagementDao.findById(id);

        Person personFromDb = person.get();

        if (id == personFromDb.getId()){
            personFromDb.setEmail(newEmail);
        }

        peopleManagementDao.save(personFromDb);
    }
}
