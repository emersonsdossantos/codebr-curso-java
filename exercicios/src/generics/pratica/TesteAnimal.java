package generics.pratica;

public class TesteAnimal {

	public static void main(String[] args) {
		
		CaixaAnimal<Cachorro> caixaDeCachorro = new CaixaAnimal<>();
		Cachorro baruk = new Cachorro();
		caixaDeCachorro.guardar(baruk);
		caixaDeCachorro.fazerAnimalFalar();
		
		CaixaAnimal<Gato> caixaDeGato = new CaixaAnimal<>();
		Gato paozinho = new Gato();
		caixaDeGato.guardar(paozinho);
		caixaDeGato.fazerAnimalFalar();

	}

}
