package br.usjt.arqsw.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.service.ChamadoService;
import br.usjt.arqsw.service.FilaService;

@RestController
public class ManterChamadosRestController {
	private ChamadoService cService;
	private FilaService fService;
	
	@Autowired
	public ManterChamadosRestController(ChamadoService cs, FilaService fs) {
		 cService = cs;
		 fService = fs;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="rest/chamados")
	public List<Chamado> listarChamados() {
		try {
			return cService .listarChamados();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="rest/chamados")
	public @ResponseEntity<Chamado> inserirChamado(@ResquestBody Chamado chamado) {
		try {
			int id = cService.novoChamado(chamado);
			chamado.setNumero(id);
			return new ResponseEntity(chamado, HttpStatus.OK);
		} catch (IOException e) {
			e.printStackTrace();
			return new ResponseEntity(chamado, HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
}
