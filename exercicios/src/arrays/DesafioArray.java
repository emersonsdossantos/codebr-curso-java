package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
		System.out.print("Quantas notas gostaria de informar: ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double notaTotal = 0;
		for (double nota : notas) {
			notaTotal += nota;
		}
		
		double media = notaTotal / notas.length;
		
		System.out.println("Notas: " + Arrays.toString(notas));
		System.out.print("Media de nota: "+ media);
	
		entrada.close();
	}

}
