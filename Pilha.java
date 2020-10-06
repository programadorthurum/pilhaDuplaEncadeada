package pilhaDuplaEncadeada;

public class Pilha<T extends Comparable<T>> {
	
	private No<T> primeiro;
	private No<T> ultimo;
	private Integer tamanho;
	
	public Pilha() {
		this.primeiro = null;
		this.ultimo = null;
		this.tamanho = 0;
	}
	
	public No<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No<T> primeiro) {
		this.primeiro = primeiro;
	}

	public No<T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(No<T> ultimo) {
		this.ultimo = ultimo;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	/**
	 * A Pilha Está Vazia?
	 * @return True ou False
	 */
	public boolean isEmpty() {
		return (this.primeiro == null);
	}
	
	/**
	 * Adicionar elemento na Pilha
	 * @param elemento
	 */
	public void push(T elemento) {
		if(isEmpty()) {
			this.primeiro = new No<T>();
			this.ultimo = primeiro;
			No<T> novo = new No<T>();
			novo.setValor(elemento);
			novo.setProximo(this.primeiro);
			this.primeiro = novo;
			this.tamanho++;
		} else {
			No<T> novo = new No<T>();
			novo.setValor(elemento);
			novo.setProximo(this.primeiro);
			this.primeiro = novo;
			this.tamanho++;
		}
		
	}
	
	/**
	 * Remove o elemento do Topo da Pilha
	 */
	public void pop() {
		if(isEmpty()) {
			return ;
		}
		this.primeiro = primeiro.getProximo();
		this.tamanho--;
	}
	
	/**
	 * Listar dados da Pilha
	 */
	public void listar() {
		if(isEmpty()) {
			return ;
		}
		
		No<T> aux = this.primeiro;
		
		while(aux != null) {
			System.out.println(aux.getValor());
			aux = aux.getProximo();
		}
	}
	
	/**
	 * Informar o Tamanho atual da Pilha
	 */
	public void tamanhoDaPilha() {
		System.out.println("TAMANHO DA PILHA: " + this.getTamanho());
	}
	
	/**
	 * Informa o elemento que está no Topo da Pilha.
	 */
	public void topo() {
		if(isEmpty()) {
			System.out.println("-");
			return;
		}
		
		System.out.println(this.getPrimeiro().toString());
	}
}
