package Exercicio2_1_FactoryMethod;
/**
 * 
 * @author Felipe Videira 81613656 SI3AN-MCA
 * 			
 *
 */

public class FabricaNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
