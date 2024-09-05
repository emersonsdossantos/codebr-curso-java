package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Site {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3450.37, 30.0, true);
		Produto p2 = new Produto("Fone", 250.80, 15, true);
		Produto p3 = new Produto("Teclado", 500.00, 30.0, true);
		Produto p4 = new Produto("mouse", 80.20, 29.0, false);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		Predicate<Produto> desconto =  prod -> prod.desconto >= 30;
		Predicate<Produto> freteGratis = prod -> prod.frete; 
		Function<Produto, String> superPromocao = prod -> "O produto " + prod.nome + " preço: R$" + prod.preco
				+ " está com frete gratis";
		
		produtos.stream()
			.filter(desconto)
			.filter(freteGratis)
			.map(superPromocao)
			.forEach(System.out::println);

	}

}
