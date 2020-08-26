package de.gothaer.bestelldemo.services;

import java.rmi.RemoteException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.gothaer.bestelldemo.persistence.BestellRepository;
import de.gothaer.bestelldemo.persistence.model.Bestellung;

public class BestellServiceImpl implements BestellService {
	private final Pattern pattern = Pattern.compile("^(M|V)(\\d{10})$");
	private final BestellRepository repository;
	private final CreditcardService creditcardService;
	
	public BestellServiceImpl(final BestellRepository repository, final CreditcardService creditcardService) {
		this.repository = repository;
		this.creditcardService = creditcardService;
	}
	
	
	/*
	 * 1. bestellung darf nicht null -> BestellServiceException
	 * 2. creditcard nicht null
	 * 3. amount >= 0
	 * 4. Exception im Cardservice
	 * 5. Kunde ist pleite -> KundeIstPleiteException
	 * 6. Exception im Repo
	 * 7. happy day
	 * 
	 * 
	 */
	@Override
	public void bestellen(Bestellung bestellung, String creditcard /* M0123456789 */, double amount) throws BestellServiceException, KundeIstPleiteException{
		try {
			if(bestellung == null)
				throw new BestellServiceException("Bestellung darf nicht null sein.");
			
			if(creditcard == null)
				throw new BestellServiceException("Kreditkarte darf nicht null sein.");
			
			if(amount < 0)
				throw new BestellServiceException("Betrag darf nicht negativ sein.");
			
			final Matcher matcher = pattern.matcher(creditcard);
			if( ! matcher.matches()) {
				throw new BestellServiceException("Creditkarte hat falsche Format.");
			}
			
			String type = matcher.group(1).equals("M") ? "MASTER" : "VISA";
			String number = matcher.group(2);
			
			if( ! creditcardService.check(type, number, amount))
				throw new KundeIstPleiteException("Hau ab!");
			
			repository.saveOrUpdate(bestellung);
			
		} catch (RemoteException | RuntimeException e) {
			throw new BestellServiceException(e);
		} 
		
	}

}
