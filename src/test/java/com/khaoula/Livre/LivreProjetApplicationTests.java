package com.khaoula.Livre;


import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.khaoula.Livre.entities.Editeur;
import com.khaoula.Livre.entities.Livre;
import com.khaoula.Livre.repos.LivreRepository;

@SpringBootTest
class LivreProjetApplicationTests {

	@Autowired
	private LivreRepository livreRepository;
	
	@Test
	public void testCreateLivre() {
	Livre lvre = new Livre("PC Dell",2200.500,new Date());
	livreRepository.save(lvre);
	}
	
	@Test
	public void testFindLivre()
	{
	Livre l = livreRepository.findById(1L).get();
	System.out.println(l);
	}
	
	@Test
	public void testUpdateLivre()
	{
	Livre l = livreRepository.findById(1L).get();
	l.setPrixLivre(1000.0);
	livreRepository.save(l);
	}

	@Test
	public void testDeleteLivre()
	{
	livreRepository.deleteById(1L);;
	}
	

	@Test
	public void testListerTousLivres()
	{
	List<Livre> lvres = livreRepository.findAll();
	for (Livre l : lvres)
	{
	System.out.println(l);
	}
	}
	
	@Test
	public void testFindByNomLivre()
	{
	List<Livre> lvres = livreRepository.findByNomLivre("PC Dell");
	for (Livre l : lvres)
	{
	System.out.println(l);
	}
	}
	
	@Test
	public void testFindByNomLivreContains ()
	{
	List<Livre> lvres=livreRepository.findByNomLivreContains("iphone");
	for (Livre l : lvres)
	{
	System.out.println(l);
	} }
	
	@Test
	public void testfindByNomPrix()
	{
	List<Livre> lvres = livreRepository.findByNomPrix("PC Dell", 2200.500);
	for (Livre l : lvres)
	{
	System.out.println(l);
	}
	}
	
	@Test
	public void findByEditeurIdEd()
	{
	List<Livre> lvres = livreRepository.findByEditeurIdEd(1L);
	for (Livre l : lvres)
	{
	System.out.println(l);
	}
	 }
	
	@Test
	public void testfindByEditeur()
	{
	Editeur ed = new Editeur();
	ed.setIdEd(1L);
	List<Livre> lvres = livreRepository.findByEditeur(ed);
	for (Livre l : lvres)
	{
	System.out.println(l);
	}
	}

	@Test
	public void testfindByOrderByNomLivreAsc()
	{
	List<Livre> lvres =
	livreRepository.findByOrderByNomLivreAsc();
	for (Livre l : lvres)
	{
	System.out.println(l);
	}
	}
	
	@Test
	public void testTrierLivresNomsPrix()
	{
	List<Livre> lvres = livreRepository.trierLivresNomsPrix();
	for (Livre l : lvres)
	{
	System.out.println(l);
	}
	}


}
