package com.example.ms_gestionPSG.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms_gestionPSG.model.Empleado;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {

}
