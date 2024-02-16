package com.example.ms_gestionPSG.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_gestionPSG.dto.GuiaDetalleDTO;
import com.example.ms_gestionPSG.model.Guia_Detalle;
import com.example.ms_gestionPSG.repository.IGuiaDetalleRepository;
import com.example.ms_gestionPSG.service.IGuiaDetalleService;
import com.example.ms_gestionPSG.service.IGuiaService;

@Service
public class GuiaDetalleServiceImpl implements IGuiaDetalleService {

	@Autowired
	private IGuiaDetalleRepository repo;
	
	@Autowired
	private IGuiaService guiaser;

	@Override
	public List<Guia_Detalle> obtenerdeatlleGuia() {
		
		return repo.findAll();
	}

	@Override
	public void crearGuiaDetalle(GuiaDetalleDTO nuevo) {
		Guia_Detalle entidad=mapearGuiaDTO(nuevo);
		repo.save(entidad);
		
	}

	@Override
	public Guia_Detalle mapearGuiaDTO(GuiaDetalleDTO dto) {
		
		Guia_Detalle entidadDto= new Guia_Detalle();
		entidadDto.setEsfragil(true);
		entidadDto.setProducto(dto.getProducto());
		entidadDto.setItems(dto.getItems());
		entidadDto.setFkguia(guiaser.obtenerGuiaId(dto.getIdGuia()));

		return entidadDto;
	}

}
