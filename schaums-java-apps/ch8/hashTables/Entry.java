package ch8.hashTables;

public interface Entry {
	public Object getKey();
	public Object getValue();
	public void setValue(Object value);
	boolean equals(Object o);
	int hashCode();
}
