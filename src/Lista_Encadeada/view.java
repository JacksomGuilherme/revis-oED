package Lista_Encadeada;

import javax.swing.JOptionPane;

public class view {

	public static void main(String[] args) {

		Lista l = new Lista();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int i = 2;
		while (n > 1) {
			if (n % i == 0 && n % n == 0) {
				n = n / i;
				l.insertLast(new Node(i));
				i = 2;
			}else{
				i++;
			}
		}
				l.print();
				
	}

}
