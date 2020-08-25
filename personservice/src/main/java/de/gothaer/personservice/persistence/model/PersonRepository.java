package de.gothaer.personservice.persistence.model;

import java.util.List;

public interface PersonRepository {
	
	
	public void save(Person p); 
	public void update(Person p);
	public void delete(Person p);
	
	public Person findById(String id);
	public List<Person> findAll();
	
	

}
