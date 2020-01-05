package com.densoftdev.PeopleManagement;

import com.densoftdev.PeopleManagement.entities.Person;
import com.densoftdev.PeopleManagement.service.PeopleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PeopleManagementAppApplication implements CommandLineRunner {

    @Autowired
    private PeopleManagementService peopleManagementService;

    public static void main(String[] args) {
        SpringApplication.run(PeopleManagementAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //createPerson();
        //createPersons();
        //getPersonsByIds();
        //deletePersonEntity();
        updatePersonEmailById();
    }

    private void updatePersonEmailById() {
        peopleManagementService.updatePersonEmailById(1,"githinji@gmail.com");
    }

    private void deletePersonEntity() {
        Person person = new Person();
        person.setId(3);
        peopleManagementService.deletePersonEntity(person);
    }

    private void getPersonsByIds() {
        List<Integer> ids = new ArrayList<>();
        ids.add(2);
        ids.add(3);
        ids.add(20);
        Iterable<Person> personList = peopleManagementService.getPersonsByIds(ids);

        System.out.println(personList);
    }

    private void createPersons() {
        List<Person> personList = Arrays.asList(new Person("fiona","wambui","wambui@gmail.com",new Date()),new  Person("jane","waithira","waithira@gmail.com", new Date()));
        Iterable<Person> createpersons = peopleManagementService.createPersons(personList);
        for (Person person : createpersons){
            System.out.println(person);
        }
    }

    private void createPerson() {
        Person person1 = new Person("mark","githinji","wakahiad@gmail.com",new Date());
        Person personDb =peopleManagementService.createPerson(person1);
        System.out.println(personDb);
    }
}
