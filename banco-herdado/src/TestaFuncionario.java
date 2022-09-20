
public class TestaFuncionario {
	public static void main(String[]args) {
		Funcionario victor = new Gerente();
		
		victor.setNome("Victor");
		
		victor.setCpf("99999999-8");
		
		victor.setSalario(2000.0);
		
		System.out.println(victor.getBonificacao());
	}
}
