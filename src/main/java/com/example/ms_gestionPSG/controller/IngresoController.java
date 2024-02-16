package com.example.ms_gestionPSG.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_gestionPSG.model.Ingreso;
import com.example.ms_gestionPSG.service.IIngresoService;

@RestController
@RequestMapping("/api/ingresos")
public class IngresoController {

	@Autowired
	private IIngresoService servicioIngreso;
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<Ingreso> obtenerIngresos(){
		return servicioIngreso.listarIngresos();
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.OK)
	public Ingreso insertarIngreso(@RequestBody Ingreso nuevo) {
		servicioIngreso.crearIngreso(nuevo);
		return nuevo;
	}
}
