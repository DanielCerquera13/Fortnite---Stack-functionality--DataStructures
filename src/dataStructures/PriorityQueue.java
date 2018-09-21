package dataStructures;

public class PriorityQueue <T extends Comparable<? super T>, E>{

	protected NodePriorityQueue<T, E> first;
	protected NodePriorityQueue<T, E> last;
	protected int numElems;
	
	public PriorityQueue() {
		first=null;
		last=null;
		numElems=0;
	}
	
	public int size() {
		return numElems;
	}
	
	public E getElement() throws QueueEmptyException{
	
		if(first==null)
			throw new QueueEmptyException("There are no elements in the queue");
		else {
			NodePriorityQueue<T, E> p= first;
			first=first.disconnectFirst();
			if(first==null)
				last=null;
			numElems--;
			return p.getElement();
		}
	}
	
	public void add(T priority, E elem) {
		NodePriorityQueue<T, E> node=new NodePriorityQueue<T,E>(priority, elem);
		if(first==null) {
			first=node;
			last=node;
			
		}
		else if(first.getPriority().compareTo(priority)<0) {
		node.addAfter(first);
		first=node;
		}
		
		else {
			boolean insert=false;
			for(NodePriorityQueue<T, E> p=first; !insert && p.getNext() !=null; p=p.getNext()) {
				if(p.getNext().getPriority().compareTo(priority)<0) {
					node.addAfter(p.getNext());
					p.addAfter(node);
					insert=true;
				}
			}
			if(!insert) {
				last=last.addAfter(node);
			}
		}
		numElems++;
	}
	
	public NodePriorityQueue<T, E> getFirst(){
		return first;
	}
	
	public NodePriorityQueue<T, E> getLast(){
		return last;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
	
	@Override
	public String toString() {
		String ans= "[" +numElems + "]: ";
		for(NodePriorityQueue<T, E> p=first; p!=null; p=p.getNext()) {
			ans+= "->" +p.toString();
		}
		return ans;
	}
	
	
}
