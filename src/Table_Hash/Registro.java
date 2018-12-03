package Table_Hash;

public class Registro {
	private int key;
	private String value;
	private Registro prox;
	
	public Registro(){
		prox = null;
	}
	
	public Registro(int key, String value) {
		this.key = key;
		this.value = value;
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
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public int hashCode(){
			return key % 100;
	} 
	
}
