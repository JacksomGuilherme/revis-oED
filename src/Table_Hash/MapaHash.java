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
			Registro reg = valores[posicao];
			while(valores[posicao] != null){
				reg.key = (reg.key+(i^2))%11;
				posicao = reg.key;
				i++;
			}
			valores[posicao] = registro;
		}
	}
	

	public Registro get(int key) {
		Registro r = new Registro();
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
