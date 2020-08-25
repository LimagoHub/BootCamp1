package de.gothaer.bestelldemo.persistence;

import de.gothaer.bestelldemo.persistence.model.Bestellung;

public interface BestellRepository {
	
	public void saveOrUpdate(Bestellung bestellung);

}
