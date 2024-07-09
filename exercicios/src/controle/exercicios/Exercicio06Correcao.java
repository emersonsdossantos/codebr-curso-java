package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06Correcao {

	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		int continuar = 0;
		int numeroSorteado;
		int tentativa;
		int numero;
		
		do {
			System.out.println("Sorteando numero entre 0 e 100");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Começou o jogo!!!");
			tentativa = 0;
			
			do {
				tentativa++;
				System.out.printf("Tentativa %d", tentativa);
				System.out.printf("\nInforme o numero: ");
				numero = entrada.nextInt();
				
				if(numero > numeroSorteado) {
					System.out.printf("\nO numero sorteado é menor que %d\n\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("\nO numero sorteado é maior que %d\n\n", numero);
				} else {
					System.out.printf("\nParabens!! Voce acertou o numero em %d tentativas\n\n", tentativa);
					break;
				}
				
			} while (tentativa != 10);
			
			System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
			continuar = entrada.nextInt();
		} while (continuar != 0 );
		
		System.out.println("Fim de jogo!!!");
		
		entrada.close();
	}

}
