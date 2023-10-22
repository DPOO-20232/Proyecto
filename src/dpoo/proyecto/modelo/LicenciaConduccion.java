package dpoo.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class LicenciaConduccion {
	
	private int numero;
	
	private String paisExpedicion;
	
	private LocalDate fechaVencimiento;
	
	private File imagenLicencia;

	public LicenciaConduccion(int numero, String paisExpedicion, LocalDate fechaVencimiento, File imagenLicencia) {
		super();
		this.numero = numero;
		this.paisExpedicion = paisExpedicion;
		this.fechaVencimiento = fechaVencimiento;
		this.imagenLicencia = imagenLicencia;
	}
	
	

}
