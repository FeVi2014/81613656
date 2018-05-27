package Exercicio4_2;

import java.util.List;
/**
 * 
 * @author Felipe Videira 81613656 SI3AN-MCA
 * 			
 *
 */
public class SomadorExistente {
	/** Soma uma lista de inteiros. */
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista)
			resultado += i;
		return resultado;
	}
}
