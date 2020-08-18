package de.gothaer.geometrie;

public class Kreis extends Punkt{
	
	private double radius;
	
	public Kreis() {
		this(0,0,0);
	}

	public Kreis(double radius) {
		this(radius,0,0);
	}

	public Kreis(double x, double y) {
		this(0,x,y);
	}
	
	public Kreis(Punkt p) {
		this(0,p.getX(),p.getY());
	}
	
	public Kreis(double radius, double x, double y) {
		super(x,y);
		this.radius = radius;
	}
	


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", Radius=" + radius;
	}

}
