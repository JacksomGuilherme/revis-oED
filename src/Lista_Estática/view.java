package Lista_Est�tica;

import javax.swing.JOptionPane;

public class view {

	public static void main(String[] args) {
		
		int val,pos;
		int opc = 0;
		
		Lista l = new Lista(10);
		
		do{
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Op��o\n"
					+"1 - inserir numero na lista\n2 - inserir em uma posi��o especifica\n"
					+"3 - remover da lista\n4 - ver tamanho da lista\n 5 - imprimir lista"));
		switch(opc){
		case 1: val = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
				l.insert(val);
				break;
		case 2: val = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
				pos = Integer.parseInt(JOptionPane.showInputDialog("Insira a posi��o"));
				l.insertPos(val, pos);
				break;
		case 3:	 pos = Integer.parseInt(JOptionPane.showInputDialog("Insira a posi��o"));
				l.remove(pos);
				break;
		case 4:	System.out.println(l.getSize());	
				break;
		case 5: l.print();
				break;
		case 9: break;		
		default: JOptionPane.showMessageDialog(null, "Op��o Invalida");
				break;
		}
		}while(opc!=9);
		
	}
}
