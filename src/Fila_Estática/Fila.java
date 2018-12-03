package Fila_Estática;

public class Fila {

	private int[] valores = new int[4];
	private int primeiro;
	private int ultimo;
	private int total;
	
	public Fila() {
		primeiro = 0;
		ultimo = 0;
		total = 0;
	}

	public void inserir(int elemento) {
		if (isFull()) {
			System.err.println("Fila Cheia!");
		}
		valores[ultimo] = elemento;
		ultimo = (ultimo + 1) % valores.length;
		total++;
	}

	public int retirar() {
		if (isEmpty()) {
			System.err.println("Fila Vasia!");
		}
		int elemento = valores[primeiro];
		primeiro = (primeiro + 1) % valores.length;
		total--;
		return elemento;
	}

	public boolean isEmpty() {
		return total == 0;
	}

	public boolean isFull() {
		return total == valores.length;
	}

	public int getSize() {
		if (isEmpty()) {
			return 0;
		}
		System.out.println(total);
		return this.ultimo + 1;
	}

	public void show(){
		
		if(isEmpty()){
			System.out.println("Fila vazia");
		}else{
			for(int i = 0; i < valores.length; i++){
				System.out.println("Elemento: " +valores[i]);
			}
		}
	}

}
