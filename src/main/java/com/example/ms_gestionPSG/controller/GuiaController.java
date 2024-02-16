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

import com.example.ms_gestionPSG.dto.GuiaDTO;
import com.example.ms_gestionPSG.model.Guia;
import com.example.ms_gestionPSG.service.IGuiaService;

@RestController
@RequestMapping("/api/guias")

public class GuiaController {

	@Autowired
	private IGuiaService guia;

	@PostMapping
	@ResponseStatus(code = HttpStatus.OK)
	public void nuevaGuia(@RequestBody GuiaDTO nuevo) {
		 guia.crearGuia(nuevo);
	}

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<Guia> obtenerGuias() {
		return guia.listarGuias();
	}
}
