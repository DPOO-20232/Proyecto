package dpoo.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Categoria {
	
	private String nombre;
	
	private Double tarifaAlta;
	
	private Double tarifaBaja;
	
	public ArrayList <Vehiculo> automoviles = new ArrayList<>();

	public Categoria(String nombre, Double tarifaAlta, Double tarifaBaja) {
		
		this.nombre = nombre;
		this.tarifaAlta = tarifaAlta;
		this.tarifaBaja = tarifaBaja;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getTarifaAlta() {
		return tarifaAlta;
	}

	public void setTarifaAlta(Double tarifaAlta) {
		this.tarifaAlta = tarifaAlta;
	}

	public Double getTarifaBaja() {
		return tarifaBaja;
	}

	public void setTarifaBaja(Double tarifaBaja) {
		this.tarifaBaja = tarifaBaja;
	}

	public ArrayList<Vehiculo> getAutomoviles() {
		return automoviles;
	}

	public void setAutomoviles(ArrayList<Vehiculo> automoviles) {
		this.automoviles = automoviles;
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
        automoviles.add(vehiculo);
    }
	
	public void eliminarVehiculo(Vehiculo vehiculo) {
        automoviles.remove(vehiculo);
    }
}
