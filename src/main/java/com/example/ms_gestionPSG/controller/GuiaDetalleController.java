package com.example.ms_gestionPSG.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_gestionPSG.dto.GuiaDetalleDTO;
import com.example.ms_gestionPSG.model.Guia_Detalle;
import com.example.ms_gestionPSG.service.IGuiaDetalleService;

@RestController
@RequestMapping("/api/guiadetalle")

public class GuiaDetalleController {

	
	@Autowired
	private IGuiaDetalleService repo;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.OK)
	public void insertardetalleguia(@RequestBody GuiaDetalleDTO nuevo) {
		 repo.crearGuiaDetalle(nuevo);
	}
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<Guia_Detalle> obtenerdetallesGuia() {
		return repo.obtenerdeatlleGuia();
	}
}
