package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Fahrenheit: ");
		double tempFahrenheit = entrada.nextDouble();
		
		double tempCelsius = (tempFahrenheit - 32) / 1.8;
		
		System.out.printf("Temperatura em celsius: %.2f ", tempCelsius);
				
		entrada.close();

	}

}
