
public class Gerente extends Funcionario implements Autenticavel { //Herda da classe funcionario todos os atributos e métodos, e implementa/assina a interface Autenticavel.
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	//Reescrita de método da classe mãe
	public double getBonificacao() {
		System.out.println("Bonificacao gerente");
		return super.getSalario();
	}
	
	// Composicao = reutilização dos métods da classe AutenticacaoUtil
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int numero) {
		return this.autenticador.autentica(numero);
	}
}
