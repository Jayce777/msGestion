package com.example.ms_gestionPSG.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_gestionPSG.model.Ruta;
import com.example.ms_gestionPSG.repository.IRutaRepository;
import com.example.ms_gestionPSG.service.IRutaService;

@Service
public class RutaServiceImpl implements IRutaService {

	@Autowired
	private IRutaRepository repo;
	
	@Override
	public Ruta obtenerRutaId(Integer id) {
		
		return repo.findById(id).get();
	}

}
