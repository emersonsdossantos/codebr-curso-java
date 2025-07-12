package generics.pratica;

import java.util.ArrayList;
import java.util.List;

public class TestePessoaExe {

	public static void main(String[] args) {
		
		List<PessoaExe> pessoas = new ArrayList<>();
		pessoas.add(new PessoaExe("Emerson"));
		pessoas.add(new PessoaExe("Agatha"));
		pessoas.add(new PessoaExe("Diane"));
		
		for (PessoaExe pessoa : pessoas) {
			System.out.println(pessoa);
		}

	}

}
