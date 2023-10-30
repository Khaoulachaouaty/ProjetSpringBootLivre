package com.khaoula.Livre.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.khaoula.Livre.entities.Editeur;
import com.khaoula.Livre.repos.EditeurRepository;

@RestController
@RequestMapping("/api/ed")
@CrossOrigin("*")
public class EditeurRestController {
	@Autowired
	EditeurRepository editeurRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Editeur> getAllEditeurs()
	{
	return editeurRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Editeur getEditeurById(@PathVariable("id") Long id) {
	return editeurRepository.findById(id).get();
	}
}
