
public class MultiplosDeTres {
	//Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
	public static void main(String[] args) {
		
		for(int multiplos = 1;multiplos < 100; multiplos++) {
			if(multiplos%3==0) {
				System.out.println(multiplos);
			}
		}
		
	}
}
