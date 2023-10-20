package dpoo.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Cliente {
	
	private String nombres;
	
	private String datosContacto;
	
	private Date fechaNacimiento;
	
	private String nacionalidad;
	
	private File imagenDocumento;
	
	public ArrayList<LicenciaConduccion> datosLicencia = new ArrayList<>();
	
	public ArrayList<Renta> rentas = new ArrayList<>();
	

}
