package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7) {
			System.out.println("Aprovado, Parabens!!!");
		}
		
		boolean atingiuMedia = media >= 4 && media <7;
		if(atingiuMedia) {
			System.out.println("Em recuperação");
		}
		if(media < 4) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}

}
