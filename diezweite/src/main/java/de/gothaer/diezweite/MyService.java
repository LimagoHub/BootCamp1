package de.gothaer.diezweite;

public class MyService {

	private final MyDependency dependency;

	public MyService(MyDependency dependency) {
		this.dependency = dependency;
	}
	
	public int foo() {
		
		return dependency.both(4711);
	}
}
