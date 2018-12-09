package Lista_Encadeada;

public class view {

	public static void main(String[] args) {

		Lista l = new Lista();
		
				l.insertFirst(new Node(1));
				l.insertFirst(new Node(2));
				l.insertFirst(new Node(3));
				l.insertFirst(new Node(4));
				l.insertFirst(new Node(5));

				l.print();
				
	}

}
