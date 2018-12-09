package Table_Hash;


public class View {

	public static void main(String[] args) {

		MapaHash mapa = new MapaHash();
//		int key;

	mapa.put(new Registro(82));
	mapa.put(new Registro(81));
	mapa.put(new Registro(28));
	mapa.put(new Registro(4));
	mapa.put(new Registro(45));
	mapa.put(new Registro(27));
	mapa.put(new Registro(59));
	mapa.put(new Registro(79));
	mapa.put(new Registro(35));
	
	for(int i = 0; i < 11; i++){
		System.out.println(mapa.valores[i].getValue()+" Posição " +i);
	}

	}

}
