package de.gothaer.personservice.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import de.gothaer.personservice.persistence.model.Person;
import de.gothaer.personservice.persistence.model.PersonRepository;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceImplTest {
	@Mock
	private PersonRepository repositoryMock;
	@InjectMocks
	private PersonServiceImpl objectUnderTest;
	
	
	@Test
	public void speichern_personParameterisNull_throwsPersonenServiceException()  {
		try {
			objectUnderTest.speichern(null);
			fail("Exception expected");
		} catch (PersonServiceException e) {
			assertEquals("person must not be null", e.getMessage());
		}
	}


	@Test
	public void speichern_vornameIsNull_throwsPersonenServiceException()  {
		try {
			final Person person = new Person(null,"Doe");
			objectUnderTest.speichern(person);
			fail("Exception expected");
		} catch (PersonServiceException e) {
			assertEquals("firstname to short", e.getMessage());
		}
	}

	@Test
	public void speichern_vornameTooShort_throwsPersonenServiceException()  {
		try {
			final Person person = new Person("J","Doe");
			objectUnderTest.speichern(person);
			fail("Exception expected");
		} catch (PersonServiceException e) {
			assertEquals("firstname to short", e.getMessage());
		}
	}

}
