package classe.desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	void comer(Comida comida) {
		this.peso += comida.pesoComida;
	}
}
