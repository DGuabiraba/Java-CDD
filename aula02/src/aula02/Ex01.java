package aula02;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 double a;
		 System.out.println("Digite um numero: ");
		 a = sc.nextDouble();
		 
		 String b = a==0? "igual a 0": a > 0 ? "o numero é positivo" : "o numero é negativo";
		 
		 System.out.println(b);
	
		
		sc.close();
	}

}
