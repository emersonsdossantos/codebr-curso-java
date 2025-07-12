package generics.pratica;

public class PessoaExe {
	
	String nome;
	
	public PessoaExe(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return "Pessoa: " + nome;
	}

}
