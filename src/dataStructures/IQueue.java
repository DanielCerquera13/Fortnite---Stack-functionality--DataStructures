package dataStructures;

public interface IQueue<E> {

	/**
	 * Adds an element at the end of the queue.
	 * @param e The element to add.
	 */
	void enqueue(E e);

	/**
	 * Removes an element from the front of the queue.
	 * @return The element removed.
	 */
	E dequeue();

	/**
	 * This method checks if the queue is empty.
	 * @return True if it is empty or False if have elements.
	 */
	boolean isEmpty();

	/**
	 * This method checks if the queue is full.
	 * @return True if it is full or False if have capacity available.
	 */
	boolean isFull();

	/**
	 * This method returns the size of the queue.
	 * @return The size of the queue.
	 */
	int size();
	
	/**
	 * This method returns the element at the front of the queue.
	 * @return The element at the front of the queue.
	 */
	E front();

}
