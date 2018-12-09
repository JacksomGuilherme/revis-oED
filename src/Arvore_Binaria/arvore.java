package Arvore_Binaria;

public class arvore {

	public Node raiz;

	public arvore() {
		raiz = null;
	}

	public void inserir(Node p, int valor) {
		if (p == null) { // a raiz é sempre o primeiro valor inserido
			raiz = new Node(valor, null, null);
		} else if (valor <= p.element) { // o valor que for menor que a raiz vai para o nó da esquerda
			if (p.esquerda != null) {
				inserir(p.esquerda, valor); // insere o valor no nó
			} else {
				p.esquerda = new Node(valor, null, null); // cria um novo nó a esquerda
			}
		} else if (valor > p.element) { // o valor que for maior que a raiz vai para a direita
			if (p.direita != null) {
				inserir(p.direita, valor); // insere o valor no nó
			} else {
				p.direita = new Node(valor, null, null); // cira um novo nó na direita
			}
		}

	}

	public String print(Node p) {
		String ret;
		ret = "(";
		if (p != null) { // verifica se a raiz não está vazia
			ret += " " + p.element + " ";
			ret += print(p.esquerda);
			ret += print(p.direita);
		}
		ret = ret + ") ";
		return ret;
	}

	public void preOrdem(Node p) {

		if (p != null) {
			System.out.println(p.element + " "); // imprime primeiro a raiz dps vai para a esquerda e depois direita
			preOrdem(p.esquerda);
			preOrdem(p.direita);
		}
	}

	public void emOrdem(Node p) { // imprime primeiro a esquerda depois a raiz e depois a direita
		if (p != null) {
			emOrdem(p.esquerda);
			System.out.println(p.element + " ");
			emOrdem(p.direita);
		}
	}

	public void posOrdem(Node p) { // imprime primeiro a esquerda depois a direita e depois a raiz
		if (p != null) {
			posOrdem(p.esquerda);
			posOrdem(p.direita);
			System.out.println(p.element + " ");
		}
	}

	public boolean Existe(Node p, int valor) {

		if (p != null) {
			if (p.element == valor) {
				return true;
			} else {
				if (valor < p.element) {
					return Existe(p.esquerda, valor);
				} else {
					return Existe(p.direita, valor);
				}
			}
		}
		return false;
	}

	public void remover(Node p, int valor) {

		if (Existe(raiz, valor) == true) {
			if (p.element == valor) {
				raiz = null;
			} else if (p.element > valor) {
				if (p.esquerda.element == valor) {
					p.esquerda = null;
				} else {
					remover(p.esquerda, valor);
				}
			} else if (p.direita.element == valor) {
				p.direita = null;
			} else {
				remover(p.direita, valor);
			}
		}else{
			System.out.println("Elemento Não Existe");
		}
	}

}
