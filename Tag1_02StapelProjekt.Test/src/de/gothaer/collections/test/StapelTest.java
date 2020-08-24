package de.gothaer.collections.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.gothaer.collections.Stapel;
import de.gothaer.collections.StapelException;

class StapelTest {
	
	private Stapel objectUnderTest;
	
	
	@BeforeEach
	void setUp() {
		objectUnderTest = new Stapel();
	}

	@Test
	void isEmpty_EmptyStack_returnsTrue() {
		
		
		boolean ergebnis = objectUnderTest.isEmpty();
		
		assertTrue(ergebnis);
	}

	@Test
	void isEmpty_NotEmptyStack_returnsFalse() throws Exception{
		
		objectUnderTest.push(10);
		
		boolean ergebnis = objectUnderTest.isEmpty();
		
		assertFalse(ergebnis);
	}

	@Test
	void isEmpty_WiederLeererStack_returnsTrue() throws Exception{
	
		objectUnderTest.push(10);
		objectUnderTest.pop();
		boolean ergebnis = objectUnderTest.isEmpty();
		
		assertTrue(ergebnis);
	}
	
	@Test
	void push_emptyStack_valueIsStoredInStack() throws Exception{
		// Arrange
		final int a = 10;
		
		// Action
		objectUnderTest.push(a);
		
		// Assertion
		assertEquals(a, objectUnderTest.pop());
		
	}
	

	
	@Test
	void push_stackOverflow_throwsStapelException() {

		try {
			fillUpToLimit();
			
			//Action
			objectUnderTest.push(10);
			
			
			fail("Upps");
		} catch (StapelException e) {
			assertEquals("Overflow", e.getMessage());
		}
		
		
	}
	@Test
	void push_toUpperLimit_noExceptionIsThrown() throws Exception{

		fillUpToLimit();
		
		// Assertion
		// noException is excpected
		
	}
	
	@Test
	void push_overflow_throwsStapelException_Alternative() throws Exception{

		
			fillUpToLimit();
			
			assertThrows(StapelException.class, ()->objectUnderTest.push(10));
		
	}

	private void fillUpToLimit() throws StapelException {
		for (int i = 0; i < 10; i++) {
			objectUnderTest.push(i);
		}
	}

	
	
	

}
