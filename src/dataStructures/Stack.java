package dataStructures;

public class Stack<E> implements IStack<E> {

	private E elements[];
	private int size;
	private int top;
	private boolean autoResize;

	/**
	 * Constructor to create a stack
	 * 
	 * @param size       It is the size of the stack
	 * @param autoResize Allows resize if it is true.
	 */
	public Stack(int size, boolean autoResize) {

		this.size = size;
		this.autoResize = autoResize;
		top = -1;
		elements = (E[]) new Object[size];

	}

	@Override
	public void push(E e) {

		if (isFull()) {
			if (autoResize) {

				resize();
				elements[++top] = e;
			}

		}

		else {

			elements[++top] = e;

		}

	}

	@Override
	public E pop() {

		E x = null;

		if (top >= 0) {

			x = elements[top--];

		}

		return x;
	}

	@Override
	public E peek() {

		E x = null;
		if (!isEmpty()) {

			x = elements[top];

		}
		return x;
	}

	@Override
	public boolean isEmpty() {

		return top == -1;
	}

	@Override
	public boolean isFull() {

		return top == size - 1;
	}

	private void resize() {

		E[] newStack = (E[]) new Object[size * 2];

		for (int i = 0; i < size; i++) {

			newStack[i] = elements[i];

		}
		elements = newStack;
		size = size * 2;

	}

	@Override
	public int size() {

		return size;
	}

}
