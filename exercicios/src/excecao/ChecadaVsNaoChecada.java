package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args){		
		try {
			gerarErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		try {
			gerarErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// Exceção Nao chegada ou nao verificada
	static void gerarErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");		
	}
	
	// Exceção chegada ou nao verificada
	static void gerarErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
