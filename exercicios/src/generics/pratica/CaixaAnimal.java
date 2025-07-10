package generics.pratica;

public class CaixaAnimal < T extends Animal> {
	
	private T animal;
	
	public void guardar(T animal) {
		this.animal = animal;
	}
	
	public void fazerAnimalFalar() {
		animal.som();
	}

}
