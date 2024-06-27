package controle.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int numero = 16;
	
		if(numero >= 0 && numero <= 10) {
			boolean numeroPar = numero % 2 == 0;
			 System.out.println("O numero "+ numero + " é par: " + numeroPar);
		} else {
			System.out.println("Numero invalido");
		}
	}

}
