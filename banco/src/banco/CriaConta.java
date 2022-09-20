package banco;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo+=100;
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo + " de saldo");
		System.out.println("A segunda conta tem " + segundaConta.saldo + " de saldo");
		
		// Ao criarmos os atributos na classe, o Java automaticamente os inicializa com o valor 0;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println();
		
		if(primeiraConta == segundaConta) {
			System.out.println("As contas tem o mesmo endereço de memória");
		}else {
			System.out.println("As contas nao tem o mesmo endereco de memoria");
		}
		
		System.out.println();
		
		// Mostrando os endereços de memória:
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
