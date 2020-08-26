package de.gui.presenter;

import de.gui.IEuro2DollarRechnerView;
import de.model.IEuro2DollarRechner;

public interface IEuro2DollarPresenter {

	public abstract IEuro2DollarRechnerView getView();

	public abstract void setView(IEuro2DollarRechnerView view);

	public abstract IEuro2DollarRechner getModel();

	public abstract void setModel(IEuro2DollarRechner model);

	public abstract void rechnen(); // presenter

	public abstract void beenden(); // CodeBehind

	public abstract void populateItems(); // Codehind (initialisieren)
	
	public abstract void updateRechnenActionState(); // Nicht implementieren

}