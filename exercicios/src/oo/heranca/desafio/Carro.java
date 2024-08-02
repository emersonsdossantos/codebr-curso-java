package oo.heranca.desafio;

public class Carro {
	
	int velocidade = 0;
	
	void acelerar() {
		this.velocidade = velocidade + 5;
	}
	
	void frear() {
		
		if (velocidade > 0) {
			this.velocidade = velocidade - 5;
		}
		
	}
}
