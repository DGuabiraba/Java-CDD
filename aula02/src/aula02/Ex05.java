package aula02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite F para Feminino e M para Masculino: ");
		char nome = sc.next().charAt(0);
		
		System.out.println(nome =='f'?"Feminino": nome=='m' ?"Mascolino": "invalido");
		

}
	}
