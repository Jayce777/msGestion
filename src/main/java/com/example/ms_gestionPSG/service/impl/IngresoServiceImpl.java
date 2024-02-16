package com.example.ms_gestionPSG.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_gestionPSG.model.Ingreso;
import com.example.ms_gestionPSG.repository.IIngresoRepository;
import com.example.ms_gestionPSG.service.IIngresoService;

@Service
public class IngresoServiceImpl implements IIngresoService {

	@Autowired
	private IIngresoRepository repoIngreso;
	
	@Override
	public void crearIngreso(Ingreso nuevo) {
		
		repoIngreso.save(nuevo)
		;
	}

	@Override
	public List<Ingreso> listarIngresos() {
		
		return repoIngreso.findAll();
	}

}
