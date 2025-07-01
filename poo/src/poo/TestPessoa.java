package poo;

import java.util.Scanner;

public class TestPessoa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		System.out.println("Digite seu nome: ");
		p1.nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		p1.idade = sc.nextInt();
		System.out.println("Digite sua comida: ");
		p1.comida = sc.next();
		System.out.println("Digite seu genero ");
		p1.genero = sc.next();
		p1.exibirAtributos();
		System.out.println();
		p1.comer();
		
		
		
		
	}

}
