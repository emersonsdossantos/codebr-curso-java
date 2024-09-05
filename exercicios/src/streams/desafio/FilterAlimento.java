package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterAlimento {

	public static void main(String[] args) {
		
		Alimentos a1 = new Alimentos("Salada", 50.0, true);
		Alimentos a2 = new Alimentos("Pipoca", 70.5, false);
		Alimentos a3 = new Alimentos("Sorvete", 400.7, false);
		Alimentos a4 = new Alimentos("Arroz", 150.0, true);
		Alimentos a5 = new Alimentos("Ovo", 60.9, true);
		Alimentos a6 = new Alimentos("Refrigerante", 300.2, false);
		
		List<Alimentos> alimentos = Arrays.asList(a1,a2, a3, a4, a5, a6);
		
		Predicate<Alimentos> baixaCaloria = a -> a.caloria <= 100.0;
		Predicate<Alimentos> eSaudavel = a -> a.saudavel;
		Function<Alimentos, String> podeComer = a -> "O alimento " + a.nome + " é saudavel e tem baixa caloria " + a.caloria; 
		
		alimentos.stream()
			.filter(baixaCaloria)
			.filter(eSaudavel)
			.map(podeComer)
			.forEach(System.out::println);

	}

}
