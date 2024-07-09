package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Random random = new Random();
		int tentativa = 3;
		
		int numeroSorteado = random.nextInt(100);
				
		for(int i = 1; i <= 3; i++) {	
			
			System.out.println("Adivinhe o numero sorteado de 0 a 100:" );
			int numero = entrada.nextInt();
			
			if(numeroSorteado == numero) {
				System.out.println("voce acertou!!!! o numero sorteado foi " + numeroSorteado);
				break;
			} else if(numeroSorteado < numero) {
				System.out.println("O numero sorteado  é menor que o " + numero);				
			} else {
				System.out.println("O numero sorteado  é maior que o " + numero);
			}
			
			tentativa = tentativa - 1;
			
			System.out.println("voce ainda tem " + tentativa + " tenativa");
		}
		System.out.println("fim");
		
		entrada.close();
	}
}
