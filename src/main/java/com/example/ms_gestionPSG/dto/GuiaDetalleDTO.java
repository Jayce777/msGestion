package com.example.ms_gestionPSG.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class GuiaDetalleDTO {

	private String producto;
	private int items;
	private boolean esfragil;
	
	private int idGuia;
}
