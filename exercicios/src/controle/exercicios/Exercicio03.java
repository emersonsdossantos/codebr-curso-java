package controle.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1+ nota2) / 2;
		if(media >= 7.0) {
			System.out.println("Sua média foi " + media + " e voce foi Aprovado!!!");
		}else if (media < 7 && media > 4) {
			System.out.println("Sua média foi " + media + " e voce está de Recuperação");
		}else {
			System.out.println("Sua média foi " + media + " e voce foi Reprovado");
		}
		entrada.close();
	}

}
