package br.com.cod3r.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testarSeIgualADois() {
		
		int a = 1 + 1;
		
		assertEquals(a, 2);
	}
	
	@Test
	void testaSeIgualATres() {
		int x = 2 + 10 - 9;
		assertEquals(x, 3);
	}

}
