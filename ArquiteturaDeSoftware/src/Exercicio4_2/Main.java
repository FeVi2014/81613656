package Exercicio4_2;
/**
 * 
 * @author Felipe Videira 81613656 SI3AN-MCA
 * 			
 *
 */
public class Main {
	
	public static void main(String[] args) {
		// Cria o cliente com o adaptador.
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
