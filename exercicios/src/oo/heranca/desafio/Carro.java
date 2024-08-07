package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected int velocidade = 0;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
		
	}
	
	public void acelerar() {
		if (velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += delta;			
		}
	}

	public void frear() {
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
