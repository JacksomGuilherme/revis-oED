package Table_Hash;

public class Registro {
	public int key;
	private int value;
	private Registro prox;
			
	public Registro(int key) {
		this.key = key;
		this.value = key;
		this.prox = null;
	}
	
	public Registro getProx() {
		return prox;
	}

	public void setProx(Registro prox) {
		this.prox = prox;
	}

	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int key) {
		this.value = key;
	}
	
	public int hashCode(){
			return key % 11;
	} 
	
}
