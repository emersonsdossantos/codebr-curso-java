package generics.pratica;

public class Teste {

	public static void main(String[] args) {
		
		Caixa<String> caixaTexto = new Caixa<String>();
		caixaTexto.guardar("Olá, Generics!");
		System.out.println("Texto: " + caixaTexto.pegar());
		
		Caixa<Integer> caixaNumero = new Caixa<Integer>();
		caixaNumero.guardar(42);
		System.out.println("Número: " + caixaNumero.pegar());
		
		Caixa<Double> caixaDecimal = new Caixa<Double>();
		caixaDecimal.guardar(3.14);
		System.out.println("Decimal: " + caixaDecimal.pegar());

	}

}
