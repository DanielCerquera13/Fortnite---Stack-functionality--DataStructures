package dataStructures;

public interface IStack<E> {

	/**
	 * This method adds a new element to the top
	 * @param e The element to add.
	 */
	void push(E e);

	/**
	 * This method removes the element from the top
	 * @return The element removed.
	 */
	E pop();

	/**
	 * This method returns the top of the stack without removing it
	 * @return The element at the top.
	 */
	E peek();
	
	/**
	 * This method returns if the stack is empty.
	 * @return Empty = true , With Elements = false
	 */
	boolean isEmpty();
	
	/**
	 * This method return if the stack is full.
	 * @return Full = true, With Capacity Available = false
	 */
	boolean isFull();
	
	/**
	 * This method returns the size of the stack
	 * @return The size of the stack.
	 */
	int size();
	

}
