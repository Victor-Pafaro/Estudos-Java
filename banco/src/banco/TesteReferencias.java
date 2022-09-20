package banco;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta " + primeiraConta.saldo);
		
		
		// Referencia: os objetos são ponteiros/flechas 
		// que apontam para um endereço de memória, ao atribuir
		// um objeto a outro eu estou dizendo que os 2 objetos irão 
		// apontar para um mesmo endereço de memória.
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta " + segundaConta.saldo);
		
		System.out.println();
		
		segundaConta.saldo+=100;
		System.out.println("Saldo da segunda conta " + segundaConta.saldo);
		
		System.out.println("Saldo da primeira conta " + primeiraConta.saldo);
		System.out.println();
		
		if(primeiraConta == segundaConta) {
			System.out.println("Tem o mesmo endereco de memoria");
		}
		System.out.println();
		
		// Mostrando os endereços de memória dos objetos:
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
