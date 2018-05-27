package Exercicio7_1;
/**
 * 
 * @author Felipe Videira 81613656 SI3AN-MCA
 * 			
 *
 */
public class ManipuladorMinusculo extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string.toLowerCase();
	}
}
