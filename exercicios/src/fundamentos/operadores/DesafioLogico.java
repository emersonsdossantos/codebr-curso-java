package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 || trabalho2;
		boolean sorvete = comprouTv50 || comprouTv32;
		
		if(comprouTv50 && sorvete) {
			System.out.println("Comprou a Tv de 50 Polegadas e tomou sorvete");
		}else if(comprouTv32 && sorvete) {
			System.out.println("Comprou a Tv de 32 Polegadas e tomou sorvete");
		}else {
			System.out.println("Não comprou a TV e mais saudavel");
		}
			
		

	}

}
