package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
				
		// Ultimo que entra é o primeiro que sai.
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		// System.out.println(livros.remove());
		//System.out.println(livros.pop());
		
//		livros.size();
//		livros.clear();
//		livros.isEmpty();
//		livros.contains(null);
	}

}
