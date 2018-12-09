package convBin;

public class pilha {
	
	protected int size;
	protected Node topo;

	public pilha(){
		size = 0;
		topo = null;
	}
	
	public boolean isEmpty(){
		return topo == null;
	}
	
	public int getSize(){
		return size;
	}
	
	public long show(){
		if(isEmpty()){
			throw new RuntimeException("Pilha Vazia");
		}
		return topo.getElement();
	}
	
	public void push(long l){
		Node novo = new Node(l, topo);
		topo = novo;
		size++;
	}
	
	public long pop(){
		if(isEmpty()){
			throw new RuntimeException("Pilha Vazia");
		}
		long temp = topo.getElement();
		topo = topo.getNext();
		size --;
		return temp;
	}
	
	
}
