package Heap;

public class heap {

	int vetor[];
	int n;
	
	public heap(int t){
		vetor = new int[t];
		n = 0;
	}
	
	public void inserir(int element){
		vetor[n+1] = element;
		n++;
		subir(n);
	}
	
	public void subir(int filho){
		int pai = filho/2;
		if(pai >= 1){
			if(vetor[filho] > vetor[pai]){
				int aux;
				aux = vetor[filho];
				vetor[filho] = vetor[pai];
				vetor[pai] = aux; 
				subir(pai);		
			}
		}
	}
	
	public void remover(){
		vetor[1]= vetor[n];
		n--;
		descer(1, n);
	}
	
	public void descer(int pai, int ultimo){
		int filho = 2 * pai;
		if(filho <= ultimo){
			if(filho < ultimo){
				if(vetor[filho+1]>vetor[filho]){
					filho++;
				}
			}
			if(vetor[pai] < vetor[filho]){
				int aux = vetor[pai];
				vetor[pai] = vetor[filho];
				vetor[filho] = aux;
				descer(filho, ultimo);
			}
		}
	}
	
	public String print(int p){
		String retorno;
		retorno = "(";
		if(p < n){
			retorno += " " +vetor[p] + " ";
			retorno += print(2*p);
			retorno += print(2*p+1);
		}
		retorno = retorno + " )";
		return retorno;
	}
	
}
