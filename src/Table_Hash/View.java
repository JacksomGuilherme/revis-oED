package Table_Hash;

import javax.swing.JOptionPane;

public class View {

	public static void main(String[] args) {

		MapaHash mapa = new MapaHash();
		Registro reg = new Registro();
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
		System.out.println(mapa.valores[i].getValue()+" Posição " mapa.regsitro());
	}

//		do {
//			System.out.println("Digite um codigo de registro\n");
//			key = Integer.parseInt(JOptionPane.showInputDialog("Insira  a Key"));
//			if (key != -1) {
//				Registro r = mapa.get(key);
//				if (r != null) {
//					System.out.println("Registro Recuperado = " + r.getKey()
//							+ " - " + r.hashCode());
//				} else {
//					System.out.println("Registro não existente");
//				}
//			}
//		} while (key != -1);

	}

}
