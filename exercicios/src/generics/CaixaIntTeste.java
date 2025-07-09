package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		
		CaixaInt coisaA = new CaixaInt();
		coisaA.guardar(28);
		
		int coisa = coisaA.abrir();
		System.out.println(coisa);
	}

}
