package com.example.ms_gestionPSG.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_gestionPSG.model.Empleado;
import com.example.ms_gestionPSG.repository.IEmpleadoRepository;
import com.example.ms_gestionPSG.service.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepository emp;
	
	@Override
	public Empleado obtenerEmpleadoId(Integer id) {
		
		return emp.findById(id).get();
	}

}
