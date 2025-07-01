package heranca;

public class Professor extends Pessoa {
	public Professor(String nome, String cpf, String telefone, double salario, String disciplina) {
		super(nome,cpf,telefone);
		this.salario = salario;
		this.disciplina = disciplina;
	}
	public double salario;
	public String disciplina;

}
