package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro civic = new Civic();
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		

		System.out.println();	
		
		Ferrari ferrari = new Ferrari(400);
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.desligarAr();
		
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);


	}

}
