package de.gothaer.personservice.services;

import de.gothaer.personservice.persistence.model.Person;
import de.gothaer.personservice.persistence.model.PersonRepository;

public class PersonServiceImpl {
	
	private final PersonRepository repository;

	public PersonServiceImpl(PersonRepository repository) {
		this.repository = repository;
	}
	
	
	/*
	 * 
	 * 1. parameter darf nicht null sein -> PersonServiceException
	 * 2. vorname darf nicht null sein -> PersonServiceException
	 * 3. vorname muss min 2 Zeichen -> PersonServiceException
	 * dasselbe für Nachname
	 * 6. Vorname darf nicht Attila sein -> PersonServiceException 
	 * 
	 * 7. wenn Repository Exception auslöst  -> PersonServiceException 
	 * 8. save aufgerufen 
	 */
	
	public void speichern(Person person) throws PersonServiceException{
		if(person == null)
			throw new PersonServiceException("person must not be null");
		
		if(person.getVorname() == null || person.getVorname().length() < 2)
			throw new PersonServiceException("firstname to short");
	}
}
