package de.events;

public class PropertyChangedEvent {
	
	private final Object source;
	private final String propertyname;
	private final Object oldValue;
	private final Object newValue;
	public PropertyChangedEvent(Object source, String propertyname, Object oldValue, Object newValue) {
		super();
		this.source = source;
		this.propertyname = propertyname;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	public Object getSource() {
		return source;
	}
	public String getPropertyname() {
		return propertyname;
	}
	public Object getOldValue() {
		return oldValue;
	}
	public Object getNewValue() {
		return newValue;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PropertyChangedEvent [source=");
		builder.append(source);
		builder.append(", propertyname=");
		builder.append(propertyname);
		builder.append(", oldValue=");
		builder.append(oldValue);
		builder.append(", newValue=");
		builder.append(newValue);
		builder.append("]");
		return builder.toString();
	}
	
	

}
