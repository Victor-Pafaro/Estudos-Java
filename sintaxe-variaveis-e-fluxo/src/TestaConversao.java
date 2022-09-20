
public class TestaConversao {

	public static void main(String[] args) {
		
		double salario = 1254.76;
		
		float pontoFlutuante = 2.71f;
		long numeroGrande = 999999999999L;
		
		int valor = (int)salario;
		
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
		
		System.out.println(valor);
		System.out.println(pontoFlutuante);
		System.out.println(numeroGrande);

	}

}
