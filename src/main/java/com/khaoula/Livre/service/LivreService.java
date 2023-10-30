package com.khaoula.Livre.service;

import java.util.List;

import com.khaoula.Livre.dto.LivreDTO;
import com.khaoula.Livre.entities.Editeur;
import com.khaoula.Livre.entities.Livre;

public interface LivreService {
	LivreDTO saveLivre(LivreDTO l);
	LivreDTO getLivre(Long id);
	List<LivreDTO> getAllLivres();
	LivreDTO updateLivre(LivreDTO l);
	
	void deleteLivre(Livre l);
	void deleteLivreById(Long id);
	List<Livre> findByNomLivre(String nom);
	List<Livre> findByNomLivreContains(String nom);
	List<Livre> findByNomPrix (String nom, Double prix);
	List<Livre> findByEditeur (Editeur editeur);
	List<Livre> findByEditeurIdEd(Long id);
	List<Livre> findByOrderByNomLivreAsc();
	List<Livre> trierLivresNomsPrix();
	LivreDTO convertEntityToDto (Livre livre);
	
	Livre convertDtoToEntity(LivreDTO livreDto);

}
