package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o salario 1:" );
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe o salario 2:" );
		String salario2 = entrada.nextLine().replace(",", ".");;
		
		System.out.print("Informe o salario 3:" );
		String salario3 = entrada.nextLine().replace(",", ".");;
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double media = (s1 + s2 + s3 ) / 3;
		System.out.println(media);
		
		entrada.close();

	}

}
