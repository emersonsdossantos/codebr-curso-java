package oo.polimorfismo;

public class Feijao {
	
	private double peso;
	
	Feijao(double peso){
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;			
		}
	}
}
