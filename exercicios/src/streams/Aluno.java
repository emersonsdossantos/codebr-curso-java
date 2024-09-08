package streams;

public class Aluno {
	
	final String nome;
	final Double nota;
	final boolean bomComportamento;
	
	public Aluno(String nome, Double nota) {
		this(nome, nota, true);
	}
	
	public Aluno(String nome, Double nota, boolean bomcomportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomcomportamento;
	}

}
