package com.khaoula.Livre;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.khaoula.Livre.entities.Editeur;
import com.khaoula.Livre.entities.Livre;

@SpringBootApplication
public class LivreProjetApplication implements CommandLineRunner{
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(LivreProjetApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Livre.class,Editeur.class);
	}

    @Bean
    ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
}
