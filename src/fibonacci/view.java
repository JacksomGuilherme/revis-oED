package fibonacci;

import javax.swing.JOptionPane;

public class view {

	public static void main(String[] args) {

		int i,n;
		pilha p = new pilha();
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));

		for (i = 1; i <= n; i++) {
			p.push(fibo(i));
		}
		
		System.out.println(p.pop());
		
	}

	static long fibo(int n){
		if(n < 2){
			return n;
		}else{
			return fibo(n - 1)+fibo(n-2);
		}
	}
}
