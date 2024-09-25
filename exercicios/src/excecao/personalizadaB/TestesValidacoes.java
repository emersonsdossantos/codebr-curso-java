package excecao.personalizadaB;

import excecao.Aluno;

public class TestesValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Agatha", 7.0);		
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException  e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		
		System.out.println("Fim :)");

	}

}
