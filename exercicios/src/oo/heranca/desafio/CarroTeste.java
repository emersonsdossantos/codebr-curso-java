package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.acelerar();
				
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();

		
		System.out.println("Velocidade do civic: "+ civic.velocidade + "Km/h");
		System.out.println("Velocidade da Ferrari: "+ ferrari.velocidade + "Km/h");

	}

}
