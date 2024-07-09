package controle.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		int maiorValor = 0;	
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
				
		while (contador != 10) {
		System.out.println("Informe um valor: ");
		int valorParcial = entrada.nextInt();
			
			if (valorParcial > maiorValor) {
				maiorValor = valorParcial;
				
			}
			contador++;
		}
		System.out.println("O maior valor informado foi: " + maiorValor);
		
		entrada.close();

	}

}
