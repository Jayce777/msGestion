package com.example.ms_gestionPSG.model;

import java.io.Serializable;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "tbl_empleado")
public class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idempledo;
	private String nombre;
	private String apellido;
	private int edad;
	private boolean estado;
	
	//@OneToMany(mappedBy = "fkempleado")
    //@JsonManagedReference 
	//private List<Guia> guias = new ArrayList<Guia>();
}
