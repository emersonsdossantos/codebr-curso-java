package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Informe a altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Imc: %.2f", imc);
		
		entrada.close();

	}

}
