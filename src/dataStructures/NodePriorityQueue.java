package dataStructures;

public class NodePriorityQueue <T extends Comparable<? super T>, E> {

	private E element;
	private T priority;
	private NodePriorityQueue<T, E> nextNode;
	
	
	public NodePriorityQueue (T pPriority, E pElement) {
		element=pElement;
		priority=pPriority;
		nextNode=null;
	}
	
	public E getElement() {
		return element;
	}
	
	public T getPriority() {
		return priority;
	}
	
	public NodePriorityQueue<T,E> disconnectFirst(){
		NodePriorityQueue<T, E> p= nextNode;
		nextNode=null;
		return p;
	}
	
	public NodePriorityQueue<T, E> addAfter(NodePriorityQueue<T, E> node){
		nextNode=node;
		return node;
	}
	
	public NodePriorityQueue<T, E> getNext(){
		return nextNode;
	}
	
	@Override
	public String toString() {
		return "(" +priority.toString() + "," + element.toString() + ")";
		
	}
	
	
	
}
