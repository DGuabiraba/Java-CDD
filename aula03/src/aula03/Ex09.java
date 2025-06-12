package aula03;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do array: ");
		int valor = sc.nextInt();
		int numero[]= new int [valor];
		
		System.out.println("Preencha o array:");
        for (int i = 0; i < valor; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            numero[i] = sc.nextInt();
        }
      for (int j = 0; j < numero.length; j++) {
    	  System.out.print(numero[j]+" ");
		
	}
		}
		}
	

