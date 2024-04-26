package estruturas;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//como criar fila
		Queue<Integer> fila = new LinkedList<Integer>();
		
		//como exibir a fila
		System.out.println(fila);
		
		fila.add(5);
		fila.add(10);
		fila.add(15);
		fila.add(20);
		
		System.out.println(fila);
		
		//vê qual o primeiro da fila
		System.out.println(fila.peek());
		
		System.out.println(fila);
		
		//remove o primeiro da fila
		System.out.println(fila.poll()); //ou fila.poll();
		System.out.println(fila);
		
		//remove um dado específico
		//não remove pelo indice, só pela
		fila.remove(10);
		System.out.println(fila);		
	}

}
