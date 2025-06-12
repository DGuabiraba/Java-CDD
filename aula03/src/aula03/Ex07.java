package aula03;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de aluno");
		int alunos = sc.nextInt();
		float media = 0;
		
		for (int i = 1; i <= alunos; i++) {
			System.out.printf("Digite a media do %dº aluno %n ", i);
			media += sc.nextFloat();
		}
		
		media /= alunos;
		
		System.out.printf("A media da turma é %.2f%n",media);
		sc.close();
	}

}
