package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Informe a operação: ");
		String operacao = entrada.next();
		
		
		double resultado = operacao.equals("+")? num1 + num2:0;
		resultado = operacao.equals("-")? num1 - num2 : resultado;
		resultado = operacao.equals("*")? num1 * num2 : resultado;
		resultado = operacao.equals("/")? num1 / num2 : resultado;
		resultado = operacao.equals("%")? num1 % num2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado );
		entrada.close();

	}

}
