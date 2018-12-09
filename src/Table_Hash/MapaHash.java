package Table_Hash;

public class MapaHash {

	public Registro valores[];

	public MapaHash() {
		valores = new Registro[11];
	}

	public void put(Registro registro) {
		int posicao = registro.hashCode();
		int i = 2;
		if (valores[posicao] == null) {
			valores[posicao] = registro;
		} else {
			while(valores[posicao] != null){
				posicao = (posicao+(i^2))%11;
				i++;
			}
			valores[posicao] = registro;
		}
	}
	

	public Registro get(int key) {
		Registro r = new Registro(key);
		r.setKey(key);
		int posicao = r.hashCode();
		Registro res = valores[posicao];
		if(res.getKey() == key){
			return res;
		}else{
			while(res != null){
				res = res.getProx();
				if(res != null && res.getKey() == key){
					return res;
				}
			}
		}
		return null;
	}

}
