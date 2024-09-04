package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> converterParaBinario = n -> Integer.toBinaryString(Integer.parseInt(n));
		
		UnaryOperator<String> reverse = n -> new StringBuilder(n).reverse().toString();
		
		UnaryOperator<String> converterParaInteiro = n -> String.valueOf(Integer.parseInt(n, 2));
		
		nums.stream()
			.map(String::valueOf)
			.map(converterParaBinario)
			.map(reverse)
			.map(converterParaInteiro)
			.forEach(print);

			

	}

}
