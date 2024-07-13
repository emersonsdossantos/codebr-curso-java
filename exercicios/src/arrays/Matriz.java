package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos: ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.print("Informe a quantidade de notas: ");
		int qtdeDeNotas = entrada.nextInt();
				
		double[][] notasDaTurma = new double [qtdeAlunos][qtdeDeNotas];
		
		double totalDeNotas = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", (j +1), (i+1));
				notasDaTurma[i][j] = entrada.nextDouble();
				totalDeNotas += notasDaTurma[i][j];
			}			
		}
		
		for (double[] notasDoAluno : notasDaTurma) {
			System.out.println("Notas da Turma: " + Arrays.toString(notasDoAluno));
		}
			
		double media = totalDeNotas / (qtdeAlunos * qtdeDeNotas);		
		System.out.println("Media de nota da turma: " + media);
		
		entrada.close();
	}

}
