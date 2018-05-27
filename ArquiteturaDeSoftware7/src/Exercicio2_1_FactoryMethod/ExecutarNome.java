package Exercicio2_1_FactoryMethod;

/**
 * 
 * @author Felipe Videira 81613656 SI3AN-MCA
 * 			
 *
 */

public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Jessica";
		String sobrenome = "Alexandre";
		
		fn.getNome(nome, sobrenome);

	}

}