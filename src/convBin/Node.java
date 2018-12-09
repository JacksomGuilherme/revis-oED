package convBin;

public class Node {

	private long element;
	private Node next;
	
	public Node(Object object, Node n){
		element = (long) object;
		next = n;
	}

	public long getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
