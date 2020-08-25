package de.gothaer.diezweite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MyServiceTest {
	@Mock
	private MyDependency dependencyMock;
	@InjectMocks
	private MyService objectUnderTest;
	
	@Test()
	public void test() {
		//when(dependencyMock.query()).thenReturn(42);
		
		//doNothing().when(dependencyMock).transaction(anyInt());
		//doThrow(new IllegalArgumentException()).when(dependencyMock).transaction(anyInt());
		
		when(dependencyMock.both(anyInt())).thenReturn(42);
		
		assertEquals(42, objectUnderTest.foo());
		
		verify(dependencyMock).both(4711);
	}

}
