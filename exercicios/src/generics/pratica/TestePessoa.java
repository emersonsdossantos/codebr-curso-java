package generics.pratica;

public class TestePessoa {

	public static void main(String[] args) {
		
		Caixa<Pessoa> caixaPessoa = new Caixa<Pessoa>();
		caixaPessoa.guardar(new Pessoa("Maria"));
		System.out.println(caixaPessoa.pegar().toString());

	}

}
