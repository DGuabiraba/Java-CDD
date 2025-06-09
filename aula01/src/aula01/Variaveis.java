package aula01;

import java.util.Locale;
import java.util.Scanner;

public class Variaveis {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numeor: ");
		double num = sc.nextDouble();
		System.out.println(num);
	}
}
