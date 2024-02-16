package com.example.ms_gestionPSG.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_gestionPSG.dto.GuiaDTO;
import com.example.ms_gestionPSG.model.Guia;
import com.example.ms_gestionPSG.repository.IGuiaRepository;
import com.example.ms_gestionPSG.service.IBodegaService;
import com.example.ms_gestionPSG.service.IEmpleadoService;
import com.example.ms_gestionPSG.service.IGuiaService;
import com.example.ms_gestionPSG.service.IRutaService;

@Service
public class GuiaServiceImpl implements IGuiaService {

	@Autowired
	private IGuiaRepository repo;
	
	@Autowired
	private IRutaService ruta;
	
	@Autowired
	private IBodegaService bodega;

	@Autowired
	private IEmpleadoService empl;
	
	@Override
	public void crearGuia(GuiaDTO nuevo) {

		Guia entidad = mapearGuiaDTO(nuevo);
		 repo.save(entidad);
	}

	@Override
	public Guia mapearGuiaDTO(GuiaDTO dto) {
		// LocalDate myObj = LocalDate.now();
		  Guia guiaEntidad = new Guia();
		guiaEntidad.setCantidad(dto.getCantidad());
		guiaEntidad.setEstado("A");
		guiaEntidad.setNumeroGuia(dto.getNumeroGuia());
		guiaEntidad.setPesoTotal(dto.getPesoTotal());
		guiaEntidad.setFkempleado(empl.obtenerEmpleadoId(dto.getIdEmpleado()));
		guiaEntidad.setFkbodega(bodega.obtenerBodegaId(dto.getIdBodega()));
		guiaEntidad.setFkruta(ruta.obtenerRutaId(dto.getIdRuta()));
		//guiaEntidad.setFecha(myObj.date);
		return guiaEntidad;
	}

	@Override
	public List<Guia> listarGuias() {
		return repo.findAll();

	}

	@Override
	public Guia obtenerGuiaId(Integer Id) {
		
		return repo.findById(Id).get();
	}

}
