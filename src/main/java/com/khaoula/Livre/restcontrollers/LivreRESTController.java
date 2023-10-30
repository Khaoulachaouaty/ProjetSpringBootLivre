package com.khaoula.Livre.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khaoula.Livre.dto.LivreDTO;
import com.khaoula.Livre.entities.Livre;
import com.khaoula.Livre.service.LivreService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class LivreRESTController {
	@Autowired
	LivreService livreService;
	@RequestMapping(method = RequestMethod.GET)
	public List<LivreDTO> getAllLivres() {
		return livreService.getAllLivres();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public LivreDTO getProduitById(@PathVariable("id") Long id) {
		return livreService.getLivre(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public LivreDTO createLivre(@RequestBody LivreDTO livreDTO) {
		return livreService.saveLivre(livreDTO);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public LivreDTO updateLivre(@RequestBody LivreDTO livreDTO) {
		return livreService.updateLivre(livreDTO);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteLivre(@PathVariable("id") Long id)
	{
		livreService.deleteLivreById(id);
	}
	
	@RequestMapping(value="/lvresed/{idEd}",method = RequestMethod.GET)
	public List<Livre> getLiversByEdId(@PathVariable("idEd") Long idEd) {
		return livreService.findByEditeurIdEd(idEd);
	}
	
	@RequestMapping(value="/lvresByName/{nom}",method = RequestMethod.GET)
	public List<Livre> findByNomLivreContains(@PathVariable("nom") String nom) {
		return livreService.findByNomLivreContains(nom);
	}
}
