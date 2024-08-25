package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.function.Function;

public class Desafio {

	public static void main(String[] args) {
		
		Function<Produto, Double> precoReal = prod -> (prod.preco * (1 - prod.desconto));
		
		Function<Double, Double> impostoMunicipal = preco -> preco >= 2500 ? (preco * (1 + 0.085)) : preco ;
		
		
		Function<Double, Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		Function<Double, Double> arredondar =  preco -> {
			BigDecimal bd = new BigDecimal(preco);
			bd = bd.setScale(2, RoundingMode.HALF_UP);
			return bd.doubleValue();
		};
		
		Function<Double, String> formatarValor = valor -> {
		    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
		    symbols.setDecimalSeparator(',');

		    DecimalFormat df = new DecimalFormat("#,##0.00", symbols);
		    return "R$ " + df.format(valor);
		};
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		System.out.println(precoReal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatarValor)
				.apply(p));
		
	}

}
