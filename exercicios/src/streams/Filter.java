package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Bia", 7.8);
		Aluno a2 = new Aluno("Emerson", 5.8);
		Aluno a3 = new Aluno("Agatha", 9.8);
		Aluno a4 = new Aluno("Diane", 8.8);
		Aluno a5 = new Aluno("Vini", 6.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacoes = a -> "Parabens " + a.nome + " voce foi aprovado(a)!!!";
	
		alunos.stream()
			.filter(aprovado)
			.map(saudacoes)
			.forEach(System.out::println);

	}

}
