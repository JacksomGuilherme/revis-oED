package Fila_Encadeada;

public class Fila {

	// private int[] valores = new int[4];
	private Node inicio;
	private Node fim;
	private int qtd;

	public Fila() {
		inicio = null;
		fim = null;
		qtd = 0;
	}

	public void inserir(int elemento) {
		Node novo = new Node(elemento);
		if (isEmpty()) {
			inicio = novo;
			fim = novo;
		}else{
		fim.setNext(novo);
		fim = novo;
		}
		qtd++;
	}

	public void retirar() {
		if (isEmpty()) {
			System.err.println("Fila Vasia!");
		}else if(inicio == fim){
			inicio = null;
			qtd--;
		}else{
		Node aux = inicio;
		aux = inicio.getNext();
		inicio = aux;
		qtd--;
		}
	}
	
	
	public void show(int elemento){
		
		Node aux = inicio;
		if(isEmpty()){
			System.out.println("Fila vazia");
		}else{
			for(int i = 0; i < qtd; i++){
				System.out.println("Elemento: " +aux.getValor());
				aux = aux.getNext();
			}
		}
		
	}

	public boolean isEmpty() {
		if(qtd == 0){
			return true;
		}else{
			return false;
		}
			
	}

	public int getSize() {
		if (isEmpty()) {
			return 0;
		}
		System.out.println("A fila tem " +qtd +" itens");
		return this.qtd + 1;
	}

}
