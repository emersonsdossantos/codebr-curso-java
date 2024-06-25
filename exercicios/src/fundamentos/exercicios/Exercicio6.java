package fundamentos.exercicios;

public class Exercicio6 {

	public static void main(String[] args) {
		int a = 1;
		int b = 12;
		int c = 13;
		
		double delta = Math.pow(b, 2) - (4 * a *(-c));
		
		double x1 = (- b + Math.sqrt(delta)) / 2;
		double x2 = (- b - Math.sqrt(delta)) / 2;
		
		System.out.println("Equação: ax² + bx + c = 0 \n");
		
		System.out.println("O valor de Delta é: " + delta);
		
		System.out.println("x1 = " + x1 );
		System.out.println("x2 = " + x2 );

	}

}
