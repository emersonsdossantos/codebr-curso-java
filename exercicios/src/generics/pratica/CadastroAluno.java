package generics.pratica;

import java.util.HashMap;
import java.util.Map;

public class CadastroAluno {

	public static void main(String[] args) {
		
		Map<String, String> aluno = new HashMap<>();
		aluno.put("12312312300", "Agatha");
		aluno.put("45645645600", "Emerson");
		aluno.put("78978978900", "Diane");
		
		System.out.println("Lista de alunos:");
		
		for (String cpf : aluno.keySet()) {
			System.out.println("Cpf: " + cpf + " Aluno: " + aluno.get(cpf));
		}

		
	}

}
