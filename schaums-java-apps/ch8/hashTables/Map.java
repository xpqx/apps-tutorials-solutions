package ch8.hashTables;

public interface Map {
	public Object get(Object key);
	public Object put(Object key, Object value);
	public Object remove(Object key);
	public int size();

}
