package com.example.ms_gestionPSG.service;

import java.util.List;

import com.example.ms_gestionPSG.model.Ingreso;

public interface IIngresoService {

	public void crearIngreso(Ingreso nuevo);
	
	public List<Ingreso> listarIngresos();
}
