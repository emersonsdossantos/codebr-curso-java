package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana: ");
		String diaSemana = entrada.next();
		
		if(diaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println("Dia 1");
		} else if(diaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println("Dia 2");
		} else if(diaSemana.equalsIgnoreCase("Terça") || diaSemana.equalsIgnoreCase("Terca")) {
			System.out.println("Dia 3");
		} else if(diaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println("Dia 4");
		} else if(diaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println("Dia 5");
		} else if(diaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println("Dia 6");
		} else if(diaSemana.equalsIgnoreCase("Sabado") || diaSemana.equalsIgnoreCase("Sábado")) {
			System.out.println("Dia 7");
		} else {
			System.out.println("Dia invalido!");
		}
		
		entrada.close();
	}

}
