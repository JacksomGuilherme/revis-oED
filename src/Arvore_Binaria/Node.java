package Arvore_Binaria;

public class Node {

	public int element;
	public Node esquerda;
	public Node direita;
	
	public Node(int valor, Node esquerda, Node direita){
		this.element = valor;
		this.esquerda = esquerda;
		this.direita = direita;
	}
}
