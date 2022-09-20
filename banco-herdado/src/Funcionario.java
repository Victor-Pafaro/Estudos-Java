// Não pode instânciar objetos dessa classe, pois é abstract.
public abstract class Funcionario { // Abstract = Que é conceitual.
	private String nome;
	private String cpf;
	private double salario;
	
	//método sem corpo, não há implementação pois é abstract.
	public abstract double getBonificacao();
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
