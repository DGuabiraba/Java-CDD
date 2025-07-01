package heranca;

public class Funcionario extends Pessoa{
	public  Funcionario(String nome, String cpf, String telefone, double salario, String cargo) {
		super(nome,cpf,telefone);
		this.cargo = cargo;
		this.salario = salario;
		
	}
	public double salario;
	public String cargo;

}
