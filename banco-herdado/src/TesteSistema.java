
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2428);
		
		Administrador adm = new Administrador();
		adm.setSenha(2423);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2428);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
	}

}
