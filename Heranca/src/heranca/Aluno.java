package heranca;

public class Aluno extends Pessoa {
	public Aluno(String nome, String cpf, String telefone, String matricula) {
		super(nome,cpf,telefone);
		this.matricula = matricula;
	}
	public String matricula;
	
}
