package aula03;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("digite a quantidade de alunos: ");
	int alunos = sc.nextInt();
	int i = 0 ;
	float media = 0;
	
	while (i<alunos) {
		System.out.printf("Digite a media do %dº aluno %n ", i +1);
		media += sc.nextFloat();
		i++;
		
		
	}
	media /= alunos;
	
	System.out.printf("A media da turma é %.2f%n",media);
	sc.close();
	}

}
