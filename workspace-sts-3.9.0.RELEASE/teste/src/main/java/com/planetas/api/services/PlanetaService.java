package com.planetas.api.services;

import java.util.List;

import com.planetas.api.documents.Planeta;

public interface PlanetaService {

	
	List<Planeta> listarTodos();
	
	Planeta listarPorId(String id);
	
	Planeta cadastrar(Planeta planeta);
	
	Planeta atualizar(Planeta planeta);
	
	void remover(String id);
}
