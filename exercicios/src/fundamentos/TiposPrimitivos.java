package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informaçoes do funcionario
		
		// Tipo númericos inteiros
		byte anosDeEmpresa = 127;
		short numeroDeVoos =  32767;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numeros de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// Salario
		System.out.println(id + "ganha -> " + salario);
		
		// Ferias
		System.out.println("Está de férias: " + estaDeFerias);
		
		System.out.println("Status: " + status);
 
	}

}
