package metodo;

import java.util.Scanner;

public class Calculadora {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	CalcularMetodos p1 = new CalcularMetodos();
	System.out.println(p1.somar(1, 2));
	System.out.println(p1.dividir(1, 2));
	System.out.println(p1.multiplicar(1, 2));
	System.out.println(p1.subtrair(1, 2));
	
	
	 
}	

}
