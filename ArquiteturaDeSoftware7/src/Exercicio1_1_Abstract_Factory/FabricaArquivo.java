package Exercicio1_1_Abstract_Factory;
/**
 * 
 * @author Felipe Videira 81613656 SI3AN-MCA
 * 			
 *
 */

//Fabrica de impress�o no arquivo Abstrato
public class FabricaArquivo implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoArquivo("output.txt");

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
