package aula02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("responda as pergunta com S para sim e n para não");
		System.out.println();
		
		
		int contador = 0 ;
		String resposta;
		
		if(resposta == 's') {
			
			contador ++;
	}
		if(contador > 5) {
			System.out.println("vc é o assasino");
			
		}else if(contador == 2) {
			System.out.println("vc é suspeito");
		}else if (contador == 3 || contador ==4 ) {
			System.out.println("vc é cúmplice");
		}else {
			System.out.println("vc é inocente ");
		}
	

}
}