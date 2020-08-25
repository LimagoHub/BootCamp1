package de.gothaer.diezweite;

import java.rmi.RemoteException;

public interface WechselkursService {
	
	public double getKurs(String wkz) throws RemoteException;

}
