package de.gothaer.personservice.services;

import java.util.List;
import java.util.UUID;

import de.gothaer.personservice.persistence.model.Person;
import de.gothaer.personservice.persistence.model.PersonRepository;

public class PersonServiceImpl {
	
	private final PersonRepository repository;
	private final List<String> antipathen;

	public PersonServiceImpl(final PersonRepository repository, List<String> antipathen) {
		this.repository = repository;
		this.antipathen = antipathen;
	}
	
	
		
	public void speichern(Person person) throws PersonServiceException{
		try {
			checkPerson(person);
			person.setId(UUID.randomUUID().toString());
			repository.save(person);
		} catch (RuntimeException e) {
			throw new PersonServiceException("Service not available");
		}
	}


	private void checkPerson(Person person) throws PersonServiceException {
		validatePerson(person);
		businessCheck(person);
	}


	private void businessCheck(Person person) throws PersonServiceException {
		if(antipathen.contains(person.getVorname()))
			throw new PersonServiceException("Antipath");
	}


	private void validatePerson(Person person) throws PersonServiceException {
		if(person == null)
			throw new PersonServiceException("person must not be null");
		
		if(person.getVorname() == null || person.getVorname().length() < 2)
			throw new PersonServiceException("firstname to short");
		if(person.getNachname() == null || person.getNachname().length() < 2)
			throw new PersonServiceException("lastname to short");
	}
}
