package dataStructures;

import java.util.ArrayList;

public class HashTable<K,V> implements IHashTable<K,V> {

	private int size;
	private ArrayList<NodeHashTable<K, V>> boxes;
	private int numBoxes;

	public HashTable() {
		boxes = new ArrayList<>();
		numBoxes = 10;
		size = 0;
		for (int i = 0; i < numBoxes; i++) {
			boxes.add(null);
		}
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	// give index to a key
	private int indexForKey(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBoxes;
		return index;
	}

	@Override
	
	//Remove an item according to the key
	public V remove(K key) {
		int bucketIndex = indexForKey(key);
		NodeHashTable<K, V> head = boxes.get(bucketIndex);

		NodeHashTable<K, V> prev = null;
		while (head != null) {
			if (head.getKey().equals(key))
				break;

			prev = head;
			head = head.getNext();
		}

		if (head == null)
			return null;

		size--;

		if (prev != null)
			prev.setNext(head.getNext());
		else {
			boxes.set(bucketIndex, head.getNext());
		}
		return head.getValue();

	}

	@Override
	//gets the key element sought
	public V get(K key) {
		if (key == null) {
			
			throw new NullPointerException();

		} else {

			int indice = indexForKey(key);
			NodeHashTable<K, V> head = boxes.get(indice);
			while (head != null) {
				if (head.getKey().equals(key)) {
					return head.getValue();
				} else {
					head = head.getNext();
				}
			}
		}
		return null;

	}

	@Override
	//add an element with its respective key and value
	public void put(K key, V value) {

		if (key == null || value == null) {

			throw new NullPointerException();

		} else {

			// Find the string boss for the given key
			int bucketIndex = indexForKey(key);
			NodeHashTable<K, V> head = boxes.get(bucketIndex);

			// Check if the key is already present
			while (head != null) {
				if (head.getKey().equals(key)) {
					head.setValue(value);
					return;
				}
				head = head.getNext();
			}

			// Insert the key in the chain
			size++;
			head = boxes.get(bucketIndex);
			NodeHashTable<K, V> newNode = new NodeHashTable<K, V>(key, value);
			newNode.setNext(head);
			boxes.set(bucketIndex, newNode);

			// If the load factor goes beyond the threshold, then the double size of the hash table
			if ((1.0 * size) / numBoxes >= 0.7) {
				ArrayList<NodeHashTable<K, V>> temp = boxes;
				boxes = new ArrayList<>();
				numBoxes = 2 * numBoxes;
				size = 0;
				for (int i = 0; i < numBoxes; i++)
					boxes.add(null);

				for (NodeHashTable<K, V> headNode : temp) {
					while (headNode != null) {
						put(headNode.getKey(), headNode.getValue());
						headNode = headNode.getNext();
					}
				}
			}
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
