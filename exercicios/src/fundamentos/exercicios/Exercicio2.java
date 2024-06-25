package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Celsius: ");
		double tempCelsius = entrada.nextDouble();
		
		double tempFahrenheit = tempCelsius * 1.8 + 32;
		
		System.out.printf("Temperatura em Fahrenheit: %.2f F", tempFahrenheit);
		
		entrada.close();

	}

}
