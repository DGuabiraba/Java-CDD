package aula02;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double n2 = sc.nextDouble();
		
		double n3 = (n1 +n2)/2;
		
		System.out.printf("A media do aluno é: %.2f%n",n3);
	}

}
