
public class TestaGetESet {
	public static void main(String[] args) {
		Conta contaDoVito = new Conta(7165,25664-0);
		
		contaDoVito.setNumero(2428);
		
		System.out.println(contaDoVito.getNumero());
		
		contaDoVito.deposita(300);
		
		System.out.println(contaDoVito.getSaldo());
		
		contaDoVito.setAgencia(46);
		
		System.out.println(contaDoVito.getAgencia());
		
		Cliente vito = new Cliente();
		
		contaDoVito.setTitular(vito);
		
		vito.setCpf("25212224554");
		
		vito.setProfissão("Programador");
		
		contaDoVito.getTitular().setNome("Victor");
		
		System.out.println(contaDoVito.getTitular().getNome());
		
		System.out.println(contaDoVito.getTitular().getCpf());
		
		Conta riquinho = new Conta(45,5214);
	}
}
