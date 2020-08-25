package de.gothaer.diezweite;

import java.rmi.RemoteException;

public class Euro2DollarCalculator {
	
	private final WechselkursService wechselkursService;

	public Euro2DollarCalculator(WechselkursService wechselkursService) {
		this.wechselkursService = wechselkursService;
	}
	
	public double calculate(double euroValue) throws CalculatorException{
		try {
			return euroValue * wechselkursService.getKurs("usd");
		} catch (RemoteException e) {
			throw new CalculatorException(e);
		}
	}
}
