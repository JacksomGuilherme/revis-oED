package Fila_Encadeada;

import javax.swing.JOptionPane;

public class view2 {

	public static void main(String[] args) {
		
		Fila f = new Fila();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int i = 2;
		while (n > 1) {
			if (n % i == 0 && n % n == 0) {
				n = n / i;
				f.inserir(i);
				i = 2;
			}else{
				i++;
			}
		}
		
		f.show();
		
	}
	
}
