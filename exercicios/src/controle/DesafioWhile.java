package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas =0;
		double nota = 0;
		double notaTotal =0;
		
		while(nota != -1) {
			System.out.print("Informe a nota ou -1 para sair: ");
			nota = entrada.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaTotal += nota;
				quantidadeDeNotas++;
			} else if (nota != -1){
				System.out.println("Nota invalida");
			}
		}
		
		double media = notaTotal / quantidadeDeNotas;
		System.out.println("A media de nota é " + media);
		System.out.println("num total de " + quantidadeDeNotas + " notas");

		entrada.close();
	}

}
