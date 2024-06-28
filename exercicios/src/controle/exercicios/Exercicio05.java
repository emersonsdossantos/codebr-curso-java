package controle.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
				if(numero % i == 0) {
					contador++;
				}
		}
		
		switch (contador) {
		case 0:
			System.out.println("O numero " + numero + " é primo.");
			break;

		default:
			System.out.println("O numero " + numero + " não é primo.");
		}
		
		entrada.close();
	}
}
