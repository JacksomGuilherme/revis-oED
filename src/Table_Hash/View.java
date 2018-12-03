package Table_Hash;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		MapaHash mapa = new MapaHash();
		int key;

		mapa.put(new Registro(7865, "Jacksom"));
		mapa.put(new Registro(123, "Takeopariu"));
		mapa.put(new Registro(666, "Merda de Hash"));
		mapa.put(new Registro(321, "Piroca"));
		mapa.put(new Registro(865, "Jack"));
		mapa.put(new Registro(765, "Johnny Depp"));

		do {
			System.out.println("Digite um codigo de registro\n");
			key = teclado.nextInt();
			if (key != -1) {
				Registro r = mapa.get(key);
				if (r != null) {
					System.out.println("Registro Recuperado = " + r.getKey()
							+ " - " + r.getValue());
				} else {
					System.out.println("Registro não existente");
				}
			}
		} while (key != -1);

	}

}
