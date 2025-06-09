package aula02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite de 1 á para escolher o dia da semana: ");
		int a = sc.nextInt();
		
		if(a ==1 ) {
			System.out.println("Segunda-feira");
		}else if(a ==2 ) {
			System.out.println("terça-feira");
		}else if(a ==3 ) {
			System.out.println("quarta-feira");
		}else if(a ==4 ) {
			System.out.println("quinta-feira");
		}else if(a ==5 ) {
			System.out.println("sexta-feira");
		}else if(a ==6 ) {
			System.out.println("Sabado");
		}else if(a ==7 ) {
			System.out.println("Domingo");
		}else {
			System.out.println("valor invalido !");
		}
	}

}
