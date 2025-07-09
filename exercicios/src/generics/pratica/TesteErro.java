package generics.pratica;

public class TesteErro {

	public static void main(String[] args) {
		
        Pessoa maria = new Pessoa("Maria");

        Caixa<Pessoa> caixa = new Caixa<>();

        caixa.guardar(maria); 

        System.out.println(caixa.pegar().toString());
    }


}
