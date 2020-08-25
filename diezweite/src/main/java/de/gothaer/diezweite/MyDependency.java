package de.gothaer.diezweite;

public interface MyDependency {
	
	int query();
	void transaction(int value);
	int both(int value);

}
