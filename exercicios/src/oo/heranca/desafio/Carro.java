package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidade = 0;
	int delta = 5;
	
	Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
		
	}
	
	void acelerar() {
		if (velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += delta;			
		}
	}

	void frear() {
		if (velocidade >= 5) {
			this.velocidade = velocidade - 5;
		} else {
			velocidade = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidade + " Km/h.";
		
	}
	
}
