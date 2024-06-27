package controle.exercicios;

import java.util.Scanner;

public class Exercicio01Correcao {

	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("O numero " + numero + " está entre 0 e 10 e é par.");
			} else {
				System.out.println("O numero " + numero + " numero está entre 0 e 10 e é impar.");
			}
		} else {
			System.out.println("O numero " + numero + " não está entre 0 e 10.");
		}
		
		entrada.close();
	}

}
