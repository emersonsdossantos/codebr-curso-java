package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(4));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!!");
		System.out.println(s.startsWith("B"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		
		var nome = "pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salario: " + salario + "\n");
		System.out.printf("Nome %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
		String frase = String.format("\n\nNome %s %s tem %d anos e ganha R$ %.2f",nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}

}
