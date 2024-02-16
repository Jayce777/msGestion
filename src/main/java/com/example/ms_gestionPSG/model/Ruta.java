package com.example.ms_gestionPSG.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "tbl_ruta")
public class Ruta implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idruta;
	private String ruta;
	private int numeroAyudantes;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "fkvehiculo")
	@JsonBackReference
	private Vehiculo fkvehiculo;
	
	
	//@OneToMany(mappedBy = "fkruta")
    //@JsonManagedReference 
	//private List<Guia> guias = new ArrayList<Guia>();
}
