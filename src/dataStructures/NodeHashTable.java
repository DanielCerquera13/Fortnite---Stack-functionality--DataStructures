package dataStructures;

public class NodeHashTable<K,V> {

	private K key;
	private V value; 
	private NodeHashTable<K, V> next; 

	public NodeHashTable(K key, V value) {
		this.key = key;
		this.setValue(value); 
		next = null; 
	}
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public NodeHashTable<K, V> getNext() {
		return next;
	}

	public void setNext(NodeHashTable<K, V> next) {
		this.next = next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
}
