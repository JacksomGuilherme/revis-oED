package Arvore_Binaria;

import javax.swing.JOptionPane;

public class View {

	public static void main(String[] args) {

		arvore arv = new arvore();

		int valor = 0;

		int opc = 0;
		do {
			opc = Integer
					.parseInt(JOptionPane
							.showInputDialog("1-Inserir na Arvore\n2-Retirar da Arvore"
									+ "\n3-Ver arvore\n4-Pesquisar valor na arvore"
									+ "\n5-Pre ordem\n6-Em Ordem\n7-Pos Ordem\n9-sair"));
			switch (opc) {
			case 1:
				arv.inserir(arv.raiz, 8);
				arv.inserir(arv.raiz, 3);
				arv.inserir(arv.raiz, 10);
				arv.inserir(arv.raiz, 1);
				arv.inserir(arv.raiz, 6);
				arv.inserir(arv.raiz, 14);
				arv.inserir(arv.raiz, 4);
				arv.inserir(arv.raiz, 7);
				arv.inserir(arv.raiz, 13);
				break;
			case 2:
				if (arv.raiz != null) {
					valor = Integer.parseInt(JOptionPane
							.showInputDialog("Insira o valor para remover"));
					arv.remover(arv.raiz, valor);
				} else
					System.out.println("Arvore Vazia!");
				break;
			case 3:
				System.out.println(arv.print(arv.raiz));
				break;
			case 4:
				valor = Integer.parseInt(JOptionPane
						.showInputDialog("Pesquise um numero"));
				if (arv.Existe(arv.raiz, valor) == true) {
					System.out.println(valor + " Existe!");
				} else {
					System.out.println(valor + " Não Existe!");
				}
				break;
			case 5:
				System.out.println("Pre ordem");
				arv.preOrdem(arv.raiz);
				System.out.println(" ");
				break;
			case 6:
				System.out.println("Em ordem");
				arv.emOrdem(arv.raiz);
				System.out.println(" ");
				break;
			case 7:
				System.out.println("Pos ordem");
				arv.posOrdem(arv.raiz);
				break;
			case 9:
				break;
			default: JOptionPane.showMessageDialog(null, "Opção Invalida");	
			}
		} while (opc != 9);

	}
}
