package de.gothaer.bestelldemo.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import de.gothaer.bestelldemo.persistence.BestellRepository;
import de.gothaer.bestelldemo.persistence.model.Bestellung;

@RunWith(MockitoJUnitRunner.class)
public class BestellServiceImplTest {
	private static final Bestellung VALID_ORDER = new Bestellung();

	private static final double VALID_AMOUNT = 10.0;

	private static final String VALID_MASTERCARD_NUMBER = "M0123456789";
	private static final String VALID_VISACARD_NUMBER = "V0123456789";

	@Mock
	private CreditcardService creditcardServiceMock;

	@Mock
	private BestellRepository repositoryMock;
	
	@InjectMocks
	private BestellServiceImpl objectUnderTest;
	
	
	@Test
	public void bestellen_BestellungNull_throwsBestellservicesException() throws Exception{
		try {
			objectUnderTest.bestellen(null, VALID_MASTERCARD_NUMBER, VALID_AMOUNT);
			fail("upps");
		} catch (BestellServiceException e) {
			assertEquals("Bestellung darf nicht null sein.", e.getMessage());
		} 
	}
	
	@Test(expected=BestellServiceException.class)
	public void bestellen_WrongCreditCardFormattooShort_throwsBestellServiceException() throws Exception{
		
		objectUnderTest.bestellen(VALID_ORDER,"M012345678", VALID_AMOUNT);
	}
	
	@Test(expected=BestellServiceException.class)
	public void bestellen_WrongCreditCardFormattooLong_throwsBestellServiceException() throws Exception{
		
		objectUnderTest.bestellen(VALID_ORDER,"M01234567890", VALID_AMOUNT);
	}
	
	@Test(expected=BestellServiceException.class)
	public void bestellen_WrongCreditCardFormatNeitherVisaNorMaster_throwsBestellServiceException() throws Exception{
		
		objectUnderTest.bestellen(VALID_ORDER,"X0123456789", VALID_AMOUNT);
	}
	
	@Test(expected=BestellServiceException.class)
	public void bestellen_WrongCreditCardFormatNumberContainsCharacters_throwsBestellServiceException() throws Exception{
		
		objectUnderTest.bestellen(VALID_ORDER,"M012345678x", VALID_AMOUNT);
	}
	
	@Test(expected=BestellServiceException.class)
	public void bestellen_AmountNegative_throwsBestellServiceException() throws Exception{
		
		objectUnderTest.bestellen(VALID_ORDER,VALID_MASTERCARD_NUMBER, -10.0);
	}
	
	@Test
	public void bestellen_CreditcardServiceCall_ValidParametersPassed() throws Exception{
		when(creditcardServiceMock.check(anyString(), anyString(), anyDouble())).thenReturn(true);
		objectUnderTest.bestellen(VALID_ORDER,VALID_MASTERCARD_NUMBER, VALID_AMOUNT);
		verify(creditcardServiceMock).check("MASTER", "0123456789", VALID_AMOUNT);
	}
	
	@Test(expected=KundeIstPleiteException.class)
	public void bestellen_KundeInsolvent_throwsKundeIstPleiteException() throws Exception{
		
		objectUnderTest.bestellen(VALID_ORDER,VALID_MASTERCARD_NUMBER, VALID_AMOUNT);
	}

}
