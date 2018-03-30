package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqsw.dao.FilaDAO;
import br.usjt.arqsw.entity.Fila;

/**
 * 
 * @author Felipe Videira 81613656
 *
 */

public class FilaService {
	private FilaDAO dao;
	
	public FilaService() {
		dao = new FilaDAO();
	}
	public ArrayList<Fila> listarFilas() throws IOException{
				
		return dao.listarFilas();
	}
	
	
	public Fila carregar(int id) throws IOException{
		// TODO 4.3. Complete o m�todo carregar(int id) da classe FilaService 
		//que deve retornar um objeto fila com o nome e o id.
		Fila fila = dao.Carregar(id);
		
		return fila;
	}
}
