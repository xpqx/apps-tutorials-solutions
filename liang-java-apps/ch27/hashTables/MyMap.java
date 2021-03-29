package ch27.hashTables;

public interface MyMap<K, V> {
	
	public void clear();
	
	public boolean containsKey(K key);
	
	public boolean containsValue(V value);
	
	public java.util.Set<Entry<K, V>> entrySet();
	
	public V get(K key);
	
	public boolean isEmpty();
	
	public java.util.Set<K> keySet();
	
	public V put(K key, V value);
	
	public void remove(K key);
	
	public int size();
	
	public java.util.Set<V> values();

}
