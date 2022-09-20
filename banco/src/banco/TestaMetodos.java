package banco;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.saldo = 30;
		System.out.println("Saldo atual: " + conta.saldo);
		
		System.out.println();
		
		// Utilizando método deposita
		System.out.println("Teste do metodo deposita: ");
		conta.deposita(30);
		System.out.println("Saldo depois de deposito " + conta.saldo);
		
		System.out.println();
		
		// Utilizando meétodo saca
		System.out.println("Teste do metodo saca: ");
		conta.saca(50);
		System.out.println("Saldo depois do saque: " + conta.saldo);
		
		// Armazenando retorno do método saca 
		boolean testeDoMetodoSaca = conta.saca(10);
		
		System.out.println("Retorno do metodo saca: " + testeDoMetodoSaca);
		
		System.out.println();
		
		// Utilizando método transfere
		System.out.println("Teste do Metodo transfere:");
		
		Conta contaDoVito = new Conta();
		contaDoVito.deposita(1000);
		System.out.println("Saldo depois de deposito Vito: " + contaDoVito.saldo);
		
		Conta contaDaCarol = new Conta();
		contaDaCarol.deposita(1000);
		System.out.println("Saldo depois de deposito Carol: " + contaDaCarol.saldo);
		
		contaDoVito.transfere(500, contaDaCarol);
		
		System.out.println("Saldo depois do metodo tranfere Vito: " + contaDoVito.saldo);
		System.out.println("Saldo depois do metodo transfere Carol: " + contaDaCarol.saldo);
		

		
		
		
		
		
		
	}
}
