package dpoo.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Cliente {
	
	private String nombres;
	
	private String datosContacto;
	
	private LocalDate fechaNacimiento;
	
	private String nacionalidad;
	
	private File imagenDocumento;
	
	public LicenciaConduccion datosLicencia;
	
	public ArrayList<Renta> rentas = new ArrayList<>();

	public Cliente(String nombres, String datosContacto, LocalDate fechaNacimiento, String nacionalidad,
			File imagenDocumento, LicenciaConduccion datosLicencia, ArrayList<Renta> rentas) {
		
		this.nombres = nombres;
		this.datosContacto = datosContacto;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.imagenDocumento = imagenDocumento;
		this.datosLicencia = datosLicencia;
		this.rentas = rentas;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDatosContacto() {
		return datosContacto;
	}

	public void setDatosContacto(String datosContacto) {
		this.datosContacto = datosContacto;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public File getImagenDocumento() {
		return imagenDocumento;
	}

	public void setImagenDocumento(File imagenDocumento) {
		this.imagenDocumento = imagenDocumento;
	}

	public LicenciaConduccion getDatosLicencia() {
		return datosLicencia;
	}

	public void setDatosLicencia(LicenciaConduccion datosLicencia) {
		this.datosLicencia = datosLicencia;
	}

	public ArrayList<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(ArrayList<Renta> rentas) {
		this.rentas = rentas;
	}
	
	public void agregarRenta(Renta renta) {
        rentas.add(renta);
    }
	
	public void eliminarRenta(Renta renta) {
        rentas.remove(renta);
    }
	

}
