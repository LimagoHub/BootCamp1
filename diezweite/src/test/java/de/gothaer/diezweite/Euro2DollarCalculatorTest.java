package de.gothaer.diezweite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.rmi.RemoteException;

@RunWith(MockitoJUnitRunner.class)
public class Euro2DollarCalculatorTest {
	@Mock
	private WechselkursService wechselkursServiceMock;
	@InjectMocks
	private Euro2DollarCalculator objectUnderTest;
	
	@Test(expected = CalculatorException.class)
	public void calculate_ExceptionFromUnderlyingService_throwsCalulatorException() throws Exception {
		when(wechselkursServiceMock.getKurs(anyString())).thenThrow(new RemoteException());
		
		objectUnderTest.calculate(1000);
	}

	@Test
	public void calculate_happyDay_returnsCalculated() throws Exception {
		when(wechselkursServiceMock.getKurs(anyString())).thenReturn(1.1);
		
		assertEquals(1100.0, objectUnderTest.calculate(1000), 0.0000001);
		
		verify(wechselkursServiceMock).getKurs("usd");
	}

}
