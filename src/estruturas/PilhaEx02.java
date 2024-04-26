package estruturas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PilhaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		int opcaoMenu;
		String livro;

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.print("Digite uma opção: \n");
		
		while (true) {
			
			System.out.print("1. Adicionar um novo livro na pilha \n");
			System.out.print("2. Listar todos os livros da Pilha \n");
			System.out.print("3. Retirar um livro da pilha \n");
			System.out.print("0. Sair");
			opcaoMenu = scanner.nextInt();

			switch ((int) opcaoMenu) {
			case 1:

				System.out.println("Digite um livro: ");
				livro = scanner2.nextLine();
				pilha.add(livro);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				System.out.println("Lista de Clientes na Fila: " + pilha);
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else
					pilha.pop();
				System.out.println(pilha);
				break;
				}
			if (opcaoMenu == 0) {
				System.out.println("Programa Finalizado!");
				break;
			}
		}
	}


}


