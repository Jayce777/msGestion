package com.example.ms_gestionPSG.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_gestionPSG.model.Bodega;
import com.example.ms_gestionPSG.repository.IBodegaRepository;
import com.example.ms_gestionPSG.service.IBodegaService;

@Service
public class BodegaServiceImpl implements IBodegaService {

	@Autowired
	private IBodegaRepository repo;
	
	@Override
	public List<Bodega> listarBodegas() {
		
		return repo.findAll();
	}

	@Override
	public Bodega obtenerBodegaId(Integer id) {
		
		return repo.findById(id).get();
	}

}
