package dataStructures;

public class Queue<E> implements IQueue<E> {

	private E elements[];
	private int front;
	private int rear;
	private int maxSize;
	private int size;
	private boolean resize;

	public Queue(int maxSize, boolean resize) {

		front = 0;
		rear = -1;
		size = 0;
		this.maxSize = maxSize;
		this.resize = resize;
		elements = (E[]) new Object[maxSize];

	}

	@Override
	public void enqueue(E e) {

		if (isFull()) {

			if (resize) {

				resize();

				rear++;
				if (rear >= elements.length && size != elements.length) {

					rear = 0;

				}

				elements[rear] = e;
				size++;

			}

		} else {

			rear++;
			if (rear >= elements.length && size != elements.length) {

				rear = 0;

			}

			elements[rear] = e;
			size++;

		}

	}

	private void resize() {

		E[] newQueue = (E[]) new Object[maxSize * 2];

		int tempFront = front;
		int index = -1;

		while (true) {

			newQueue[++index] = elements[tempFront];
			tempFront++;
			if (tempFront == elements.length) {

				tempFront = 0;

			}
			if (size == index + 1) {

				break;
			}

		}

		elements = newQueue;
		front = 0;
		rear = index;

	}

	@Override
	public E dequeue() {

		E x = null;
		if(!isEmpty()) {
			
		front++;
		if(front > elements.length-1) {
		
		x = elements[front-1];
		front = 0;	
			
		
		}else {
			
		x = elements[front -1];	
			
		}
		
		size--;
			
		}
		
		return x;
		
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public boolean isFull() {
		return size == elements.length;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public E front() {
		
		return elements[front];
		
	}
	
}
