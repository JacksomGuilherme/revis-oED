package convBin;

import fibonacci.pilha;

import javax.swing.JOptionPane;

public class view {

	public static void main(String[] args) {

		pilha p = new pilha();
		double d = Double.parseDouble(JOptionPane
				.showInputDialog("Insira um numero"));
		double b;
		while (d > 1) {
			b = d % 2;
			if (b >= 1) {
				p.push(1);
			} else if (b < 1) {
				p.push(0);
			}
			d -= d / 2;
		}

		while (!p.isEmpty()) {
			System.out.print(p.pop());
		}
	}
}
