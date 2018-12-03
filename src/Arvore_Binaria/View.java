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
				arv.inserir(arv.raiz, 50);
				arv.inserir(arv.raiz, 40);
				arv.inserir(arv.raiz, 60);
				arv.inserir(arv.raiz, 35);
				arv.inserir(arv.raiz, 45);
				arv.inserir(arv.raiz, 55);
				arv.inserir(arv.raiz, 65);
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
