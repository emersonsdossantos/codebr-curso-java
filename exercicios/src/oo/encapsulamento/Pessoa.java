package oo.encapsulamento;

public class Pessoa {
	
	private int idade;
	
	Pessoa(int idade){
		setIdade(idade);
	}
	
	int getIdade() {
		return idade;
	}
	
	void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade > 0 && novaIdade <=120) {
			this.idade = novaIdade;			
		}
	}

}
