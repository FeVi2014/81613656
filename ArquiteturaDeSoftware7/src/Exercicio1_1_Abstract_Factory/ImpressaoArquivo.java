package Exercicio1_1_Abstract_Factory;

 /**
 * 
 * @author Felipe Videira 81613656 SI3AN-MCA
 * 			
 *
 */
import java.io.File;
import java.io.PrintWriter;

//Impress�o em arquivo
public class ImpressaoArquivo implements Impressao {
	// Arquivo que ser� imprimido
	private File arquivo;

	//Construtor
	public ImpressaoArquivo(String nomeArquivo) {
		this.arquivo = new File(nomeArquivo);
	}

	public void imprimir(String string) {
		// Tenta criar um novo arquivo e imprimir nele.
		try {
			arquivo.createNewFile();
			PrintWriter writer = new PrintWriter(arquivo);
			writer.print(string);
			writer.close();

			// Avisa que tudo correu bem.
			System.out.println("Verifique arquivo: " + arquivo.getCanonicalPath());
		}

		// Caso ocorra algum problema
		catch (Exception e) {
			System.out.println("N�o foi possivel criar o arquivo output.txt");
		}
	}

}
