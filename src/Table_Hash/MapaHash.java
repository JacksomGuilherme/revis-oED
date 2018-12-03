package Table_Hash;

public class MapaHash {

	private Registro valores[];

	public MapaHash() {
		valores = new Registro[100];
	}

	public void put(Registro registro) {
		int posicao = registro.hashCode();
		if (valores[posicao] == null) {
			valores[posicao] = registro;
		} else {
			Registro reg = valores[posicao];
			if (reg.getKey() == registro.getKey()) {
				reg.setValue(registro.getValue());
			} else {
				while (reg.getProx() != null) {
					if (reg.getKey() == registro.getKey()) {
						reg.setValue(registro.getValue());
					} else {
						reg = reg.getProx();
					}
				}
				reg.setProx(registro);
			}
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
