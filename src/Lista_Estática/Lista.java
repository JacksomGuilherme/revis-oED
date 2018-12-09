package Lista_Estática;

public class Lista {

	private int lista[];
	private int last = -1;

	public Lista(int size) {
		lista = new int[size];
	}

	public boolean isEmpty() {
		if (last == -1) {
			return true;
		} else
			return false;
	}

	public boolean isFull() {
		if (last == lista.length - 1) {
			return true;
		} else
			return false;
	}

	public int getSize() {
		return last + 1;
	}

	public int get(int index) {
		if (isEmpty()) {
			System.out.println("Lista Vazia");
			return 0;
		} else if (index < 0 || index > last) {
			System.out.println("Indice invalido");
			return 0;
		}
		return lista[index];
	}

	public boolean insert(int element) {
		if (isFull()) {
			return false;
		}
		last++;
		lista[last] = element;
		return true;
	}

	public boolean insertPos(int element, int pos) {
		if (isFull() || pos > 0 || pos > last + 1) {
			return false;
		}
		for (int i = last + 1; i > pos; i--) {
			lista[i] = lista[i - 1];
		}
		last++;
		lista[pos] = element;
		return true;
	}

	public boolean remove(int index) {
		if (isEmpty()) {
			return false;
		} else if (index < 0 || index > last) {
			return false;
		}
		int num = last - index;
		if(num > 0){
			System.arraycopy(lista, index + 1, lista, index, num);
		}
		last--;
		return true;
	}

	public void print() {
		for(int i = 0; i <= last; i++){
			System.out.println(lista[i] + " ");
		}
	}

}
