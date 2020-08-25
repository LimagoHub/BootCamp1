package de.gothaer.personservice.services;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import java.util.List;

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
	
	@Mock
	private List<String> antipathenMock;
	
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

	@Test
	public void speichern_nachnameIsNull_throwsPersonenServiceException()  {
		try {
			final Person person = new Person("John",null);
			objectUnderTest.speichern(person);
			fail("Exception expected");
		} catch (PersonServiceException e) {
			assertEquals("lastname to short", e.getMessage());
		}
	}

	@Test
	public void speichern_nachnameTooShort_throwsPersonenServiceException()  {
		try {
			final Person person = new Person("John","D");
			objectUnderTest.speichern(person);
			fail("Exception expected");
		} catch (PersonServiceException e) {
			assertEquals("lastname to short", e.getMessage());
		}
	}

	@Test
	public void speichern_Antipath_throwsPersonenServiceException()  {
		try {
			
			when(antipathenMock.contains(anyString())).thenReturn(true);
			
			final Person person = new Person();
			objectUnderTest.speichern(person);
			fail("Exception expected");
		} catch (PersonServiceException e) {
			assertEquals("Antipath", e.getMessage());
		}
	}

	@Test
	public void speichern_RuntimeExceptionInUnderlyingService_throwsPersonenServiceException()  {
		try {
			doThrow(new ArrayIndexOutOfBoundsException()).when(repositoryMock).save((Person) anyObject());
			
			final Person person = new Person();
			objectUnderTest.speichern(person);
			fail("Exception expected");
		} catch (PersonServiceException e) {
			assertEquals("Service not available", e.getMessage());
		}
	}

	@Test
	public void speichern_HappyDay_success()  throws Exception{
		
			final Person person = new Person();
			objectUnderTest.speichern(person);
			
			assertNotNull(person.getId());
			
			verify(repositoryMock).save(person);
	}

}
