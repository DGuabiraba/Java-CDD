package heranca;

public class Cavalo extends Animal {
	
	public Cavalo(String nome) {
		super(nome);
	
		
	}
	public void Comer(String comida) {
		
		System.out.printf("%s está comendo %s",this.nome, comida);
	}

}
