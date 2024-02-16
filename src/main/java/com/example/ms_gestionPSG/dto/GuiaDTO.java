package com.example.ms_gestionPSG.dto;





import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class GuiaDTO {

	private String responsable;
	private String numeroGuia;
	private double pesoTotal;
	private int cantidad;
	private String estado;
	
	private int idRuta;
	private int idEmpleado;

	private int idBodega;
}
