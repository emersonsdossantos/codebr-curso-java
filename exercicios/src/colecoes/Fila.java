package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na fila.
		// A diferença do comportamento ocorre com a lista cheia
		fila.add("Ana"); // caso a fila esteja cheia lança Exception
		fila.offer("Bia"); // caso nao a fila esteja cheia retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Obtem o proximo elemento da fila sem remover
		// A diferença do comportamento ocorre com a lista vazia
		System.out.println(fila.peek()); // Caso a fila esteja vazia, retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Caso a fila esteja vazia, retorna Exception
		System.out.println(fila.element());
		
		// Obtem o proximo elemento da fila e remover
		// A diferença do comportamento ocorre com a lista vazia
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove()); // Retorna Exception
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());		
		
		// fila.clear();
		// fila.size();
		// fila.isEmpty();
		// fila.contains();

	}

}
