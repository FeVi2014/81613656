package Exercicio1_1_Abstract_Factory;
/**
 * 
 * @author Felipe Videira 81613656SI3AN-MCA
 * 			
 *
 */


//Impress�o na Tela
public class ImpressaoTela implements Impressao {
	
	public void imprimir(String string) {
		System.out.println(string);
	}

}
