package com.example.zad4jsf.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.zad4jsf.domain.Person;

@ApplicationScoped
public class PersonManager {
	private List<Person> db = new ArrayList<Person>();

	public void addPerson(Person person) {
		Person newPerson = new Person();

		newPerson.setFirstName(person.getFirstName());
		newPerson.setLastName(person.getLastName());
		newPerson.setPin(person.getPin());
		newPerson.setDateOfBirth(person.getDateOfBirth());
		newPerson.setAddress(person.getAddress());
		newPerson.setPhoneNumber(person.getPhoneNumber());
		newPerson.setWeight(person.getWeight());
		newPerson.setHeight(person.getHeight());
		newPerson.setDateOfRegister(person.getDateOfRegister());

		db.add(newPerson);
	}


	public void deletePerson(Person person) {
		Person personToRemove = null;
		for (Person p : db) {
			if (person.getPin().equals(p.getPin())) {
				personToRemove = p;
				break;
			}
		}
		if (personToRemove != null)
			db.remove(personToRemove);
	}

	public List<Person> getAllPersons() {
		return db;
	}
}
