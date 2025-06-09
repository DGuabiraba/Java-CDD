package aula02;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int a = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int b = sc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		int c = sc.nextInt();
		int maior = Math.max(a, Math.max(b, c));
		
		System.out.printf("o maior numero é: %d%n",maior);
	}

}
