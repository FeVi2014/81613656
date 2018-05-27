package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @author Felipe Videira 81613656 SI3AN-MCA
 * 			
 *
 */

//Fabrica de impress�o na tela
public class FabricaTela implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoTela();

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
