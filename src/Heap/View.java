package Heap;

public class View {

	public static void main(String[] args) {
		
		heap h = new heap(100);
		  
		h.inserir(16); 
		h.inserir(14); 
		h.inserir(10); 
		h.inserir(8);  
		h.inserir(7);  
		h.inserir(9); 
		h.inserir(3);  
		h.inserir(2);  
		h.inserir(2); 
		h.inserir(1);
		
		System.out.println(h.print(1));
		h.inserir(50); 
		System.out.println(h.print(1));
		h.remover(); 
		System.out.println(h.print(1));
          
	}

}
