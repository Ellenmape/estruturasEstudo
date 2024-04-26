package estruturas;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Como criar uma pilha
		Stack<String> nomes = new Stack<String>();
		
		//como exibir a pilha
		System.out.println(nomes);
		
		//Inserir dados na lista
		nomes.push("Lucas");
		nomes.push("Ellen");
		nomes.push("Jolene");
		nomes.push("Amanda");
		System.out.println(nomes);
		
		//remove o último dado
		System.out.println(nomes.pop());
		System.out.println(nomes);	
		
		//remove um dado específico, pode ser por índice ou nome do item
		nomes.remove(2); //ou nomes.remove(Jolene);
		System.out.println(nomes);

	}

}
