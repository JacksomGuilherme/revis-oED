package Fila_Estática;

import javax.swing.JOptionPane;

public class View {

	public static void main(String[] args) {

		Fila fila = new Fila();
		int opc = 0;

		do {
			opc = Integer
					.parseInt(JOptionPane
							.showInputDialog("1-Inserir na Fila\n2-Retirar da Fila"
									+ "\n3-Verificar se Fila está vazia\n4-Ver tamanho da fila\n9-sair"));
			switch (opc) {
			case 1:
				fila.inserir(1);
				fila.inserir(2);
				fila.inserir(3);
				fila.inserir(4);
				break;
			case 2:
				while (!fila.isEmpty()) {
					int x = fila.retirar();
					System.out.println("Retirei o elemento " + x);
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("Fila Vazia");
				} else {
					System.out.println("Fila Cheia");
				}
				break;
			case 4:
				fila.show();
				break;
			case 5:
				fila.getSize();
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida");
			}
		} while (opc != 9);
	}
}
