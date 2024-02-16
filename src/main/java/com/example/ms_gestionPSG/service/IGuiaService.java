package com.example.ms_gestionPSG.service;

import java.util.List;

import com.example.ms_gestionPSG.dto.GuiaDTO;
import com.example.ms_gestionPSG.model.Guia;

public interface IGuiaService {

	public List<Guia> listarGuias();
	
	public void crearGuia(GuiaDTO nuevo);
	
	public Guia mapearGuiaDTO(GuiaDTO dto);
	
	public Guia obtenerGuiaId(Integer Id);
}
