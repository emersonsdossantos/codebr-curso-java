package oo.encapsulamento;

public class Pessoa {
	
	private int idade;
	
	Pessoa(int idade){
		alterarIdade(idade);
	}
	
	int lerIdade() {
		return idade;
	}
	
	void alterarIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade > 0 && novaIdade <=120) {
			this.idade = novaIdade;			
		}
	}

}
