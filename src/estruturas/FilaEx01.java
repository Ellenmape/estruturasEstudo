package estruturas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();
		int opcaoMenu;
		String cliente;

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.print("Entre com a opção desejada: \n");
		
		while (true) {
			
			System.out.print("1. Adicionar cliente a fila: \n");
			System.out.print("2. Listar todos os clientes: \n");
			System.out.print("3. Retirar cliente. \n");
			System.out.print("0. Sair");
			opcaoMenu = scanner.nextInt();

			switch ((int) opcaoMenu) {
			case 1:

				System.out.println("Digite o cliente a ser adicionado:");
				cliente = scanner2.nextLine();
				fila.add(cliente);
				System.out.println("Cliente adicionado!");
				break;
			case 2:
				System.out.println("Lista de Clientes na Fila: " + fila);
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia");
				} else
					fila.poll();
				System.out.println(fila);
				break;
				}
			if (opcaoMenu == 0) {
				System.out.println("Programa Finalizado!");
				break;
			}
		}
	}
}
