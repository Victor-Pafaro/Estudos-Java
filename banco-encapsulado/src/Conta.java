

public class Conta {
	
	 private double saldo;
	 private int agencia;
	 private int numero;
	 private Cliente titular;
	 private static int total;
	 
	 public Conta(int agencia, int numero) {
		 if(agencia<= 0) {
			 System.out.println("Só numeros positivos");
			 return;
		 }
		 Conta.total++;
		 this.agencia = agencia;
		 this.numero = numero;
		 System.out.println("Agora temos "+ total + " Contas");
	 }
	 
	 public void deposita(double valor) {
		 this.saldo += valor;
	 }
	 
	 public boolean saca(double valor) {
		 if(this.saldo >= valor) {
			 this.saldo -= valor;
			 return true;
		 }else {
			 return false;
		 }
	 }
	 
	 public boolean transfere(double valor, Conta destino) {
		 if(this.saldo>=valor) {
			 this.saldo-=valor;
			 destino.saldo+=valor; // ou podiamos fazer destino.depoisita(valor);
			 return true;
		 }else {
			 return false;
		 }
	 }
	 
	 // Métodos Getters e Setters
	 
	 public double getSaldo() {
		 return this.saldo;
	 }
	 
	 public int getAgencia() {
		 return this.agencia;
	 }
	 
	 public int getNumero() {
		 return this.numero;
	 }
	 
	 public Cliente getTitular() {
		 return this.titular;
	 }
	 
	 public void setAgencia(int agencia) {
		 this.agencia = agencia;
	 }
	 
	 public void setNumero(int numero) {
		 this.numero = numero;
	 }
	 
	 public void setTitular(Cliente titular) {
		 this.titular = titular;
	 }
	 

	 
}
