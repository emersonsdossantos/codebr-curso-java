package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Function<Produto, Double> precoFinal =
				prod -> prod.preco * (1 - prod.desconto);
		
		UnaryOperator<Double> imposto =
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> frete =
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		UnaryOperator<Double> arredondar =
				preco ->  Double.parseDouble(String.format("%.2f", preco));
		
		Function<Double, String> formartar =
				preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		String precoReal = precoFinal
		.andThen(imposto)
		.andThen(frete)
		.andThen(arredondar)
		.andThen(formartar)
		.apply(p);
		
		System.out.println("O preço final é " + precoReal);
	}
}
