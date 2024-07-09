package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		double numero = entrada.nextDouble();
		
		double quadrado =  Math.pow(numero, 2);
		double cubo =  Math.pow(numero, 3);
		
		System.out.println(numero + " ao quadrado = " + quadrado);
		System.out.println(numero + " ao cubo = " + cubo);
		entrada.close();
	}

}
