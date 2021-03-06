package com.planetas.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetas.api.documents.Planeta;
import com.planetas.api.repositories.PlanetaRepository;
import com.planetas.api.services.PlanetaService;

@Service
public class PlanetaServiceImpl implements PlanetaService {
	
	@Autowired
	private PlanetaRepository planetaRepository;
		
	public List<Planeta> listarTodos() {
		
		return this.planetaRepository.findAll();
	}

	@Override
	public Planeta listarPorId(String id) {		
		return this.planetaRepository.findOne(id);
	}

	@Override
	public Planeta cadastrar(Planeta planeta) {		
		return this.planetaRepository.save(planeta);
	}

	@Override
	public Planeta atualizar(Planeta planeta) {		
		return this.planetaRepository.save(planeta);
	}

	@Override
	public void remover(String id) {
		this.planetaRepository.deleteById(id);

	}

}
