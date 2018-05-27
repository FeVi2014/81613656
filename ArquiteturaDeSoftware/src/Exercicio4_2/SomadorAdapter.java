package Exercicio4_2;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Felipe Videira 81613656 SI3AN-MCA
 * 			
 *
 */
public class SomadorAdapter implements SomadorEsperado {
	/** Somador existente. */
	private static SomadorExistente somador = new SomadorExistente();

	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < vetor.length; i++)
			lista.add(vetor[i]);
		return somador.somaLista(lista);
	}
}
