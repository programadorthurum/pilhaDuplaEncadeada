package pilhaDuplaEncadeada;

public class Principal {

	public static void main(String[] args) {

		Pilha<String> pilha = new Pilha<String>();

		System.out.println(pilha.isEmpty());
		pilha.topo();

		for (int i = 1; i <= 10; i++) {
			String valor = "Numero: " + i;
			pilha.push(valor);
			if (i == 5) {
				pilha.tamanhoDaPilha();
			}
		}

		System.out.println(pilha.isEmpty());

		pilha.tamanhoDaPilha();

//		pilha.listar();

//		pilha.pop();
//		pilha.tamanhoPilha();
//		pilha.pop();
//		pilha.tamanhoPilha();
//		pilha.pop();
//		pilha.tamanhoPilha();
//		pilha.pop();
//		pilha.listar();
	}

}
