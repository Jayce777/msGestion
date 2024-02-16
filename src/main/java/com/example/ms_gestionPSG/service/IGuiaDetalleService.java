package com.example.ms_gestionPSG.service;

import java.util.List;

import com.example.ms_gestionPSG.dto.GuiaDetalleDTO;
import com.example.ms_gestionPSG.model.Guia_Detalle;

public interface IGuiaDetalleService {

	public void crearGuiaDetalle(GuiaDetalleDTO nuevo);
	
	public List<Guia_Detalle> obtenerdeatlleGuia();
	
	public Guia_Detalle mapearGuiaDTO(GuiaDetalleDTO dto);

}
