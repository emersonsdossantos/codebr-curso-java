package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String>caixaA = new Caixa<>();
		caixaA.guardar("Surpresa!!!");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(10.5);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}

}
