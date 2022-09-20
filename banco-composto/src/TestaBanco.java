
public class TestaBanco {
	public static void main(String[] args) {
		
		// Testando referência entre classes
		Cliente victor = new Cliente();
		
		victor.nome = "Victor Pafaro";
		victor.cpf = "333.333.333-33";
		victor.profissão = "Programador";
		
		Conta contaDoVictor = new Conta();
		contaDoVictor.deposita(50);
		
		// Associa  cliente victor a contaDoVictor
		contaDoVictor.titular = victor;
		
		System.out.println(contaDoVictor.titular.nome);
		System.out.println(contaDoVictor.titular);
		System.out.println(victor);
		
		
	}
}
