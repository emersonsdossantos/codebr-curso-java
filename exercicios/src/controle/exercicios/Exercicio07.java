package controle.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int total = 0;
		
		while(numero >= 0) {
			System.out.print("Informe um numero maior que zero ou numero negativo para sair: ");
			numero = entrada.nextInt();
			if (numero >= 0) {
				total += numero;
				System.out.println("Total: " + total);
			}
		}
		System.out.println("Fim...");
		entrada.close();
	}

}
