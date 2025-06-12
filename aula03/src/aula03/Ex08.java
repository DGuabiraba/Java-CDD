package aula03;

public class Ex08 {
	public static void main(String[] args) {
		int multTres = 0;
		int multCinco = 0;
	
		for (int i = 1; i <= 20; i++) {
			if (i % 3 ==0) {
				multTres += i;
				
			}
			if (i % 5 ==0) {
				multCinco += i;
				
			}
			
		}
		int total = multTres + multCinco;
		System.out.println(multTres);
		System.out.println(multCinco);
		System.out.println(total);
		
	}

}
