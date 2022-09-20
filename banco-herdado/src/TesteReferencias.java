
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setSalario(3000);
		
		EditorVideo e1 = new EditorVideo();
		
		e1.setSalario(1000);
		
		Designer d1 = new Designer();
		
		ControleBonificacao controle = new ControleBonificacao();
		

		controle.registra(g1);
		controle.registra(e1);
		controle.registra(d1);
		
		System.out.println("Soma das bonificacoes dos funcionarios" + controle.getSoma());
		
		
		
		
	}
}
