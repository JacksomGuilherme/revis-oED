package Arvore_Binaria;

public class arvore {

	public Node raiz;

	public arvore() {
		raiz = null;
	}

	public void inserir(Node p, int valor) {
		if (p == null) {
			raiz = new Node(valor, null, null);
		} else if (valor <= p.element) {
			if (p.esquerda != null) {
				inserir(p.esquerda, valor);
			} else {
				p.esquerda = new Node(valor, null, null);
			}
		} else if (valor > p.element) {
			if (p.direita != null) {
				inserir(p.direita, valor);
			} else {
				p.direita = new Node(valor, null, null);
			}
		}

	}

	public String print(Node p) {
		String ret;
		ret = "(";
		if (p != null) {
			ret += " " + p.element + " ";
			ret += print(p.esquerda);
			ret += print(p.direita);
		}
		ret = ret + ") ";
		return ret;
	}

	public void preOrdem(Node p) {

		if (p != null) {
			System.out.println(p.element + " ");
			preOrdem(p.esquerda);
			preOrdem(p.direita);
		}
	}

	public void emOrdem(Node p) {
		if (p != null) {
			emOrdem(p.esquerda);
			System.out.println(p.element + " ");
			emOrdem(p.direita);
		}
	}

	public void posOrdem(Node p) {
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
