package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Civic civic = new Civic();
		
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		civic.frear();
		System.out.println(civic);
		civic.frear();
		System.out.println(civic);

		System.out.println();	
		
		Carro ferrari = new Ferrari();
		
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.frear();
		System.out.println(ferrari);
		ferrari.frear();
		System.out.println(ferrari);

	}

}
