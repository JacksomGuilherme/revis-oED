package Recursiva;

import javax.swing.JOptionPane;

public class view {
	
	
	public static void main(String[] args) {
		int val = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));	
		System.out.println(rec(val));
			
	}
	
	public static int rec(int n){
		int a,b;
		a = n%10;
		b = (n-a)/10;
		
		if(b<=0){
			return a;
		}
		return a + rec(b);
	}

}
