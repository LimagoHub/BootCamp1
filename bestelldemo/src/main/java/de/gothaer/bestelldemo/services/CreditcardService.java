package de.gothaer.bestelldemo.services;

import java.rmi.RemoteException;

public interface CreditcardService {
	
	public boolean check(String cardtype /* Master oder Visa */, String cardnumber /* genau 10 ziffern */, double amount) throws RemoteException;

}
