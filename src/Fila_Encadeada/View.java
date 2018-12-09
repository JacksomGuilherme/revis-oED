package Fila_Encadeada;

import javax.swing.JOptionPane;

public class View {

	public static void main(String[] args) {

		Fila fila = new Fila();
		int opc = 0;
		int x = 0;

		do {
			opc = Integer
					.parseInt(JOptionPane
							.showInputDialog("1-inserir na fila\n2-Retirar da fila"
									+ "\n3-Ver itens da fila"
									+ "\n4-Verificar se fila está vazia\n5-Ver tamanho da fila\n9-sair"));
			switch (opc) {
			case 1:
				x = Integer.parseInt(JOptionPane
						.showInputDialog("Insira um numero"));
				fila.inserir(x);
				break;
			case 2:
				fila.retirar();
				break;
			case 3:
				fila.show();
				break;
			case 4:
				if (fila.isEmpty()) {
					System.out.println("Lista Vazia");
				} else {
					System.out.println("Lista Cheia");
				}
				break;
			case 5:
				System.out.println(fila);
				fila.getSize();
				break;
			case 9:
				break;
			default: JOptionPane.showMessageDialog(null, "Opção Invalida");		
			}
		} while (opc != 9);
	}
}
