package fundamentos;

public class DesafioAritimetico {

	public static void main(String[] args) {
		int  ladoA = 6 * (3 + 2);
		int ladoA1 = (int) Math.pow(ladoA, 2);
		int ladoEsquerdo = ladoA1 / (3*2);		
		
		
		int ladoB = (1 -5) * (2 - 7) / 2;
		int ladoDireito = (int) Math.pow(ladoB, 2);

		
		int superior = ladoEsquerdo - ladoDireito;
		int superioA = (int) Math.pow(superior, 3);
		int base = (int) Math.pow(10, 3);
		
		int resultado = superioA / base;
		System.out.println(resultado);
		
		

	}

}
