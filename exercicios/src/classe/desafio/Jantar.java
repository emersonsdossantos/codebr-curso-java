package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.223);		
		Comida c2 = new Comida("Feijao", 0.300);
		
		Pessoa p = new Pessoa();		
		p.nome = "Joao";
		p.peso = 100;
		 
		System.out.println("Peso atual do " + p.nome + " é: " + p.peso + "Kg");
		
		p.comer(c1);
		p.comer(c2);
		
		System.out.println("Peso do " + p.nome + " apos comer é: " + p.peso + " Kg");

	}

}