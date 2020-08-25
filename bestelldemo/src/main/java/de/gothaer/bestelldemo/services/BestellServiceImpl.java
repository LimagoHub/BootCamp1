package de.gothaer.bestelldemo.services;

import de.gothaer.bestelldemo.persistence.BestellRepository;
import de.gothaer.bestelldemo.persistence.model.Bestellung;

public class BestellServiceImpl {
	
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
	public void bestellen(Bestellung bestellung, String creditcard /* M0123456789 */, double amount) throws BestellServiceException, KundeIstPleiteException{
		
	}

}
