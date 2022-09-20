
public class TestaGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente(); 
		
		g1.setNome("Vitoo");
		g1.setCpf("219912912-2");
		g1.setSalario(3000);
		g1.setSenha(1432);
		
		System.out.println(g1.getNome());
		
		System.out.println(g1.autentica(1432));
		
		System.out.println(g1.getBonificacao());
	}
}
