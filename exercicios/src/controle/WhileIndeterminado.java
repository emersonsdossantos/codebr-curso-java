package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		String valor = "";
		
		System.out.println("Diz aí, caso queira sair, digite \"sair\": ");
		
		while(!"sair".equalsIgnoreCase(valor)){			
			valor = entrada.nextLine();			
		}
		System.out.println("fim");
		entrada.close();
	}

}
