package poo;

public class Pessoa {
	public String nome ;
	public int idade ;
	public String comida ;
	public String genero;

	public void comer() {
		
		System.out.printf("%s, tem %d anos e começou a comer %s",nome,idade,comida);
		
	}
	public void exibirAtributos() {
		System.out.printf("Nome: %S \nn"
				+ "Idade: %d \n"
				+ "Comida: %s \n"
				+ "Genero: %s ",nome,idade,comida,genero);
		
	}
	

}
