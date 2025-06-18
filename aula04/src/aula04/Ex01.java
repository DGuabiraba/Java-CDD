package aula04;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos: ");
		int tamanho = sc.nextInt();
		float array[] = new float [tamanho];
		
	    for (int i = 0; i < tamanho; i++) {
	    	 System.out.print("Digite a primeira nota " + i+1 + ": ");
	            array[i] = sc.nextFloat();
			
		}
	    sc.close();
	    float soma =0 ;
	    for (int j = 0; j < array.length; j++) {
	    	
	    	soma += array[j];
			
		}
	    
	    soma /= array.length;
		
		
		System.out.println(soma);
	}

}
