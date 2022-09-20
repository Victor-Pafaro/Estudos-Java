
public class TestaReferenciaDireta {
	public static void main(String[] args) {
		Conta contaDoVito = new Conta();
		
		contaDoVito.titular = new Cliente();
		
		System.out.println(contaDoVito.titular);
		
		contaDoVito.titular.nome = "Vito Pafaro";
		
		System.out.println(contaDoVito.titular.nome);
		
	}
}
