package com.densoftdev.PeopleManagement.dao;

import com.densoftdev.PeopleManagement.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PeopleManagementDao extends CrudRepository<Person,Integer> {
}
