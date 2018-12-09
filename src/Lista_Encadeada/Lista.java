package Lista_Encadeada;

public class Lista {

	private Node head;
	private Node tail;
	private int size;
	
	public Lista(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public Node getFirst(){
		if(isEmpty()){
			System.out.println("Lista vazia");
			return null;
		}else
			return head;
	}
	
	public Node getLast(){
		if(isEmpty()){
			System.out.println("Lista vazia");
			return null;
		}else
			return tail;
	}
	
	public void insertFirst(Node p){
		p.setNext(head);
		head = p;
		size++;
		if(size == 1){
			tail = head;
		}
	}
	
	public void insertLast(Node p){
		if(isEmpty()){
			insertFirst(p);
		}else{
			p.setNext(null);
			tail.setNext(p);
			tail = p;
			size++;
		}
	}
	
	public Node removeFirst(){
		if(isEmpty()){
			System.out.println("Lista Vazia");
			return null;
		}
		Node remItem = head;
		if(head == tail){
			head = tail = null;
		}else{
			head = head.getNext();
		}
		size --;
		return remItem;
	}
	
	public Node removeLast(){
		if(isEmpty()){
			System.out.println("Lista Vazia");
			return null;
		}
		Node remItem = tail;
		if(head == tail){
			head = tail = null;
		}else{
			Node current = head;
			while(current.getNext() != tail){
				current = current.getNext();
			}
			tail = current;
			current.setNext(null);
		}
		size --;
		return remItem;
	}
	
	public void print(){
		if(isEmpty()){
			System.out.println("Lista Vazia");
		}
		System.out.println("A lista é: ");
		Node current = head;
		while(current != null){
			System.out.print(current.getElement() + "x");
			current = current.getNext();
		}
		System.out.println("\n");
	}
	
	public void inverter(){
		Node aux = tail;
		tail = head;
		head = aux;
		Node current = tail;
		while(current != null){
			System.out.println(current.getElement() + " ");
			current = current.getNext();
		}
		System.out.println("\n");
	}
	
}
