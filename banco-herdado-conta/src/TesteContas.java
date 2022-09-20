
public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111,111);
		
		ContaPoupanca cp = new ContaPoupanca(222,222);
		
		cc.deposita(100);
		
		cp.deposita(100);
		
		cc.transfere(50, cp);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		
		System.out.println("Saldo CP: " + cp.getSaldo());
		
		
	}
}
