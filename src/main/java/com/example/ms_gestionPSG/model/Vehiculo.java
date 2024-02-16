package com.example.ms_gestionPSG.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "tbl_vehiculo")
public class Vehiculo implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idvehiculo;
	private String marca;
	private String tipo;
	private String encargado;
	private double toneladas;
	private boolean enServicio;

	
	@OneToMany(mappedBy = "fkvehiculo")
    @JsonManagedReference 
	private List<Ruta> rutas = new ArrayList<Ruta>();

}
