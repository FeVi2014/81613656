package Exercicio2_2_FactoryMethod;

/**
 * 
 * @author Felipe Videira 81613656SI3AN-MCA
 * 			
 *
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FabricaTexto {
	public Texto getTexto(String texto){
		return new ProvedorInformacao(texto);
	}
	
	public void publico(String texto) {
		try {
		      PrintStream out = new PrintStream(new FileOutputStream("publico.txt"));
		 
		        out.println(" Estas informa��es s�o p�blicas. Todo mundo pode ver este arquivo.\n - " + texto);

		      out.close();

		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }
		System.out.printf("Sucesso");
	}
	
	public void confidencial(String texto) {
		try {
		      PrintStream out = new PrintStream(new FileOutputStream("confidencial.txt"));
		 
		        out.println(" Estas informa��es s�o confidenciais,\n o que significa que provavelmente s� voc� sabe a senha.\n - " + texto);

		      out.close();

		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }
		System.out.printf("Sucesso");
	}
}
