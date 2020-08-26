package de.gothaer.bestelldemo.services;

import de.gothaer.bestelldemo.persistence.model.Bestellung;

public interface BestellService {

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
	void bestellen(Bestellung bestellung, String creditcard /* M0123456789 */, double amount)
			throws BestellServiceException, KundeIstPleiteException;

}