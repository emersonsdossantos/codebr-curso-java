package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = entrada.next();
		
		System.out.println("Sobrenome: ");
		String sobrenome = entrada.next();
		
		System.out.println("Idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade );
		
		entrada.close();

	}

}
