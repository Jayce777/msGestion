package com.example.ms_gestionPSG.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
@Entity(name = "tbl_guia")
public class Guia  implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idguia;
	private Date fecha;
	private String numeroGuia;
	private double pesoTotal;
	private int cantidad;
	private String estado;
	
	//@OneToMany(mappedBy = "fkguia")
	//private List<Guia_Detalle> gdetalles=new ArrayList<Guia_Detalle>();
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "fkruta")
	//@JsonBackReference
	private Ruta fkruta;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "fkbodega")
	//@JsonBackReference
	private Bodega fkbodega;
	
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "fkempleado")
	//@JsonBackReference
	private Empleado fkempleado;
	
}
