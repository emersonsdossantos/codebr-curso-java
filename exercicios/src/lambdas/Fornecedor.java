package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> lista = () -> Arrays.asList("Bia", "Lia", "Ana", "Gui");
		System.out.println(lista.get());
	}

}
