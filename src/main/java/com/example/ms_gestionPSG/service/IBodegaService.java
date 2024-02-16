package com.example.ms_gestionPSG.service;

import java.util.List;

import com.example.ms_gestionPSG.model.Bodega;

public interface IBodegaService {

	public List<Bodega> listarBodegas();
	public Bodega obtenerBodegaId(Integer id);

}
